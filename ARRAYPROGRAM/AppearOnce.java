package ARRAYPROGRAM;

public class AppearOnce {
    public static void main(String[] args) {
        int a[]={2,3,5,4,5,3,4};
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i]==a[j]){
                    break;
                }
            }
        }
    }
    
}
