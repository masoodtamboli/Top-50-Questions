package StriverSheet.Hashing;

public class FindMaxFrequency {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 10, 15, 10, 5, 5, 5 };
        boolean[] visited = new boolean[arr.length];
        int maxCount = 0;
        int var = 0;
        for (int i = 0; i < arr.length; i++) {
            if (visited[i] == true) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }

            if(count > maxCount) 
                {
                    maxCount = count;
                    var = arr[i];
                }
        }

        System.out.println(var + " " + maxCount);
    }
}
