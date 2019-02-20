public class MainClass {
    public static void main(String[] args) {
        int size = 1000;
        ArrayListImitation<Integer> array = new ArrayListImitation<>(size);

        for (int i = 0; i < size; i ++){
            array.addElement((int)(Math.random()*100));
        }

        long a = System.currentTimeMillis();
        array.sortBubble();
       // array.sortSelect();
       // array.sortInsert();
        System.out.println("Время выполнения: " + (System.currentTimeMillis() - a));
    }
}
