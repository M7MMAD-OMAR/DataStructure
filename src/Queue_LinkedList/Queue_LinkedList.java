package Queue_LinkedList;

public class Queue_LinkedList<T> {
    T value;
    Queue_Node<T> rear;
    Queue_Node<T> front;
    public Queue_LinkedList(Queue_Node newQueue) {
        rear = newQueue;
        front = newQueue;
    }

    public void queue(Queue_Node item) {
        item.next = null;
        item.previous = rear;
        rear.next = item;
        rear = item;
    }

    public T deQueue() throws Exception {
        if (IsEmpty()) {

            throw new Exception("The queue array is Empty");
        }
        T value = front.value;
        front = front.next;
//        front.previous = null;
        return value;
    }

    private boolean IsEmpty() {
        return (front.value == null);
    }
}
