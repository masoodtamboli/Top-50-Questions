package Patterns;

public class Pattern9 {
    public static void main(String[] args) {
        int row = 5;

        for (int i = 0; i < row; i++) {
            for (int j = 1; j < row-i; j++) {
                System.out.print(" ");
            }
            for(int k=0; k<(i*2)+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1; i<=row; i++){
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }

            for(int k=row*2; k>(i*2)-1; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
