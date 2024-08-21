//WAP TO PRINT FIZZBUZZ,FIZZ,BUZZ WHEN THEY SATISFY THE CONDITION

import java.util.*;
 class FizzBuzz {
    public static void main(String[] args) {
//        System.out.println("Enter the value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i =1;i<=n;i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }

    }


    }

}
