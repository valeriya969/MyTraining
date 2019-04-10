package lesson10.task4;

public class Atelier implements Ladieswear,Menswear {
    Clothes[] clothes;

    public Atelier(Clothes[] clothes) {
        this.clothes = clothes;
    }

    public void setClothes(Clothes[] clothes) {
        this.clothes = clothes;
    }

    @Override
    public void dressMan() {
        for (Clothes clothes1 : clothes) {
            if (clothes1 instanceof Menswear) {
                ((Menswear) clothes1).dressMan();
            }
        }
    }
    @Override
    public void dressWoman(){
        for (Clothes clothes1:clothes) {
            if (clothes1 instanceof Ladieswear){
                ((Ladieswear) clothes1).dressWoman();
            }
        }
    }



}
