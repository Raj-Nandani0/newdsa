package CONVERSIONPROGRAM;

public class OctaToBinary {
    public static void main(String[] args){
        int n=1101;
        int i=0;
        int digit=0;
        while(n!=0){
            int rem=n%10;
            digit=digit+Math.pow(10, i);
            n=n/10;
        }
        i=1;
        while(digit==0){
            int  oct=(digit%8)*i;
            digit=digit/8;
            i=i*10;
        }
        System.out.println();
    }
    
}
