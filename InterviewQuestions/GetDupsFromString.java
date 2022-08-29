package InterviewQuestions;

import java.util.*;

public class GetDupsFromString {
    public static void main(String[] args) {

        getDups("Massood");
        effGetDups("Massood");
    }

    private static void effGetDups(String string) {
        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i<string.length(); i++){
            if(map.containsKey(string.charAt(i))){
                map.put(string.charAt(i), map.get(string.charAt(i))+1);
            }else{
                map.put(string.charAt(i), 1);
            }
        }

        // Using Irterator

        Iterator<Map.Entry<Character, Integer>> it = map.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry<Character, Integer> mapElement = (Map.Entry<Character, Integer>) it.next();
            if(mapElement.getValue() > 1){
                System.out.println(mapElement.getKey() + " " + mapElement.getValue());
            }
        }

        // Using For in loop 
        for(Map.Entry<Character, Integer> mapElement : map.entrySet()){
            if(mapElement.getValue() > 1){
                System.out.println(mapElement.getKey() + " " + mapElement.getValue());
            }
        }

        // Using for each loop on Map => problem : can write only single line
        map.forEach((k,v) -> 
        System.out.println(k + " " + v));
        
        // Using for each on entry set solves multiline problem
        map.entrySet().forEach((ele) -> {
            if(ele.getValue() > 1){
                System.out.println(ele.getKey() + " " + ele.getValue());
            }
        });
    }

    private static void getDups(String string) {

        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(i) == string.charAt(j)) {
                    System.out.println(string.charAt(i) + " with index : " + i + " " + j);
                    count+=2;
                }
            }
        }
        System.out.println("Found Dup char count " + count);
    }
}
