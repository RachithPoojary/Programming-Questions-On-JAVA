import java.lang.reflect.Array;
import java.util.Arrays;

public class elementReverseArray {
    public static void main(String[] args) {
        int[] a = { 15,74,63,14,25};
        for ( int i = 0;i<=a.length-1;i++){
            a[i] = reverse(a[i]);
            System.out.print(a[i] + " ");


        }
        System.out.println();
        System.out.println(Arrays.toString(a));
    }
    public static int reverse(int i){
        int rev = 0;
        while (i>0){
            rev *= 10;
            int digit = i%10;
            rev = (rev + digit ) ;

            i = i/10;
        }
        return  rev;
    }
}
