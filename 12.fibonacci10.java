//WAP TO DISPLAY FIBONACCI SERIES TILL 10

class fibonacci10 {
    public static void main(String[] args) {
        int num = 10;
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        for (int i = 1;i<=num-2;i++){
            int c= a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
