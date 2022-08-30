package Patterns;

/*
 *
 *      1
 *      01
 *      101
 *      0101
 *      10101
 * 
 */
public class Pattern11 {
    public static void main(String[] args) {
        int row = 5;
        int p;

        for(int i=0; i<row; i++){
            if(i%2 == 0) p = 1;
            else p = 0;
            for(int j=0; j<=i; j++){
                System.out.print(p);
                p = p == 0 ?  1 : 0; 
            }
            System.out.println();
        }
    }
}
