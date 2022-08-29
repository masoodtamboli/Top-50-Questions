package InterviewQuestions;

public class StringPallindrome {
    public static void main(String[] args) {
        pallindrome("M");
    }

    private static void pallindrome(String string) {
        int size = string.length();
        int flag = 0;
        for(int i=0, j=size-1; j>=size/2 && i<=size/2; i++,j-- ){
            if(string.charAt(i) == string.charAt(j)){
                continue;
            }else{
                flag = 1;

                System.out.println(string + " is not pallindrome");
                break;
            }
        }

        if(flag == 0) System.out.println(string + " is pallindrome");
    }
}
