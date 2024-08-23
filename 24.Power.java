//WAP TO CLACULATE THE POWER OF A NUMBER

import java.util.Scanner;

class Power {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int prod = 1;

        for (int i = 1;i<=p;i++){
            prod = prod * n;
        }
        System.out.println(prod);

        //SECOND WAY
        System.out.println(Math.pow(5,3));

    }
}
