
//WAP to find the largest element from the single dimensional arrays.


class LargestNumberInSingleDimensionArray {
    public static void main(String[] args) {
        int[][] arr= {{12,42,3},
                {114,33,61},
                {71,88,94}};


        for (int i = 0; i < arr.length; i++) {
            int large = arr[i][0];
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > large) {
                    large = arr[i][j];
                }
            }
            System.out.println(large);
        }
    }
}