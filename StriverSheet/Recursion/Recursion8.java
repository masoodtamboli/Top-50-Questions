package StriverSheet.Recursion;

public class Recursion8 {
    public static void main(String[] args) {
        System.out.println(fib(3));
    }

    private static int fib(int n) {
        if(n<=1) return n;

        return fib(n-1) + fib(n-2);
    }
}
