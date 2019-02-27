import DeQueue.Dequeue;
import DeQueue.DequeueImpl;
import Queue.Queue;
import Queue.QueueImpl;
import Stack.Stack;
import Stack.StackImpl;

public class Main {

    public static void main(String[] args) {

        String newString= "Это строка для тестирования";

        System.out.println("Строка после стека: ");
        reverseString(newString);

        System.out.println("Строка после очереди: ");
        stringToQueue(newString);

        System.out.println("Строка после дека FIFO: ");
        stringToDeQueueFIFO(newString);

        System.out.println("Строка после дека LIFO: ");
        stringToDeQueueLIFO(newString);
    }

    private static void reverseString(String newString) {
        Stack<Character> newStack = new StackImpl<Character>(newString.length());

        for (int i = 0; i < newString.length(); i ++){
            newStack.push(newString.charAt(i));
        }

        for (int i = 0; i <newString.length(); i ++){
            System.out.print(newStack.pop());
        }
        System.out.println();
    }

    private static void stringToQueue (String newString){
        Queue<Character> newQueue = new QueueImpl<Character>(newString.length());

        for (int i = 0; i < newString.length(); i++){
            newQueue.insert(newString.charAt(i));
        }

        for (int i = 0; i < newString.length(); i++){
            System.out.print(newQueue.remove());
        }
        System.out.println();

    }

    private static void stringToDeQueueFIFO (String newString){
        Dequeue<Character> newDequeue = new DequeueImpl<Character>(newString.length());

        for (int i = 0; i < newString.length(); i++){
            newDequeue.insertRear(newString.charAt(i));
        }

        for (int i = 0; i < newString.length(); i++){
            System.out.print(newDequeue.removeFront());
        }
        System.out.println();

    }

    private static void stringToDeQueueLIFO (String newString){
        Dequeue<Character> newDequeue = new DequeueImpl<Character>(newString.length());

        for (int i = 0; i < newString.length(); i++){
            newDequeue.insertRear(newString.charAt(i));
        }

        for (int i = 0; i < newString.length(); i++){
            System.out.print(newDequeue.removeRear());
        }
        System.out.println();

    }

}
