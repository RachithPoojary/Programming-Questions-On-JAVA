//WAP TO SEARCH AN ELEMENT BY USING BINARY SEARCH

class BinarySearch {
    public static void main(String[] args) {
        int[] a = { 5,9,4,1,6,3};

        sort(a);
        int search = 3;
        int sp = 0,ep= a.length-1;
        while (sp<=ep){
            int mp = (sp + ep)/2;
            if(search == a[mp]){
                System.out.println("Present at : "+ mp);
                break;
            }else if (search > a[mp]){
                sp = mp + 1;
            }else if (search<a[mp]){
                ep = mp -1;
            }
        }
        if(sp>ep){
            System.out.println("Element is not present ");
        }

    }

    public static void sort(int[] a) {
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
        System.out.println();
    }
}
