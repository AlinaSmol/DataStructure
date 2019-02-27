package DeQueue;

import DeQueue.Dequeue;

public class DequeueImpl<E> implements Dequeue<E> {

    public static final int DEFAULT_REAR = -1;
    public static final int DEFAULT_FRONT = 0;

    private E[] array;
    private int count;

    private int front;
    private int rear;

    public DequeueImpl(int size){
        this.array = (E[]) new Object[size];
        this.count = 0;
        this.front = DEFAULT_FRONT;
        this.rear = DEFAULT_REAR;
    }

    @Override
    public void insertFront(E value) {
        if (front == DEFAULT_FRONT){
            front = array.length;
        }
        array[--front] = value;
        count++;
    }

    @Override
    public void insertRear(E value) {
        if (rear == array.length - 1) {
            rear = DEFAULT_REAR;
        }
        array[++rear] = value;
        count++;
    }

    @Override
    public E removeFront() {
        E value = array[front++];
        if (front == array.length) {
            front = DEFAULT_FRONT;
        }
        count--;
        return value;
    }

    @Override
    public E removeRear() {
        E value = array[rear--];
        if (rear == DEFAULT_REAR){
            rear = array.length - 1;
        }
        count--;
        return value;
    }

    @Override
    public E peekFront() {
        return array[front];
    }

    @Override
    public E peekRear() {
        return array[rear];
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isFull() {
        return count == array.length;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }
}
