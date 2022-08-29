package StringQuestions;

import java.util.regex.Pattern;

// A Java programm to check if a string contains number or not

public class DoesStringContainsNumber {
    public static void main(String[] args) {
        checkUsingRegEx("123a");
        checkUsingColl("1a23");
        checkUsingAscii("12312");
    }

    private static void checkUsingAscii(String string) {

        for(char c : string.toCharArray()){
            if(!(c >= 48 && c<=57)){
                System.out.println(string + " is not a number");
                return;
            }
        }

        System.out.println(string + " is a number");
        
    }

    private static void checkUsingColl(String string) {
        for(char c : string.toLowerCase().toCharArray()){
            if(Character.isAlphabetic(c)){
                System.out.println(string+ " is not a number");
                return;
            }
        }
        System.out.println(string + " is a number");
    }

    

    private static void checkUsingRegEx(String string) {
        Pattern pattern = Pattern.compile(".*\\D.*"); // returns true if string contains any thing other than 0-9

        System.out.println(string + " is a number " + !pattern.matcher(string).matches());
    }    
}
