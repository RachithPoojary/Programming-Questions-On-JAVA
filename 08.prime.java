//WAP TO CHECK WHETHER THE GIVEN NUMBER IS PRIME OR NOT

import java.util.Scanner;

class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for(int i = 2;i<=num/2;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println("The number is Prime Number");
        }
        else {
            System.out.println("The number is not a Prime Number");
        }
    }
}
