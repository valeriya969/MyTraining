package lesson7.Practise;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone1 = new Phone("Samsung","+455255",100);
        Phone phone2 = new Phone("LG","+45566655");
        Phone phone3 = new Phone();
        System.out.println(phone1.getModel()+ " "+phone1.getWeight()+" " + phone1.getNumber());
        System.out.println(phone2.getModel()+ " "+phone2.getWeight()+" " + phone2.getNumber());
        System.out.println(phone3.getModel()+ " "+phone3.getWeight()+" " + phone3.getNumber());
        phone1.receiveCall("Sister");
        phone2.receiveCall(" Ann", "0990998");
        System.out.println(phone2.getNumber());
        phone2.sendMessage("7889999","6089609469");
        System.out.println(Phone.getCount());
    }
}
