package lesson12.Practise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        Pattern pattern=Pattern.compile("c+ab");
        Matcher matcher=pattern.matcher("ccab");
        boolean b=matcher.matches();
        System.out.println(b);
    }
}
