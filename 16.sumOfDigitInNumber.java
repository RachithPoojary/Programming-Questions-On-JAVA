//WAP TO FIND THE SUM OF ALL DIGITS IN THE NUMBER.

import java.util.Scanner;

class sumOfDigitInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        while(num>0){

            int digit = num % 10;
            sum += digit;
            num /= 10;

        }
        System.out.println(sum);
    }
}
