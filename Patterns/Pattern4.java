package Patterns;

/*
 *
 *      1
 *      22
 *      333
 *      4444
 *      55555
 * 
 */

public class Pattern4 {
    public static void main(String[] args) {
        int row = 5;
        for(int i=0; i<row; i++){
            for(int j=0; j<=i; j++){
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
}
