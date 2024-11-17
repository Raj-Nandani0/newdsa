package CONVERSIONPROGRAM;

public class DecimalToBinary {
    public static void main(String[] args) {
         int n=5;
         int digit=0;
         int i=0;
         while(n!=0){
            int bit=n&1;
            digit= (bit*pow(10,i++))+digit;
            n=n>>1;
            
         }
         System.out.println(digit);
    }
    
}
