package Test;

public class My {
    public static void main(String[] args) {
        int[] arr1 = {9,16,12,5,15};
        int[] arr2 = {14,7,22,5,32,77};
        int k = 9;
        int count1 = 0;
        int count2 = 0;
        for(int i=0; i<arr1.length; i++){
            if(arr1[i] > k){
                count1++;
            }
        }

        for(int i=0; i<arr2.length; i++){
            if(arr2[i]<k){
                count2++;
            }
        }

        System.out.println(Math.max(count1, count2));
    }
}
