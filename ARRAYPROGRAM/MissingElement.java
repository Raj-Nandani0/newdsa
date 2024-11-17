package ARRAYPROGRAM;

public class MissingElement {
    public static void main(String[] args) {
        int a[]={1,2,3,4,6};
        int n=6;
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        int expect=n*(n+1)/2;
        int result=expect-sum;
        System.out.println(result);
    }
    
}
