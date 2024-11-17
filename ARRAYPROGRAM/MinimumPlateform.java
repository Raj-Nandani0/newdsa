package ARRAYPROGRAM;

public class MinimumPlateform {
    public static void main(String[] args) {
        int a[]={900,940,950,1100,1500,1800};
        int d[]={910,1200,1120,1130,1900,2000};
        int n=a.length;
        int i=0,j=0;
        int count=0,max=0;
        while(i<n){
           if(a[i]<d[j]){
            count++;
            max=Math.max(max,count);
            i++;
           }
           else{
            count--;
            j++;
           }
        }
        System.out.println(max);
    }
    
}
