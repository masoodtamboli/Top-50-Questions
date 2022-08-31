package StriverSheet;

public class GCD {
    public static void main(String[] args) {
        int x = 12, y = 8;
        int gcd = 0;
        for(int i=1; i<=x && i<=8; i++){
            if(x%i ==0 || y%i==0) gcd = i;
        }
        System.out.println(gcd);
    }
}
