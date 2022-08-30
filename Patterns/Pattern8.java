package Patterns;

public class Pattern8 {
    public static void main(String[] args) {
        int row = 5;

        for (int i = 1; i <= row; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = row * 2; k > (i*2)-1; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
