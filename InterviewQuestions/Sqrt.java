package InterviewQuestions;

public class Sqrt {
    public static void main(String[] args) {
        getSqrt(10);
    }

    private static double getSqrt(double n) {
        for (int i = 1; i < n; i++) {
            double p = i * i;
            if (p == n) {
                System.out.println("Square root of n is: " + i);
                return p;
            }
            if(i * i > n){
                sqrt(n, i-1, i);
            }
        }
        return Double.NaN;
    }

    private static double sqrt(double n, double low, double high) {
        double mid = (low + high) / 2;

        if(mid * mid ==  n) {
            System.out.println("Square root of n is: " + mid);
            return mid;
        }

        if( mid * mid < n){
            return sqrt(n, mid, high);  
        }
        return sqrt(n, low, mid);
    }

}
