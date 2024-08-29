//WAP TO ARRANGE THE ELEMENTS IN ASCENDING ORDER BY USING BUBBLE SORT METHOD

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 9, 5, 3, 7, 6,1};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }

            }

            System.out.println(Arrays.toString(arr));
        }
    }
}
