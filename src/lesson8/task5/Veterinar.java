package lesson8.task5;

public class Veterinar {
    public static void treatAnimal(Animal animal) {
        System.out.println(animal.getFood() + " " + animal.getLocation());
    }
    public static void main(String[] args) {
        Cat cat=new Cat("fish","box1","yes");
        Dog dog=new Dog("meat","box2","no");
        Horse horse=new Horse("grass","box3","yes");
        Animal[] animals= {cat,dog,horse};
        for (Animal sd:animals){
            treatAnimal(sd);
            sd.sleep();
            sd.eat();
            sd.makeNoise();
        }
    }




}
