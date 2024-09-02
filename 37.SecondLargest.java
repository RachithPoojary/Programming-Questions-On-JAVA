//WAP TO DISPLAY THE LARGEST AND THE SECONDLARGEST NUMBER FROM AN ARRAY

class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {5,5674,15,48,2154,84,515,44,45};
        int largest = arr[0];
        int secondLargest = arr[0];
        for (int i = 1;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }else if (arr[i]>secondLargest && arr[i]<largest){
                secondLargest = arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(secondLargest);
    }
}
