package InterviewQuestions;

public class RemoveArrayDups {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 4, 4, 5 };
        int i = 0, j = 0;
        while (i < arr.length && j < arr.length) {
            if (arr[i] == arr[j]) {
                j++;
            } else {
                i++;
                arr[i] = arr[j];
                j++;
            }
        }
        for(int k=0; k<i; k++){
            System.out.print(arr[k]+" ");
        }
    }
}
