package StriverSheet.ArrayQuest;

public class IsArraySorted {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 7, 5, 6 };

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("Unsorted");
                return;
            }
        }

        System.out.println("Sorted");
    }
}
