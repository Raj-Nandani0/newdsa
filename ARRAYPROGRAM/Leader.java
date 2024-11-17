package ARRAYPROGRAM;

public class Leader {
    public static void main(String[] args) {
        int a[]={16,17,4,3,5};
        int n=a.length;
        for(int i=0;i<n-1;i++){
            if(a[i+1]>a[i]){
                int result=Math.max(a[i+1],a[i]);
                System.out.println(result);
            }
        }
    }
    
}
