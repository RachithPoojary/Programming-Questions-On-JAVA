//WAP TO DISPLAY THE RENTAL AMOUNT BASED ON THE TIME AND DISTANCE TRAVELLED BY THE VEHICLE

//Rental Caarrz Inc., is a car rental service company
//which allows the users to rent out
//the cars based on the following tariff.
//Anybody who wishes to use this service, can
//pick up the car from one of the outlets and
//pay the charges upon return of the car. The
//rental tariff is as follows:
//• The user would be charged a flat amount of
//Rs. 2000/- if the user returns in less than 8
//hours of hiring and drives less than 250
//kms.
//. If the user rides more than 250 kms but
//returns the car within 8 hours, would be
//charged Rs. 20/- per km for the additional
//kilometres that he rides.
//. If the user returns the car after 8 hours
//hiring but drove less than 250 kms, then he
//would be charged Rs. 100/- per hour for
//every additional hour.
//• If the user rides more than 250 kms and
//returns after 8 hours, then only the
//additional distance traveled would be
//considered: not the additional hours.
//
//Consider an example where the user rents
//out a car and returns it after 6 hours. The
//total distance in the odometer shows up as
//200 Kms. Since, the usage is less than 250
//Kms and also 8 hours, then the flat charge
//of 2000/- would be charged.
//
//The distance traveled had been 300
//Kms, then it is 50 Kms more than minimum
//distance used for calculation. Since, the car
//has been returned within 8 hours, so it
//should not considered for calculations.
//Therefore, the computation would be?
//2000 + (50 x 20) = ? 3000.
//
//If an invalid input is given,
//for e.g
//the
//distance traveled is 0 km, then the following
//error should be displayed.
//Invalid Input

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
