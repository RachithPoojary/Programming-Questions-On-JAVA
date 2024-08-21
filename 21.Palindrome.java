//WAP TO CHECK WETHER THE GIVEN NUMBER IS PALINDROME OR NOT

import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (isPlaindrome(num)){
            System.out.println("The number is a palindrome number");
        }
        else {
            System.out.println("The number is not a palindrome number");
        }

    }
    public static boolean isPlaindrome(int num){
        int n = num;
        int reverse = 0;
        while (num>0){
//            reverse *= 10;
            int digit = num%10;
            reverse = reverse*10+ digit;
            num /=10;
        }
        return reverse==n;
    }
}
