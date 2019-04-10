package lesson5.task3;

public class Week {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++){
            String a = args[i];
            int n = Integer.parseInt(a);
            if (n==1){
                System.out.println("Понедельник");
            }
            else if (n==2){
                System.out.println("Вторник");
            }
            else if (n==3){
                System.out.println("Среда");
            }
            else if (n==4){
                System.out.println("Четверг");
            }
            else if (n==5){
                System.out.println("Пятница");
            }
            else if (n==6){
                System.out.println("Выходной");
            }
            else if (n==7){
                System.out.println("Выходной");
            }




        }
    }
}
