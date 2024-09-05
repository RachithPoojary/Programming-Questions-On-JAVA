//WAP TO SOLVE THE PROBLEM

class  SingleDimensionalArrayProblem {
    public static void main(String[] args) {
        int[][] a= {{11,22,33},{44,55,66},{77,88,99}};
        int x= 55;
        int sumRC= 0;
        chotu: for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(x == a[i][j]) {
                    sumRC= i + j;
                    break chotu;
                }
            }
        }
        int totalSum =0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (sumRC % 2 == 0 && a[i][j] % 2 == 0) {
                    totalSum = totalSum + sumOfDigits(a[i][j]);
                }
                else if (sumRC % 2 != 0 && a[i][j] % 2 != 0) {
                    totalSum = totalSum + sumOfDigits(a[i][j]);
                }
            }
        }
        System.out.println(totalSum);
    }
    public static int sumOfDigits(int n) {
        int sum = 0;
        while(n != 0) {
            int digit = n% 10;
            sum = sum +digit;
            n = n/10;
        }
        return sum;
    }
}
