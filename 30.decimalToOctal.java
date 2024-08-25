//WAP TO CONVERT DECIMAL VALUE INTO OCTAL

import java.util.Scanner;

class decimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        String octal = "";
        while (decimal>0){
            int remainder = decimal % 8;
            octal = remainder + octal;

            decimal /= 8;
        }
        System.out.println(octal);
    }
}
