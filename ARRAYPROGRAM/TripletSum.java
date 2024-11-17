package ARRAYPROGRAM;

public class TripletSum {
    public static void main(String[] args){
        int a[]={12,3,4,1,6,9};
        int n=a.length;
        int sum=24;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(a[i]+a[j]+a[k]==sum){
                        System.out.println(a[i]+" "+a[j]+" "+a[k]);
                    }
                }
            }
        }
    }
    
}
