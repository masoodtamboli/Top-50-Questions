package Patterns;

public class Pattern17 {
    public static void main(String[] args) {
        int row = 5;
        
        for (int i = 1; i <= row; i++) {
            for (int j = 0; j < row - i; j++) {
                System.out.print(" ");
            }
            int c = 64;
            for (int k = 0; k < (i * 2) - 1; k++) {
                if(k<i){
                    c++;
                    System.out.print((char)(c));
                }else{
                    c--;
                    System.out.print((char)(c));
                }
            }
            System.out.println();
        }
    }
}
