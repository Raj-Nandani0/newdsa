package ARRAYPROGRAM;

public class MaxSum {
    public static void main(String[] args) {
        int a[]={8,3,1,2};
        int n=a.length;
        int res=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                int id=(i+j)%n;
                sum+=j*a[id];
                 res=Math.max(res,sum);
            }
        }
        System.out.println(res);
    }
    
}
