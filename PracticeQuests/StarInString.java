package PracticeQuests;

public class StarInString {
    public static void main(String[] args) {
        String str = "Masood";
        String str2 = "";
        // String str2 = "";
        // int count = 0;
        // for(char c : str.toCharArray()){

        // if(count == 0) str2 += ""+c;
        // else if(count == str.length()-1) str += ""+c;
        // else str2 += "*";
        // count++;
        // }

        // System.out.println(str2);
        str2 += str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (i != str.length() - 1)
                str2 += "*";
            else
                str2 += str.charAt(i);
        }

        System.out.println(str2);
    }
}
