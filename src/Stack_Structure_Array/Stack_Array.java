package Stack_Structure_Array;

public class Stack_Array<T> {
    int size;
    Object[] stackArray;
    int top;
    public Stack_Array(int size) {
        this.size = size;
        top = -1;
        stackArray = new Object[this.size];
    }

    public void push(Object item) { // Add item
        if (IsFull()) {
            System.out.println("The Stack Array is full, you don't add to this array");
            return;
        }
        top+=1;
        stackArray[top] = item;
    }
    private boolean IsFull() {
        return (top == (size-1));
    }

    public T pop() { // Delete
        if (IsEmpty()) {
            System.out.println("The array is already empty");
            return null;
        }
        T t = (T)stackArray[top];
        top-=1;
        return t;
    }
    private boolean IsEmpty() {
        return (top == -1);
    }
}
