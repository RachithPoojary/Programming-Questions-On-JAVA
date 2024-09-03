//WAP TO SEARCH AN ELEMENT IN AN ARRAY USING LINEAR SEARCH

class linearSearching {
    public static void main(String[] args) {
        int[] a = {1,3,5,6,67,342,98};
        int search = 69;
        int index = -1;
        for (int i = 0; i <a.length ; i++) {
            if (a[i]==search){
                index = i;
                break;
            }
        }
        if (index != -1 ) {
            System.out.println("Element is present at :"+ index + "th index");
        }
        else {
            System.out.println("Element is not present in the array");
        }
    }
}
