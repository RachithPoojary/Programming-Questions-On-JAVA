import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 1;
        while(i<=t){
            int p = sc.nextInt();
            int count = 0;
            for(int pp = 1;pp<=p;pp++){
                if(p%pp==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(p+" is a prime number");
            } 
            else{
                System.out.println(p + " is not a prime number");
            }
        }
    }
}