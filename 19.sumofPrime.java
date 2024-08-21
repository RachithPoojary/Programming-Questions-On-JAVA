//WAP TO CALCULATE THE SUM OF ALL PRIME NUMBERS IN THE GIVEN NUMBER

import java.util.Scanner;

class sumofPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;


        while (num>0){
            int count = 0;
            int digit = num%10;
//            for (int i = 1;i<=digit;i++){
//
//                if(digit %i==0){
//                    count++;
//                }
//            }
//            if (count==2){
//                sum += digit;
//            }
            if(isPrime(digit)){
                sum += digit;
            }
            num /= 10;
        }
        System.out.println("sum " + sum);


    }
    public static  boolean isPrime(int digit){
        int count = 0;
        for(int i = 1;i<=digit;i++){
            if(digit%2 ==0){
                count++;
            }

        }
        return count==2;
    }

}
