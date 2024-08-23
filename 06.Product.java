//WAP DISPLAY THE PRODUCT OF ALL ODD NUMBERS IN THE RANGE OF 1 TO 10

class Product {
     public static void main(String[] args) {
         int product = 1;
         for(int i = 1; i<10;i++){
             if(i%2!=0){
                 product *=i;
             }
         }
         System.out.println(product);
     }
}
