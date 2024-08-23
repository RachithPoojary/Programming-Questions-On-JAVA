//WAP TO CALCULATE THE TOTAL NUMBER OF DIGITS IN A NUMBER

import java.util.Scanner;

class NumberOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        while(num>0){
            num /= 10;
            count++;
        }
        System.out.println(count);
    }
    //second way to find the count `
    public static void way2(int num){
        int count= (int)(Math.log10(num)+1);
    }
}
