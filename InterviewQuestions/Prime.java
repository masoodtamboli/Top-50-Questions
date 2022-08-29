package InterviewQuestions;

public class Prime {
    public static void main(String[] args) {
        isPrime(4);
        effPrime(35);

    }

    private static void effPrime(int n) {
        if(n > 2 && n % 2 == 0){
            System.out.println(n + " is not prime");
            return;
        }

        int top = (int)Math.sqrt(n) + 1;
        for(int i=3; i<top; i+=2){
            if(n % i == 0){
                System.out.println(n + " is not prime");
                return;
            }
        }
        System.out.println(n+ " is Prime");
    }

    private static void isPrime(int n) {

        int flag = 0;
        if(n == 0 || n == 1){
            System.out.println(n+ " is not prime");
        }else{
            for(int i=2; i<=n/2; i++){
                if(n % i == 0){
                    flag = 1;
                    System.out.println(n + " Is not a prime number");
                    break;
                }
            }
            if(flag == 0) System.out.println(n + " is a prime number");
        }

       
    }
}
