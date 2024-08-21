//WAP TO FIND THE PRODUCT OF ALL ODD DIGITS IN THE NUMBER

import java.util.Scanner;
class productOfAllOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("Invalid Input - NO ODD DIGITS IN THE NUMBER");
        }
        else {
            int prod = 1;
            while (num > 0) {
                int digit = num % 10;
                if (digit % 2 != 0) {
                    prod *= digit;
                }
                num /= 10;
            }
            System.out.println(prod);
        }

    }
}
