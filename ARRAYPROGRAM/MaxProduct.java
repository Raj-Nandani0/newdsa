package ARRAYPROGRAM;

public class MaxProduct {
    public static void main(String[] args) {
        int a[]={-2,6,-3,-10,0,2};
        int n=a.length;
        int result=a[0];
        for(int i=0;i<n;i++){
            int mul=1;
            for(int j=i;j<n;j++){
                mul*=a[j];
                result=Math.max(mul, result);
            }
        }
        System.out.println(result);
    }
    
}
