package ARRAYPROGRAM;

public class AllDistinct {
    public static void main(String[] args) {
        int a[]={12,10,9,45,2,10,10};
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(a[i]==a[j]){
                    break;
                }
                if(i==j){
                    System.out.println(a[i]);
                }
            }
        }
    }
    
}
