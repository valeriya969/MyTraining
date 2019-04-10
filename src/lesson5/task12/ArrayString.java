package lesson5.task12;

public class ArrayString {
    public static void main(String[] args) {
        String[][] abc = new String[3][6];
        for (int i = 0; i<3; i++) {
            for (int j = 0; j<6; j++){
                if (i==0){
                       abc[i][j]="a"+(j+1)+" ";
                        System.out.print(abc[i][j]);
                }
                if (i==1) {
                    abc[i][j]="b"+(j+1)+" ";
                    System.out.print(abc[i][j]);
                }
                if (i==2) {
                    abc[i][j]="c"+(j+1)+" ";
                    System.out.print(abc[i][j]);
                }
            }
            System.out.println();

        }
    }
}
