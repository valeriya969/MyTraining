package lesson8.task5;

public class Horse extends Animal {
    private String dressage;

    public Horse(String food, String location, String dressage) {
        super(food, location);
        this.dressage = dressage;
    }

    public String getDressage() {
        return dressage;
    }

    public void makeNoise(){
        System.out.println("Horse make eeee");
    }

    public void eat(){
        System.out.println("Horse eat");
    }

    public void sleep(){
        System.out.println("Horse sleep");
    }
}
