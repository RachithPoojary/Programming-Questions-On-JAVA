//WAP TO SWAP 2 NUMBERS WITH THE HELP OF THIRD VARIABLE

import java.util.Scanner;

class swap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first= sc.nextInt();
        int second = sc.nextInt();
        System.out.println("Before swap:-");
        System.out.println("First digit is "+first);
        System.out.println("Second digit is "+second);
        int temp = first;
        first = second;
        second=temp;
        System.out.println("After swap:-");
        System.out.println("First digit is "+first);
        System.out.println("Second digit is "+second);

    }
}
