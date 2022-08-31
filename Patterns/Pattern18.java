package Patterns;

public class Pattern18 {
    public static void main(String[] args) {
        int row = 5;
        int c = 65 + row -1;
        for(int i=0; i<row; i++){
            
            for(int j=0; j<=i; j++){
                System.out.print((char)((c - i) + j));

            }
            System.out.println();
        }
    }
}
