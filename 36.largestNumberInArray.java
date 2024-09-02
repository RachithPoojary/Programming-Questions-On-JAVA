//WAP TO DISPLAY THE LARGEST NUMBER FROM AN ARRAY

class largestNumberInArray {
    public static void main(String[] args) {
        int[] arr = {4,65,78,6,15,5,44,98};
        int largest = arr[0];
        for (int i = 1; i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
