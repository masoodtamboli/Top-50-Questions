package PracticeQuests;

import java.util.*;

public class StringInterchange {
    public static void main(String[] args) {
    String str1 = "GAURAV";
    String str2 = "SNEHAL";
    String res = "UVRAGA";
    interchange(str1, str2, res);
    }

    private static void interchange(String str1, String str2, String str3) {
        ArrayList<Character> arr = new ArrayList<>();
        String res2 = "";
        for(int i=0; i<str1.length(); i++){
            arr.add(str1.charAt(i));
            arr.add(str2.charAt(i));
        }

        for(char c : str3.toCharArray()){
            if(str1.contains(""+c)){
                res2 += arr.get(arr.indexOf(c)+1);
            }else{
                res2 += arr.get(arr.indexOf(c)-1);
            }
        }

        System.out.println(res2);
    }
}
