package lesson3;

import java.util.EmptyStackException;

public class MyDeque<T> {
    private T[] list;
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private int begin = 0;
    private int end = 0;

    public MyDeque(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public MyDeque() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    //   2 3
    //   b
    //       e

    public void insertRight(T item) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        size++;
        list[end] = item;
        end = nextIndex(end);
    }

    public void insertLeft(T item) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        size++;
        begin = previousIndex(begin);
        list[begin] = item;
    }

    public T removeLeft() {
        T value = peekLeft();
        size--;
        list[begin] = null;
        begin = nextIndex(begin);
        return value;
    }

    public T removeRight() {
        T value = peekRight();
        size--;
        end = previousIndex(end);
        list[end] = null;
        return value;
    }

    public T peekLeft() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[begin];
    }

    public T peekRight() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[previousIndex(end)];
    }

    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }

    private int previousIndex(int index) { return (index - 1 + list.length) % list.length; }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == list.length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (!isEmpty()) {
            int i = begin;
            while (i != end) {
                sb.append(list[i]).append(", ");
                i = nextIndex(i);
            }
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");
        return sb.toString();
    }
}

