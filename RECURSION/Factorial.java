package RECURSION;

public class Factorial {
    public static void print(int i,int n, int fact){
        if(i==n){
            fact*=i;
            System.out.print(fact+" ");
            return;
        }
        fact=fact*=i;
        print(i+1, n, fact);
    }
    public static void main(String[] args) {
        print(1,5,1);
    }
    
}
