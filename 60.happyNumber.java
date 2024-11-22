import java.util.Scanner;

class happyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int square = 0;

        for (int i = 1; i <= 100; i++) {
            while (n > 0) {
                int digit = n % 10;
                square += digit * digit;
                n /= 10;

            }
            if (square == 1) {
                System.out.println("True");
                break;
            } else {
                n = square;
                square = 0;
            }
        }
        if (square == 0) {
            System.out.println("False");
        }
    }
}
