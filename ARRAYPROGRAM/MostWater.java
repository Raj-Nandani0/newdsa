package ARRAYPROGRAM;

public class MostWater {
    public static void MaxArea(int height[], int n){
        int maxwater=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int w=j-i;
                int ht=Math.min(height[i], height[j]);
                int maxcurr=ht*w;
                maxwater=Math.max(maxwater, maxcurr);
            }
        }
        System.out.println("Container with most water="+maxwater);
    }
    public static void main(String[] args) {
        int height[]={1,8,6,2,5,4,8,3,7};
         int n=height.length;
         MaxArea(height, n);
    }
    
}
