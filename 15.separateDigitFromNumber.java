//WAP TO SEPARATE ALL THE DIGIT FROM A NUMBER

import java.util.Scanner;
class separateDigitFromNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while (num>0){
            int digit = num %10;
            System.out.println(digit);
            num/=10;
        }
    }
}
