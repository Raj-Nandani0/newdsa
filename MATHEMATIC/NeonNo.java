package MATHEMATIC;

public class NeonNo {
    public static void main(String[] args) {
        int n=9;
        int sum=0;
        int square = n*n;
        while(square>0){
            int rem=square%10;
            sum=sum+rem;
            square=square/10;
        }
        if(sum==n){
            System.out.println("Noen Number ="+" "+sum);
        }
        else{
            System.out.println("Not Neon Number");
        }
    }
    
}
