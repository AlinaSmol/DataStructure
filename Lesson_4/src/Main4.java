import linkedlist.LinkedList;
import linkedlist.LinkedStackImpl;
import linkedlist.SimpleLinkedListImpl;
import linkedlist.twoside.LinkedQueueImpl;
import queue.Queue;
import stack.Stack;

public class Main4 {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new SimpleLinkedListImpl<>();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);

        linkedList.remove(3);
        linkedList.remove(333);

        linkedList.display();

        System.out.println("Find 2 = " + linkedList.find(2));
        System.out.println("Find 222 = " + linkedList.find(222));

        linkedList.remove();
        linkedList.remove();

        linkedList.display();

        //Тестирование методов классов Стека и Очереди

        //Стек
        Stack<Integer> newStack = new LinkedStackImpl<Integer>();
        newStack.push(1);//1
        newStack.push(2);//12
        newStack.push(3);//123
        newStack.push(4);//1234
        System.out.println("первый элемент " + newStack.peek());//4
        System.out.println("Стек пустой: " + newStack.isEmpty());//false
        int sizeSt = newStack.size();
        for (int i = 1; i <= sizeSt; i++){
            System.out.println(newStack.pop());//4321
        }
        System.out.println("------------------");

        //Связанный список
        Queue<Integer> newQueue = new LinkedQueueImpl<>();
        newQueue.insert(1);//1
        newQueue.insert(2);//12
        newQueue.insert(3);//123
        newQueue.insert(4);//1234
        newQueue.remove();//234
        System.out.println("первый элемент " + newQueue.peek());//2
        System.out.println("Очередь пустая: " + newQueue.isEmpty()); //false
        int sizeQu = newQueue.size();
        for (int i = 1; i <= sizeQu; i++){
            System.out.println(newQueue.remove()); //234
        }
    }
}
