public interface Array <E extends Comparable<? super E>> {

    void addElement (E element);

    boolean removeElementByIndex(int index);

    boolean removeElement (E element);

    void sortBubble();

    void sortSelect();

    void sortInsert();

    boolean isContains(E element);

    int indexOfElement(E element);

    E getElement(int index);

}
