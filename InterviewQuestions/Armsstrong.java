package InterviewQuestions;

public class Armsstrong {
    public static void main(String[] args) {
        isArmstrong(153);
    }

    private static void isArmstrong(int n) {
        int org = n;
        int res = 0;
        while (n > 0) {
            int temp = n % 10;
            res += Math.pow(temp, 3);
            n = n / 10;
        }

        if (org == res) {
            System.out.println(" Yes");
        } else {
            System.out.println("No");
        }
    }
}
