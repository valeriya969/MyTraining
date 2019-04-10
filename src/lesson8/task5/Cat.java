package lesson8.task5;

public class Cat extends Animal {
    private String claws;

    public Cat(String food, String location, String claws) {
        super(food, location);
        this.claws = claws;
    }

    public String getClaws() {
        return claws;
    }

    public void makeNoise(){
        System.out.println("Cat make meow");
    }

    public void eat(){
        System.out.println("Cat eat");
    }

    public void sleep(){
        System.out.println("Cat sleep");
    }
}
