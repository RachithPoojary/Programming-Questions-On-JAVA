//WAP TO CONVERT THE DECIMAL VALUE INTO BINARY

import java.util.Scanner;

class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        System.out.println(Integer.toBinaryString(decimal));
        String binary = "";
        while (decimal>0){
            int remainder = decimal % 2;
            binary = remainder + binary;

            decimal /=2;
        }
        System.out.println(binary);
    }
}
