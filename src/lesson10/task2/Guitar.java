package lesson10.task2;

public class Guitar implements Instrument {
    private int stringNumber;

    public Guitar(int stringNumber) {
        this.stringNumber = stringNumber;
    }

    public int getStringNumber() {
        return stringNumber;
    }

    public void setStringNumber(int stringNumber) {
        this.stringNumber = stringNumber;
    }

    @Override
    public void play() {
        System.out.println("Guitar with "+getStringNumber()+" strings is playing");
    }
}
