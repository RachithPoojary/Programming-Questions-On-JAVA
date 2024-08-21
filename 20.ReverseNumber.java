import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverse = 0;
        while (num>0){
//            reverse *= 10;
            int digit = num%10;
            reverse = reverse*10+ digit;
            num /=10;
        }
        System.out.println(reverse);
        System.out.println(reverse);
        System.out.println(reverse);
    }
}
