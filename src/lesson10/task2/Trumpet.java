package lesson10.task2;

public class Trumpet implements Instrument {
    private int diametr;

    public Trumpet(int diametr) {
        this.diametr = diametr;
    }

    public int getDiametr() {
        return diametr;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }

    @Override
    public void play() {
        System.out.println("Trumpet with diametr of "+getDiametr()+" is playing");
    }
}
