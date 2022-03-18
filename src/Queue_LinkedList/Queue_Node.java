package Queue_LinkedList;

public class Queue_Node<T> {
    T value;
    Queue_Node next;
    Queue_Node previous;
    public Queue_Node(Queue_Node previous, T value, Queue_Node next) {
        this.previous = previous;
        this.value = value;
        this.next = next;
    }

}
