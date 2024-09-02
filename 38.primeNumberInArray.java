class primeNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for(int i= 0;i<arr.length;i++){
            if(isPrime(arr[i])){
                System.out.println(arr[i]);
            }
        }
    }

    public static boolean isPrime(int n) {
        int count = 0;
        for (int i = 1;i<= n;i++){
            if(n%i==0){
                count++;
            }
        }
        return count == 2;
    }
}
