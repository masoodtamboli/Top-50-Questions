package InterviewQuestions;

public class StringPermutation {
    public static void main(String[] args) {
        String str = "123";
        permutation("", str);

    }

    private static void permutation(String perm, String str) {
        if (str.isEmpty()) {
            System.out.println(perm + str);
        } else {
            for (int i = 0; i < str.length(); i++) {
                permutation(perm + str.charAt(i), str.substring(0, i) + str.substring(i+1, str.length()));
            }
        }
    }
}
