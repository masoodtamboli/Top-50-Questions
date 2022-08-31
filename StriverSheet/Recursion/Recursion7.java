package StriverSheet.Recursion;

public class Recursion7 {
    public static void main(String[] args) {
        String str = "MIIM";
        System.out.println(reverseString(str, 0, str.length()-1));
    }

    private static boolean reverseString(String str, int s, int e) {
        if(e==s) return true;

        if(str.charAt(s) != str.charAt(e)) return false;

        if(s<e+1)
            return reverseString(str, s+1, e-1);
        return true;
    }
}
