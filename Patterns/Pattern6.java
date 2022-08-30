package Patterns;
/*
 *
 *      12345
 *      1234
 *      123
 *      12
 *      1
 * 
 */
public class Pattern6 {
    public static void main(String[] args) {
        int row = 5;
        for(int i=0; i<row; i++){
            for(int j=0; j<row-i; j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
