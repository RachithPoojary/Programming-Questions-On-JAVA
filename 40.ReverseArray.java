//WAP TO REVERSE AN ARRAY

class ReverseArray {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};

        //Method1
        for(int i = a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        //Method2
        int[] b = new int[a.length];
        for (int i = a.length - 1,j=0;i>= 0;i--,j++){
            b[j] = a[i];
        }
        for (int i : b){
            System.out.print(i + " ");
        }

        System.out.println();

        //Mthod 3
        int i = 0,j=a.length-1;
        while (i>=j){
            int temp = a[i];
            a[i]= b[j];
            b[j]=temp;
            i++;
            j--;
        }
        for (int k : b){
            System.out.print(k + " ");
        }
    }
}
