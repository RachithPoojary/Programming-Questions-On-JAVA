//  write a program to find magic value from array
// magic value = sum of good integer -sum of bad integer

// Good Integer are values who's position did not change during sorting

// Bad Integer are values who's position changes during sorting the array

import java.util.Arrays;

class magicValueFromArray {
    public static void main(String[] args) {

        int a []= {0,0,4,1,0,0,7,8,9};

        int [] b = a.clone();
        Arrays.sort(b);
        int good=0,bad=0;
        for(int i=0;i<b.length;i++) {
            if(a[i]==b[i]) {
                good= good+a[i];

            }
            else {
                bad=bad+a[i];
            }
        }

        System.out.println(good-bad);

    }
}