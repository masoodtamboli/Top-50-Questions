package InterviewQuestions;
// Multiplication of 0 to n
// For e.g fact(5) = 1 * 2 * 3 * 4 * 5 = 120
public class Factorial {
    public static void main(String[] args) {
        getFact(5);
        System.out.println(getFactRec(5));
    }

    private static int getFactRec(int n) {
        if (n == 0) {
            return 1;
        }
        return n * getFactRec(n - 1);
    }

    private static void getFact(int n) {
        int res = 1;
        while (n > 0) {
            res = res * n;
            n--;
        }
        System.out.println(res);
    }

}
