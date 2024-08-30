import java.util.Scanner;

public class indiceTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        outer: for (int i = 0; i <= nums.length; i++) {   //OUTER IS THE NAME GIVEN TO THE OUTER LOOP
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    System.out.println("[" + i + ", " + j + "]");
                    break outer;
                }
            }
        }
    }
}
