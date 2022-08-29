package InterviewQuestions;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 1};
        reverseArray(arr);
    }

    private static void reverseArray(int[] arr) {
        int length = arr.length;
        if(arr.length == 1){
            System.out.println(Arrays.toString(arr));
            return;
        }
        for (int i = 0, j = length - 1; i <= length / 2 && j >= length / 2; i++, j--) {
            arr[i] ^= arr[j];
            arr[j] ^= arr[i];
            arr[i] ^= arr[j];
        }
        System.out.println(Arrays.toString(arr));
    }
}
