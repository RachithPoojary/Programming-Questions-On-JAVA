//WAP DISPLAY ALL THE FACTORS OF A NUMBER

import java.util.Scanner;

class Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("1");
        for(int i = 2;i<=num/2;i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
        System.out.println(num);
    }
}
