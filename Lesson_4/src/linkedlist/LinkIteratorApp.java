package linkedlist;

public class LinkIteratorApp {
    public static void main(String[] args) {

        SimpleLinkedListImpl<Integer> linkedList = new SimpleLinkedListImpl<>();
        LinkIterator itr = new LinkIterator(linkedList);

        itr.insertAfter(1);
        itr.insertBefore(2);
        itr.insertBefore(4);
        itr.insertAfter(3);
        linkedList.display();//4321

        System.out.println("Количество элементов " + linkedList.getSize());
        itr.reset();
        for(int i = 0; i < linkedList.getSize(); i++){
            System.out.println(itr.getCurrent());
            itr.nextLink();
        }

        itr.reset();
        while (!linkedList.isEmpty()){
            itr.deleteCurrent();
        }

        System.out.println("Количество элементов " + linkedList.getSize());
        linkedList.display();
    }

}
