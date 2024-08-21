//WAP TO DISPLAY THE LARGEST DIGIT IN THE GIVEN NUMBER

import java.util.Scanner;

class largestNumberInTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int largest = 0;
        while (num>0){
            int digit = num%10;
            if (digit>largest){
                largest = digit;
            }
            num /= 10;
        }
        System.out.println(largest);
    }
}
