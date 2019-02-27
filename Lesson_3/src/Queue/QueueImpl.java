package Queue;

public class QueueImpl <E> implements Queue<E> {

    public static final int DEFAULT_REAR = -1;
    public static final int DEFAULT_FRONT = 0;

    private E[] array;
    private int count;

    private int front;
    private int rear;

    public QueueImpl(int size){
        this.array = (E[]) new Object[size];
        this.count = 0;
        this.front = DEFAULT_FRONT;
        this.rear = DEFAULT_REAR;
    }

    @Override
    public void insert(E value) {
        if (rear == array.length - 1) {
            rear = DEFAULT_REAR;
        }
        array[++rear] = value;
        count++;
    }

    @Override
    public E remove() {
        E value = array[front++];
        if (front == array.length) {
            front = DEFAULT_FRONT;
        }
        count--;
        return value;
    }

    @Override
    public E peek() {
        return array[front];
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public boolean isFull() {
        return count == array.length;
    }
}
