package StriverSheet.Recursion;

public class Recursion2 {
    public static void main(String[] args) {
        printTillN(10);
    }

    private static void printTillN(int n) {
        if(n==0) return;

        printTillN(n-1);
        System.out.println(n);
    }
}
