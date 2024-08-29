public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] a = { 9,6,4,2,3,8,7,0,1};
        int n = 9;
        int total = n*(n+1)/2;
        System.out.println(total);
        int sum = 0;
        for(int i : a){
            sum += i;
        }
        System.out.println(total - sum);
    }
}
