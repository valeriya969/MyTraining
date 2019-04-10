package lesson12.task11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SymbolNan {
    public static void main(String[] args) {
        String text="ab f 1234 1111 2353543 jkjk fffff aaaaaaa";
        Pattern pattern=Pattern.compile("[a-z]{5,}");
        Matcher matcher=pattern.matcher(text);
        while(matcher.find()){
            System.out.println(text.substring(matcher.start(),matcher.end()));
        }
    }
}
