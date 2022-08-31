package StriverSheet.ArrayQuest;

public class FindLargest {
    public static void main(String[] args) {
        int[] arr = {65,4,3,5,33,24,232,24,4,2,2222};
        int max = Integer.MIN_VALUE;

        for(int i : arr){
            if(i>max){
                max = i;
            }
        }

        System.out.println(max);
    }
}
