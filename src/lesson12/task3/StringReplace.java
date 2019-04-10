package lesson12.task3;

public class StringReplace {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Object-oriented programming is a programming language model" +
                " organized around objects rather than \"actions\" and data rather than logic." +
                " Object-oriented programming blabla. Object-oriented programming bla.");
        System.out.println(stringReplace(str,"Object-oriented programming","OOP"));
    }

    private static StringBuilder stringReplace(StringBuilder stringBuilder, String replaceString, String replaceWith){
        int pos;
        int pos1=0;
        int i=1;
        while ((pos=stringBuilder.indexOf(replaceString,pos1))!=-1){
            if (i % 2 == 0) {
                stringBuilder.replace(pos,pos + replaceString.length(), replaceWith);
            }
            pos1=pos + replaceString.length();
            i++;
        }
        return stringBuilder;
    }
}
