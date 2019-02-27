package DeQueue;

public interface Dequeue <E> {

    void insertFront(E value);
    void insertRear(E value);

    E removeFront();
    E removeRear();

    E peekFront();
    E peekRear();

    int size();

    boolean isFull();

    boolean isEmpty();

}
