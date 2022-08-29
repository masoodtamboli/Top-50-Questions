package InterviewQuestions;

//Addition of previous two nnumbers

public class Fibonacci {

    static void fibonacci(int n){
        int n1 = 0, n2 = 1;
        int fib;
        System.out.print(n1 + " " + n2);
        for(int i=2; i<=n; i++){
            fib = n1 + n2;
            System.out.print(" "+ fib);
            n1 = n2;
            n2 = fib;
        }
        
    }
    public static void main(String[] args) {
        fibonacci(12);
    }
}
