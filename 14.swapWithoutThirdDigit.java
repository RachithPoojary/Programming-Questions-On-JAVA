//WAP TO SWAP 2 NUMBERS WITHOUT THE HELP OF THIRD VARIABLE

import java.util.Scanner;

class swapWithoutThirdDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first= sc.nextInt();
        int second = sc.nextInt();
        System.out.println("Before swap:-");
        System.out.println("First digit is "+first);
        System.out.println("Second digit is "+second);
        first = first + second;
        second = first - second;
        first = first - second;
        System.out.println("After swap:-");
        System.out.println("First digit is "+first);
        System.out.println("Second digit is "+second);

    }
}
