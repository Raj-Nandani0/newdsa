package ARRAYPROGRAM;

public class SubArraySum {
    public static void main(String [] args){
        int a[]={15,2,4,8,9,5,10,23};
        int n=a.length;
        int sum=0;
        int k=23;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                sum=sum+a[i];
                if(sum==k){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
    
}
