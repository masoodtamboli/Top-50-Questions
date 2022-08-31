package StriverSheet;

public class CountDigits {
    public static void main(String[] args) {
        int n = 1234;
        count(n);
        effCount(n);
    }

    private static void effCount(int n) {
        System.out.println(String.valueOf(n).length());
    }

    private static void count(int n) {
        int count = 0;

        while(n>0){
            count++;
            n = n / 10;
        }

        System.out.println(count);
    }
}
