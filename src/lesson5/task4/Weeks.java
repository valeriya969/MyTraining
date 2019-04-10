package lesson5.task4;

public class Weeks {
    public static void main(String[] args) {
        String day = null;
        for (int i=0; i < args.length; i++){
            String a = args[i];
            int n = Integer.parseInt(a);
            switch (n){
                case 1: day = "Понедельник";
                    break;
                case 2: day = "Вторник";
                    break;
                case 3: day = "Среда";
                    break;
                case 4: day = "Четверг";
                    break;
                case 5: day = "Пятница";
                    break;
                case 6: day = "Выходной";
                    break;
                case 7: day = "Выходной";
                    break;

            }
            System.out.println(day);
        }
    }
}
