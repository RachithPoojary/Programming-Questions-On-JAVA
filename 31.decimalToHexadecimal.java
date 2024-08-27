//WAP TO CONVERT DECIMAL NUMBER INTO HEXADECIMAL

class decimalToHexadecimal {
    public static void main(String[] args) {

        int n = 124;
        int base = 16;
        String result = "";
        while (n>0){
            int remainder = n%base;
            if(remainder<10){
                result = remainder + result ;
            }
            else {
                result = (char)(remainder+55)+result;
            }
            n=n/base;
        }
        System.out.println(result);

    }
}
