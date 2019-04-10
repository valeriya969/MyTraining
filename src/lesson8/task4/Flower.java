package lesson8.task4;

public class Flower {
    private static int soldFlowers;
    private  String manufacturer;
    private int storageTime;
    private double price;

   public Flower(String manufacturer, int storageTime, double price){
        this.manufacturer = manufacturer;
        this.storageTime = storageTime;
        this.price = price;
        soldFlowers++;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getStorageTime() {
        return storageTime;
    }

    public double getPrice() {
        return price;
    }

    public void price(Flower[] flowers){
       double sum=0;
       for (Flower num: flowers){
           sum=sum+num.getPrice();
       }
        System.out.println("Price of bouquet is "+sum);
    }
    public void count(){
        System.out.println(soldFlowers+" flowers were sold");
    }
}
