package ARRAYPROGRAM;

public class SumOfLastNum {
    public static void main(String[] args) {
        int a[]={10,6,8,4,12};
        int key=2;
        int n=a.length;
        int count=0, sum=0;
        for(int i=n-1;i>0;i--){
            if(count<key)
            {
                sum+=a[i];
                count++;
            }
        }
        System.out.print(sum);
    }
    
}
