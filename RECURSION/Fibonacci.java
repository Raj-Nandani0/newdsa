package RECURSION;

public class Fibonacci {
    public static void print(int a, int b, int n){
       
        if(n==0){
            return;
        }
        int c= a+b;
        System.out.print(c+" ");
        print(b, c, n-1);
    }
    public static void main(String[] args) {
        int a=0,b=1;
        System.out.print(a+" "+b+" ");
        int n=7;
        print(a,b,n-2);
    }
    
}
