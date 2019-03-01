package task2;

import java.util.ArrayList;
import java.util.List;

public class Backpack {

    private int maxWeight;
    private int maxPrice;

    private List<Thing> bestThings = new ArrayList<Thing>();

    public Backpack(int maxWeight){
        this.maxWeight = maxWeight;
        bestThings = null;
    }

    public int totalWeight (List<Thing> things){
        int totalWeight = 0;
        for (Thing t: things) {
            totalWeight += t.getWeight();
        }
        return totalWeight;
    }

    public int totalPrice (List<Thing> things){
        int totalPrice = 0;
        for (Thing t: things) {
            totalPrice+=t.getPrise();
        }
        return totalPrice;
    }

    public void ifBestThings (List<Thing> things){
        if (bestThings == null){
            if (totalWeight(things) <= maxWeight){
                bestThings = things;
                maxPrice = totalPrice(things);
            }
        }
        else
        {
            if (totalWeight(things) <= maxWeight && totalPrice(things) > maxPrice){
                bestThings = things;
                maxPrice = totalPrice(things);
            }
        }
    }

    public void findBest(List<Thing> things){
        if (things.size() > 0){
            ifBestThings(things);
        }

        for(int i = 0; i < things.size(); i++){
            List<Thing> newThings = new ArrayList<Thing>(things);
            newThings.remove(i);
            findBest(newThings);
        }
    }

    public List<Thing> getBestThings(){
        return bestThings;
    }
    public int getMaxWeight(){
        return maxWeight;
    }
    public int getMaxPrice(){
        return maxPrice;
    }
}
