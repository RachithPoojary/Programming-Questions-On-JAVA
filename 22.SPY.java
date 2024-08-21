import java.util.Scanner;

class SPY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int prod = 1;
        while (num>0){
            int digit = num%10;
            sum += digit;
            prod *= digit;
            num /= 10;
        }
        if ( sum == prod){
            System.out.println("The given number is a SPY number");
        }
        else {
            System.out.println("The number is not a SPY number");
        }
    }
}
