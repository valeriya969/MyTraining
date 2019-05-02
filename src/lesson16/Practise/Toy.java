package lesson16.Practise;

public class Toy {
    private String name;
    private int cost;

    public Toy(String name, int cost) {
        this(name);
        this.cost = cost;
    }

    public Toy(String name) {
        this.name = name;
    }

    public Toy() {
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}



