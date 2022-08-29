package InterviewQuestions;

public class StrngReverse {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Masood");
        String str1 = "Masood";
        rev(str);
        rev1(str1.toCharArray(), 0,str.length()-1);
    }

    private static void rev1(char[] str, int s, int e) {
        while(s<e){
            str[s] ^= str[e];
            str[e] ^= str[s];
            str[s] ^= str[e];
            s++;
            e--;
        }
        System.out.println(str);
    }

    private static void rev(StringBuffer str) {
        String rev = "";
        int i=str.length()-1;
        while(i>=0){
            rev += str.charAt(i);
            i--;
        }

        System.out.println(rev);
    }
}
