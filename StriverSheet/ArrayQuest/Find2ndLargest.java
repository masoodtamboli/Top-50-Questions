package StriverSheet.ArrayQuest;

public class Find2ndLargest {
    public static void main(String[] args) {
        int[] arr = { 65, 4, 3, 5, 33, 24, 232, 24, 4, 2, 2222 };
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max1) {
                max2 = max1;
                max1 = i;
            }
        }

        System.out.println(max2);
    }
}
