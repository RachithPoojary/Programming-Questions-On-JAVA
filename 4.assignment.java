//WAP TO DISPLAY THE RENTAL AMOUNT BASED ON THE TIME AND DISTANCE TRAVELLED BY THE VEHICLE


import java.util.*;
class assignment {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int kms = sc.nextInt();
          int time= sc.nextInt();
          if(time<=0 || kms<=0){
               System.out.println("Invalid input");
          } else if(time<=8 && kms<=250){
               System.out.println("amount = Rs.2000");
          }else if(time<=8 && kms>250 ) {
               System.out.println("amount ="+(2000+((kms-250)*20)));
          } else if (time>8 && kms<=250) {
               System.out.println("amount ="+ 2000+((time-8)*100));
          } else if (time>8 && kms>250) {
               System.out.println("amount ="+(2000+((kms-250)*20)));
          }
     }
}
