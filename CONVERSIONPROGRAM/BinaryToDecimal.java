package CONVERSIONPROGRAM;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int n=101;
        int digit=0;
        int i=0;
        while(n!=0){
            int rem=n%10;
            n=n/10;
             digit= digit+rem*pow(10,i++);
        }
        System.out.println(digit);
    }
    
}
