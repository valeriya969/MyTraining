package lesson10.task4;

public class ClothesDemo {
    public static void main(String[] args) {
        Skirt skirt1 = new Skirt("L", "blue", 25);
        Trousers trousers1 = new Trousers("M", "black", 100);
        TShirt tShirt1=new TShirt("S","pink",150);
        Tie tie1=new Tie("S","red",50);
        Clothes[] clothes={skirt1,tie1,trousers1,tShirt1};
        Atelier atelier = new Atelier(clothes);
        atelier.dressMan();
        atelier.dressWoman();








    }
}
