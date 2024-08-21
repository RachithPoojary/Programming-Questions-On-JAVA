//WAP TO CHECK WHETHER THE NUMBER IS A PERFECT NUMBER OR NOT

import java.util.Scanner;

class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pnum = 0;
        for (int i = 1;i<=num/2;i++){
            if (num % i == 0){
                pnum += i;
            }
        }
        if (pnum == num){
            System.out.println("The number is a Perfect Number");
        }
        else {
            System.out.println("The number is not a Perfect Number");
        }
    }
}
