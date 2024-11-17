package ARRAYPROGRAM;

import java.util.*;
public class LongestConsecutivesub {
    public static void main(String[] args) {
        int a[]={1,9,3,10,4,20,2};
        int n=a.length;
        Arrays.sort(a);
        int count=0;
        for(int i=1;i<n;i++){
            if(a[i]==a[i-1]+1){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
