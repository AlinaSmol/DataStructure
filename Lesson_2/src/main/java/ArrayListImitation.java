import java.util.Arrays;

public class ArrayListImitation <E extends Object & Comparable<? super E>> implements Array <E> {

    private static final int DEFAULT_DIMENSION = 16;

    private E[] array;

    private int currentSize;

    public ArrayListImitation (){
        this(DEFAULT_DIMENSION);
    }

    public ArrayListImitation (int dimension){
        this.array = (E[]) new Object [dimension];
    }

    @Override
    public void addElement(E element) {
        if (currentSize == array.length){
            this.enlargeArray();
        }
        this.array[currentSize++] = element;
    }

    public void enlargeArray(){
        array = Arrays.copyOf(array, currentSize*2);
    }

    @Override
    public boolean removeElementByIndex(int index) {
        if (index > currentSize || index < 0) return false;
        for (int i = index; i < currentSize; i++){
            array[i] = array[i+1];
        }
        array[currentSize-1] = null;
        currentSize--;
        return true;
    }

    @Override
    public boolean removeElement(E element) {
        return removeElementByIndex(indexOfElement(element));
    }

    @Override
    public void sortBubble() {
        for (int i = 0; i < currentSize-1; i++){
            for (int j = 0; j < currentSize - i-1; j++){
                if (array[j].compareTo(array[j+1]) > 0) changeElements(j, j+1);
            }
        }
    }

    @Override
    public void sortSelect() {
            int marker;
            for (int i = 0; i < currentSize - 1; i++){
                marker = i;
                for (int j = i + 1; j < currentSize; j++){
                    if (array[marker].compareTo(array[j]) > 0) {
                        marker = j;
                    }
                }
                changeElements(marker, i);
            }
    }

    @Override
    public void sortInsert() {
        for (int i = 1; i < currentSize; i++){
            int j = i;
            E temp = array[i];
            while ( j > 0 && (temp.compareTo(array[j-1])) < 0 ){
                array[j] = array[j-1];
                j--;
            }
            array[j] = temp;
        }
    }

    @Override
    public boolean isContains(E element) {
        if (indexOfElement(element) != -1) return true;
        return false;
    }

    @Override
    public int indexOfElement(E element) {
        for (int i = 0; i < currentSize; i++){
            if (array[i].equals(element)) return i;
        }
        return -1;
    }

    @Override
    public E getElement(int index) {
        return this.array[index];
    }

    private void changeElements(int i1, int i2){
        E tmp;
        tmp = array[i1];
        array[i1] = array[i2];
        array[i2] = tmp;
    }
}
