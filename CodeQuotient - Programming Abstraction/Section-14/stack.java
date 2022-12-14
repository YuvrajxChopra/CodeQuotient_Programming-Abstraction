/*
Implement a Stack using two Queues

Stack and Queues are two popular data structures. Can we implement one of them given the other?

In this question, given two queues you have to implement a stack using them. In other words, you are allowed to do insert and delete on these two queues only, but the effect outside must come as a LIFO list (stack).
*/


class NewStack {
    void push(QueueArray qa1, QueueArray qa2, int item) {
           if(qa1.SIZE == 0){
        qa1.enqueue(item);
      }else{
        int n = qa1.rear;
        for(int i = 0; i<n; i++){
          qa2.enqueue(qa1.dequeue());
        }
        qa1.enqueue(item);
        for(int j = 0; j<n; j++){
          qa1.enqueue(qa2.dequeue());
        }
      }
    }
    int pop(QueueArray qa1, QueueArray qa2) {
              int temp = qa1.dequeue();
      return temp;
    }
  }