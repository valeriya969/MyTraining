package lesson12.task4;

public class EvenString {
    public static void main(String[] args) {
        returnSymbol("lolo");
        returnSymbol("string");
        returnSymbol("code");
        returnSymbol("Practise");

    }
    private static void returnSymbol(String s){
        System.out.println(s.substring(s.length()/2-1,s.length()/2+1));
    }
}
