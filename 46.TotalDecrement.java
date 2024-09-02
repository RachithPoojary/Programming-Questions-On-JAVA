//WAP TO DISPLAY THE TOTAL NUMBER OF STEPS REQUIRED TO CONVERT ALL THE DIGITS TO THE SPECIFIC TARGET

class TotalDecrement {
    public static void main(String[] args) {
        int[] a = { 5,9,12,16,25};
        int k = 6;
        int totalDecremement = 0;
        for (int i = 0;i<a.length;i++){
            totalDecremement = totalDecremement + (a[i] % k);
        }
        System.out.println(totalDecremement);

//        for (int i = 0;i<a.length;i++){
//            while (a[i] % k!=0){
//                a[i]--;
//                totalDecremement++;
//            }
//        }
//        System.out.println(totalDecremement);
    }
}
