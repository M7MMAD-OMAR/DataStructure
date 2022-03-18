package Queue_Structure;

public class Queue_Structure<T> {
    int size;
    Object[] array;
    int rear;
    int front;
    public Queue_Structure(int size) {
        this.size = size;
        rear = -1;
        front = -1;
        array = new Object[size];
    }
    public boolean IsFull() {
        return (rear == (size-1));
    }
    public boolean IsEmpty() {
        return (front == -1 || front > rear);
    }
    public void addQue(Object element) {
        if(IsFull()) {
            System.out.println("The array is full");
            return ;
        }
        rear+=1;
        array[rear] = element;
        if (front == -1)
            front =0;
    }
    public T deQue() {
        if(IsEmpty()) {
            System.out.println("The array is empty");
            return null;
        }
        T eleOut = (T) array[front];
        front+=1;
        return eleOut;
    }


}
