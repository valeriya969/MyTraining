package lesson8.task5;

public class Dog extends Animal {
    private String training;

    public Dog(String food, String location, String training ) {
        super(food, location);
        this.training = training;
    }

    public String getTraining() {
        return training;
    }

    public void makeNoise(){
        System.out.println("Dog make rrrr");
    }

    public void eat(){
        System.out.println("Dog eat");
    }

    public void sleep(){
        System.out.println("Dog sleep");
    }


}
