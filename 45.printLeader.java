//WAP TO DISPLAY ALL THE LEADERS IN AN ARRAY

import java.util.Arrays;
import java.util.Scanner;

class printLeader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for(int i = 0;i<arr.length;i++){
            boolean isLeader = true;
            for (int j = i+1;j<arr.length;j++){

                if(arr[i]<arr[j]){
                    isLeader = false;
                   break ;
                }

            }
            if (isLeader){
                System.out.println(arr[i] + " ");
            }
        }
    }
}
