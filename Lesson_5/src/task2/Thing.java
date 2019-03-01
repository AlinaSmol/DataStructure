package task2;

public class Thing {

    private String Name;
    private int weight;
    private int prise;

    public Thing (String name, int weight, int prise){

        this.Name = name;
        this.weight = weight;
        this.prise = prise;
    }

    public String getName() {
        return Name;
    }

    public int getPrise() {
        return prise;
    }

    public int getWeight() {
        return weight;
    }
}
