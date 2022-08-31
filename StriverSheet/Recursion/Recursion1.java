package StriverSheet.Recursion;

public class Recursion1 {
    public static void main(String[] args) {
        print(10);
    }

    private static void print(int n) {
        if(n<0){
            return;
        }
        System.out.println(n+"Hello");
        print(n-1);
    }
}
