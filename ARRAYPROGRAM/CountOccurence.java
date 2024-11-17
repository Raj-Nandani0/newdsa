package ARRAYPROGRAM;

public class CountOccurence {
    public static void main(String[] args) {
        int a[]={1,1,2,2,2,2,3};
        int n=a.length;
        int x=2;
        int count=0;
        for(int i=0;i<n;i++){
            if(a[i]==x){
              count++;
            }
        }
        System.out.println(count);
    }
    
}
