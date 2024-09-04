//WAP TO SORT AN ARRAY USING INSERION SORT

class InsertionSort {
    public static void main(String[] args) {
        int[] a = { 5,9,4,1,6,3};
        for(int i = 1;i<a.length;i++){
            int temp = a[i];
            int j = i ;
            while(j > 0 && a[j-1 ]>temp){
                a[j] = a[j-1];
                j--;
            }
            a[j] = temp;
        }
        for (int i : a){
            System.out.print(i + " ");
        }
    }
}
