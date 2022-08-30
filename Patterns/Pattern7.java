package Patterns;

/*
 *
 *        *
 *       ***
 *      *****
 *     *******
 *    *********
 * 
 */

public class Pattern7 {
    public static void main(String[] args) {
        int row = 5;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i * 2) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
