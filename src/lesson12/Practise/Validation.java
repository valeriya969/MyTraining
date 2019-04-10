package lesson12.Practise;

public class Validation {
    public static void main(String[] args) {
        String s="I like Java!!!";
        validate(s);
        System.out.println(s.replace('a','o'));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.substring(7,11));
    }

     private static void validate(String s){
         System.out.println(s.endsWith("!!!"));
         System.out.println(s.startsWith("I like"));
         System.out.println(s.charAt(s.length()-1));
         System.out.println(s.indexOf("Java"));
     }
}
 