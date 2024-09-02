//WAP TO CONVERT OCTAL VALUE INTO DECIMAL

class octalToDecimal {
    public static void main(String[] args) {
        int n = 25;
        int sum = 0;
        int p = 0;
        while(n!=0){
            int digit = n % 10;
            sum = sum + digit * pow(8,p);
            p++;
            n/=10;
        }
        System.out.println(sum);

    }
    public static int pow (int n,int p){
        int pow = 1;
        for (int i = 1;i<=p;i++){
            pow = pow*n;
        }
        return pow;
        }
    }

