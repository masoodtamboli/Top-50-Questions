package InterviewQuestions;

public class FindGCD {
    public static void main(String[] args) {
        getGCD(12, 8);
    }

    private static void getGCD(int j, int k) {
        int gcd = 1;
        for(int i=1; i<=j && i<=k; i++){
            if( j % i == 0 && k % i == 0) gcd = i;
        }

        System.out.println("GCD of " + j + " " + k + " is " + gcd );
    }

}
