package Stack;

public class StackImpl<E> implements Stack<E>{

    private E[] array;
    private int count;

    public StackImpl (int size){
        this.array = (E[]) new Object[size];
        this.count = 0;
    }

    @Override
    public void push(E value) {
        this.array[count++] = value;
    }

    @Override
    public E pop() {
        return array[--count];
    }

    @Override
    public E peek() {
        return array[count - 1];
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
