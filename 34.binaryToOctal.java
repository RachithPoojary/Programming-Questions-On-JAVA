//WAP TO CONVERT BINARY INTO OCTAL
//(WE NEED TO CONVERT BINARY TO DECIMAL AND THEN DECIMAL TO OCTAL)

class binaryToOctal {
    public static void main(String[] args) {
        //BINARY TO DECIMAL
        int n = 101010;
        int sum = 0;
        int p = 0;
        while (n > 0) {
            int digit = n % 10;
            sum = sum + digit * pow(2, p);
            p++;
            n /= 10;
        }
        System.out.println(sum);


        //DECIMAL TO OCTAL
        int temp = sum;
        String oct = "";
        while (temp > 0) {
            int remainder = temp % 10;
            oct = remainder + oct;
            temp /= 8;
        }
        System.out.println(oct);
    }

    public static int pow (int n,int p){
        int pow = 1;
        for (int i = 1;i<=p;i++){
            pow = pow*n;
        }
        return pow;
    }
    }

