package StriverSheet.ArrayQuest;

import java.util.Arrays;

public class RotateArrayLeft {
    public static void main(String[] args) {
        int[] arr = {3,7,8,9,10,11};
        int k = 3;

        rotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    private static void rotate(int[] arr, int k) {
        int n = arr.length;
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
    }

    private static void reverse(int[] arr, int s, int e) {
        while(e>s){
            arr[s] ^= arr[e];
            arr[e] ^= arr[s];
            arr[s] ^= arr[e];
            s++;
            e--;
        }
    }
}
