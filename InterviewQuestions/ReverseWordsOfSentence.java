package InterviewQuestions;

public class ReverseWordsOfSentence {
    public static void main(String[] args) {
        reverse("Hello Masood it's me");
    }

    private static void reverse(String string) {
       String reverse = "";

        String[] s = string.split(" ");

        for(int i=s.length-1; i>=0; i--){
            reverse += s[i];
            reverse += " ";
        }

        System.out.println(reverse);
    }
}
