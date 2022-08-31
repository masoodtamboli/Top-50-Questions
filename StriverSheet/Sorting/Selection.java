package StriverSheet.Sorting;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};

        for(int i=0; i<arr.length; i++){
            int min_idx = i;
            for(int j=i; j<arr.length; j++){
                if(arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }

            // arr[i] ^= arr[min_idx];
            // arr[min_idx] ^= arr[i];
            // arr[i] ^= arr[min_idx];

            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
