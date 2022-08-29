package InterviewQuestions;

import java.util.*;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        getFNRC("mmassood");
        effGetFNRC("mmassood");
    }

    private static void effGetFNRC(String string) {
        Set<Character> set = new HashSet<Character>();
        ArrayList<Character> list = new ArrayList<>();

        for(char c : string.toLowerCase().toCharArray()){
            if(set.contains(c)){
                continue;
            }
            if(list.contains(c)){
                list.remove((Character)c);
                set.add(c);
            }else{
                list.add(c);
            }
        }

        System.out.println(list.get(0));

    }

    private static void getFNRC(String string) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        boolean flag = false;

        for(char c : string.toLowerCase().toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c, 1);
            }
        }

        for(Map.Entry<Character, Integer> elem : map.entrySet()){
            if(elem.getValue() == 1){
                System.out.println("First Non Reapeating char is: " + elem.getKey());
                flag = true;
                break;
            }
        }

        if(!flag){
            System.out.println("Not Found");
        } 
    }
}
