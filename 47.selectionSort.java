//WAP TO SORT AN ARRAY IN THE ASCENDING ORDER USING SELECTION SORT

class selectionSort {

    public static void main(String[] args) {
        int[] a = {8,4,9,7,3,5};
        System.out.println("Before Sorting");
        printArray(a);
        //SELECTION SORT LOGIC

        for (int i = 0; i < a.length; i++) {
            int minIndex = i;
            for (int j = i+1; j <a.length ; j++) {
                if(a[j]<a[minIndex]){
                    minIndex= j;
                }
            }
            int temp = a[i];
            a[i]=a[minIndex];
            a[minIndex] = temp;
        }
        System.out.println("After sorting ");
        printArray(a);

    }

    public static void printArray(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
