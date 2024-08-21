//WAP TO CALCULATE THE GCD OF A GIVEN NUMBER

import java.util.Scanner;

class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int num = num1<num2 ? num1 : num2;
        for (int i = num; i>0;i--){
            if(num1 % i==0 && num2 % i==0){
                System.out.println("GCD IS "+ i);
                break;
            }
        }

    }
}
