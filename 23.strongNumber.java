//WAP TO CHECK WHETHER THE GIVVEN NUMBER IS STRONG NUMBER OR NOT

import java.util.Scanner;

class strongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0,temp = n;
        while (n!=0){
            int digit = n%10;
            int fact = 1;
            for (int i = 1; i<=digit;i++){
                fact *= i;
            }
            sum += fact;
            n/=10;
        }
        if (temp == sum){
            System.out.println("Strong Number");
        }else{
            System.out.println("Not a Strong Number");
        }
    }
}
