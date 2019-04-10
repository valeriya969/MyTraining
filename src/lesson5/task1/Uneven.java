package lesson5.task1;

public class Uneven {
    public static void main(String[] args) {



        for (int i = 0; i < args.length; i++) {
                String arg = args[i];
            int a = Integer.parseInt(arg);
            if (a%2!=0){
                System.out.println(a+"-нечетное число");
            }

            }
        System.out.println();

        for (String arg : args) {
            int a = Integer.parseInt(arg);
            if (a%2!=0){
                System.out.println(a+"-нечетное число");
            }
        }

    }
}
