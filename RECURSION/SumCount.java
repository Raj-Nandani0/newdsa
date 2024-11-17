package RECURSION;

public class SumCount {
    public static void  Add(int n, int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        int rem=n%10;
        sum=sum+rem;
        n=n/10;
        Add(n,sum);
    }
    public static void main(String[] args) {
        int n=12345;
        int sum=0;
        Add(n, 0);

    }
    
}
