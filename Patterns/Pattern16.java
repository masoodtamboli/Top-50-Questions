package Patterns;

public class Pattern16 {
    public static void main(String[] args) {
        int row=5;
        for(int i=0; i<row; i++){
            for(int j=0; j<=i; j++){
                System.out.print((char)(65+i));
            }
            System.out.println();
        }
    }
}
