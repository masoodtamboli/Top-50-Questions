package InterviewQuestions;

public class Integerpallindrome {
    public static void main(String[] args) {
        integerpallindrome(101);
    }

    private static void integerpallindrome(int n) {
        int res = n;
        int res1 = 0;
        while(n>0){
            int temp = n % 10;
            res1 = res1 * 10 + temp;
            n = n / 10;
        }   

        if(res1 == res){
            System.out.println("Pallindrome");
        }else{
            System.out.println("No");
        }
    }
}
