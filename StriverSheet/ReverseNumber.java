package StriverSheet;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 1234;
        int temp = 0;
        int res = 0;
        while(n > 0){
            temp = n % 10;
            res = res * 10 + temp;
            n = n / 10;
        }

        System.out.println(res);
    }
}
