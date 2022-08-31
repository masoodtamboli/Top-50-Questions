package StriverSheet.Recursion;

import java.util.Arrays;

public class Recursion6 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        reverse(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr, int s, int e) {
        if(e-s == 1){
            return;
        }

        arr[s] ^= arr[e];
        arr[e] ^= arr[s];
        arr[s] ^= arr[e];

        reverse(arr, s+1, e-1);
    }
}
