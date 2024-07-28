package by.tms.lesson_30_onl.ownarraylist;

public class OwnArrayList<E> {
    private final int DEFAULT_CAPACITY = 16;
    int capacity = 0;
    private int size = 0;
    private Object[] arrayData;

    public OwnArrayList() {
        arrayData = new Object[DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;
    }

    public OwnArrayList(int requestedCapacity) {
        arrayData = new Object[requestedCapacity];
        capacity = requestedCapacity;
    }

    private void expand() {
        int ii = capacity >> 1;
        capacity = capacity + ii; //capacity >> 1;
        Object[] newArray = new Object[capacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = arrayData[i];
            arrayData[i] = null;
        }
        arrayData = newArray;
        int i = 0;
    }

    public boolean add(E element) {
        if (size == capacity) {
            expand();
        }
        arrayData[size++] = element;
        return true;
    }

    public E get(int index) {
        if (index > -1 && index < size) {
            return (E) arrayData[index];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public boolean set(int index, E element) {
        if (index > -1 && index < size) {
            arrayData[index] = element;
            return true;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public E remove(int index) {
        E element = (E) arrayData[index];
        arrayData[index] = null;
        Object[] newArray = new Object[capacity];
        for (int i = 0; i < index; i++) {
            newArray[i] = arrayData[i];
            arrayData[i] = null;
        }
        for (int i = index + 1; i < capacity; i++) {
            newArray[i - 1] = arrayData[i];
            arrayData[i] = null;
        }
        arrayData = newArray;
        size--;
        return element;
    }

    public int size() {
        return size;
    }
}
