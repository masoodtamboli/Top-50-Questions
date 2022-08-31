package StriverSheet.Recursion;

public class Recursion3 {
    public static void main(String[] args) {
        printNTill1(10);
    }

    private static void printNTill1(int i) {
        if(i==0) return;

        System.out.println(i);
        printNTill1(i-1);
    }
}
