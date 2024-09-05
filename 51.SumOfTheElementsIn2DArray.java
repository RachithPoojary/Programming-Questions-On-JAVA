//WAP to find the sum of all the elements of a single dimensional array


class  SumOfTheElementsIn2DArray{
    public static void main(String[] args) {
        int [][] a= {{1,2,3},
                {4,5,6},
                {7,8,9}};

        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+ " ");
                sum= sum + a[i][j];
            }
            System.out.println(sum);
        }
    }
}