package task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {

       Backpack backpack = new Backpack(15);
       List<Thing> allThings = new ArrayList<Thing>(Arrays.asList(new Thing("Книга", 3, 600),
                                                                  new Thing("Бинокль", 2, 5000),
                                                                  new Thing("Аптечка", 5, 1500),
                                                                  new Thing("Ноутбук", 7, 40000),
                                                                  new Thing("Котелок", 4, 500)));

        backpack.findBest(allThings);
        for (Thing t: backpack.getBestThings()) {
            System.out.println(t.getName());
        }
        System.out.println("вес " + backpack.getMaxWeight());
        System.out.println("стоимость " + backpack.getMaxPrice());

    }


}
