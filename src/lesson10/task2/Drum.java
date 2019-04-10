package lesson10.task2;

public class Drum implements Instrument {
    private String size;

    public Drum(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println(getSize()+ " drum is plying");
    }
}
