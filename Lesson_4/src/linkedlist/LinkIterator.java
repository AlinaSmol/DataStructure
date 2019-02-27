package linkedlist;

public class LinkIterator<E> {
    private Entry<E> current;
    private Entry<E> previous;
    private SimpleLinkedListImpl list;

    public LinkIterator(SimpleLinkedListImpl list){
        this.list = list;
        this.reset();
    }

    public void reset(){
        current = list.getFirst();
        previous = null;
    }

    public boolean atEnd(){
        return (current.getNext() == null);
    }

    public void nextLink(){
        previous = current;
        current = current.getNext();
    }

    public Entry<E> getCurrent(){
        return current;
    }

    public void insertAfter(E value){
        Entry<E> newLink = new Entry<>(value);
        if (list.isEmpty()){
            list.setFirst(newLink);
            current = newLink;
            increaseSize();
        } else {
            newLink.setNext(current.getNext());
            current.setNext(newLink);
            nextLink();
            increaseSize();
        }
    }

    public void insertBefore(E value){
        Entry<E> newLink = new Entry<>(value);
        if(previous == null){
            newLink.setNext(list.getFirst());
            list.setFirst(newLink);
            reset();
            increaseSize();
        }
        else{
            newLink.setNext(previous.getNext());
            previous.setNext(newLink);
            current = newLink;
            increaseSize();
        }
    }

    public E deleteCurrent(){
        E value = current.getValue();
        if (previous == null){
            list.setFirst(current.getNext());
            reset();
        } else {
            previous.setNext(current.getNext());
            if (atEnd()){
                reset();
            } else {
                current = current.getNext();
            }
        }
        decreaseSize();
        return value;
    }

    public void increaseSize(){
        list.setSize(list.getSize()+1);
    }

    public void decreaseSize(){
        list.setSize(list.currentSize-1);
    }

}

