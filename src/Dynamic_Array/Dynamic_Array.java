package Dynamic_Array;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType;

import java.util.Arrays;

public class Dynamic_Array<T> {
    Object[] data;
    int size;
    public Dynamic_Array() {
        size = 0;
        data = new Object[1];
    }
    public T get(int index) {
        return (T)data[index];
    }
    public void set(Object element) {
        ensureCapacity(size+1);
        data[size++] = element;
    }

    private void ensureCapacity(int length) {
        if (length > data.length)
            data = Arrays.copyOf(data, (data.length*2));
    }


    public int getSize() {
        return data.length;
    }



    public void delete(int index) {
        for (int i = 0; i < data.length-1; i++) {
            if(i == index) {
                data[i] = data[(index+1)];
            }

        }

    }









}
