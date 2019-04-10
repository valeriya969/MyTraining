package lesson12.Practise;

public class StringDemo {
    public static void main(String[] args) {
        StringBuilder str=createString(56,55);
        System.out.println(str);
        System.out.println(replaceSymbol(str,"=","равно"));
    }
    private static StringBuilder createString(int a, int b){
        StringBuilder stringBuilder = new StringBuilder(100);
        stringBuilder.append(a).append("+").append(b).append(" = ").append(a + b).append("\n");
        stringBuilder.append(a).append("-").append(b).append(" = ").append(a - b).append("\n");
        stringBuilder.append(a).append("*").append(b).append(" = ").append(a * b).append("\n");
        stringBuilder.append(a).append("/").append(b).append(" = ").append(a / b).append("\n");
        return stringBuilder;
    }

    private static StringBuilder replaceSymbol(StringBuilder stringBuilder,String replaceSymbol,String replaceWith){
        int pos;
        while ((pos=stringBuilder.indexOf(replaceSymbol))!=-1) {
            stringBuilder.replace(pos,pos+replaceSymbol.length(),replaceWith);
        }
        return stringBuilder;
    }
}
