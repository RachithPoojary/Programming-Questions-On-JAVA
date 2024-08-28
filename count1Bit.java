public class count1Bit {
    public static void main(String[] args) {
        int[] arr = { 10,100,1000,10000};
        int max = count(arr[0]);
        int res = arr[0];
//        System.out.println(count(1000));
        for (int i = 1;i<=arr.length-1;i++){

            int temp = count(arr[i]);
            if (temp>max){
                max = temp;
                res = arr[i];
            }

        }
        System.out.println(res);

    }
    public static int count(int i ){
        int count = 0;
        while (i>0){
            int remainder = i%2;
            if (remainder == 1){
                count++;
            }
            i /= 2;
        }
        return count;

//        int binary = 0;
//        while (i>0){
//            int remainder = i % 2;
//            binary = remainder + binary;
//            i /=2;
//        }
//        System.out.println(binary);
//        System.out.println(binary);
//        while (binary> 0){
//            int digit = binary % 10;
//            if( digit == 1){
//                count++;
//            }
//            binary/=10;
//        }

//        return binary;
    }
}
