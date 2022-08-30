package Patterns;

public class Pattern12 {
    public static void main(String[] args) {
        int row = 5;

        for(int i=1; i<=row ; i++){
            for(int k=1; k<=i; k++){
                System.out.print(k);
            }
            for(int j=0; j<(row*2)-(i*2); j++){
                System.out.print(" ");
            }
            for(int k=i; k>=1; k--){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
