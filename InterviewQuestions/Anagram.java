package InterviewQuestions;

// Algorithm
// If not same lenght false
// find that char in string if found continue and delete that char from string
// if not found return false;

public class Anagram {
    public static void main(String[] args) {
        isAnamgram1("Masod", "osmad");
    }

    private static void isAnamgram1(String string, String string2) {
        if(string.length() != string2.length()){
            System.out.println("Not an Anagram");
            return;
        }

        char[] arr = string.toLowerCase().toCharArray();
        StringBuilder str = new StringBuilder(string2.toLowerCase());
        for(char c : arr){
            int index = str.indexOf(""+c);
            if( index != -1){
                str.deleteCharAt(index);
            }else{
                System.out.println("Not an Anagram");
                break;
            }
        }

        if(str.length() == 0){
            System.out.println("Is Anagram");
        }
    }
}
