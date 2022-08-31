package StriverSheet.ArrayQuest;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,4,5,5,6};
        int i=0, j=1;
        while(i<arr.length && j < arr.length){
            if(arr[i] == arr[j]){
                j++;
            }else{
                i++;
                arr[i] = arr[j];
                j++;
            }
        }

        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, i)));
    }
}
