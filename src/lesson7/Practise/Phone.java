package lesson7.Practise;

public class Phone {
    private static int count;
    private String model;
    private String number;
    private double weight;

    Phone(String a, String b, double c){
        model = a;
        number = b;
        weight = c;
        count++;
    }
    Phone(String a, String b){
        model = a;
        number = b;
        count++;
    }
    Phone(){
        count++;
    }

    public static int getCount() {
        return count;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    void receiveCall(String name){

        System.out.println("Звонит "+ name);
    }
    void receiveCall(String name, String number){
        System.out.println("Звонит" + name+" "+ number);
    }
    void sendMessage(String...number){
        for (String s:number
             ) {
            System.out.println(s);
        }
    }
}
