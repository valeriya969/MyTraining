package lesson8.task4;

public class Bouquet {
    public static void main(String[] args) {
        Orchid orchid1 = new Orchid("Asia",10,300,"violet","Phalenopsis");
        Orchid orchid2 = new Orchid("Asia", 15, 270, "pink", "Dendrobium");
        Orchid orchid3 = new Orchid("Asia", 15, 270, "pink", "Dendrobium");
        Orchid orchid4 = new Orchid("Asia", 15, 270, "pink", "Dendrobium");
        Tulip tulip1 = new Tulip("Netherlands", 10, 100, "red");
        Tulip tulip2 = new Tulip("Netherlands", 10, 100, "red");
        Tulip tulip3 = new Tulip("Netherlands", 10, 100, "red");
        Tulip tulip4 = new Tulip("Netherlands", 10, 100, "red");
        Pion pion1 = new Pion("Russia", 20, 150, "pink");
        Pion pion2 = new Pion("Russia", 20, 150, "pink");
        Pion pion3 = new Pion("Russia", 20, 150, "pink");
        Pion pion4 = new Pion("Russia", 20, 150, "pink");
        Flower[] bouquet1 = {orchid1, pion1, pion2};
        Flower[] bouquet2 = {orchid4, orchid2, orchid3, pion3};
        Flower[] bouquet3 = {tulip1, tulip2, tulip3, tulip4, pion4};
        orchid1.price(bouquet1);
        orchid1.price(bouquet2);
        orchid1.price(bouquet3);
        pion1.count();




    }
}
