//WAP TO DISPLAY THE SUM OF ALL DIGITS IN THE RANGE

import java.util.Scanner;
class sumInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum=0;
        for(int i =0;i<=num;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
