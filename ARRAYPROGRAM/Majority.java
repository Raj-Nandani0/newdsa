package ARRAYPROGRAM;

import java.util.Arrays;

public class Majority {
    public static void main(String[] args) {
        int a[]={1,1,2,1,3,5,1};
        int n=a.length;
        int freq=1;
        int ans=a[0];
        int i;
        Arrays.sort(a);
        for(i=1;i<n;i++){
            if(a[i]==a[i-1]){
                freq++;
            }
            else{
                freq=1;
                ans=a[i];
            }
            if(freq>n/2)
            System.out.println(ans);
           
        }
    }
    
}
