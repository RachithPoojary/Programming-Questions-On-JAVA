//WAP TO CHECK WHETHER THE GIVEN NUMBER IS A ARMSTRONG NUMBER OR NOT

import java.util.Scanner;

class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int nod = (int) Math.log10(num)+1;
        int temp = num;
        int sum = 0;
        while (num>0){
            int pow = 1;
            int digit = num % 10;
            for (int i = 1;i<=nod;i++){
              pow *= digit;
            }
            sum += pow;
            num /= 10;
        }
        if (temp == sum){
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
