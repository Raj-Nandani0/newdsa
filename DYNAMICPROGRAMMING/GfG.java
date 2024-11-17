package DYNAMICPROGRAMMING;

public class GfG {
    public static int Knapsack(int wt[],int val[], int w, int n){
        if(n==0||w==0)
            return 0;
        
        if(wt[n-1]<=w)
            return Math.max(val[n-1]+Knapsack(wt,val,w-wt[n-1],n-1),Knapsack(wt,val,w,n-1));
        
        else if(wt[n-1]>w)
            return Knapsack(wt,val,w,n-1);
        return 1;
    }
    public static void main(String[] args) {
        int weight[]={10,20,30};
        int profit[]={60,100,120};
        int w=50;
        int n=profit.length;
        System.out.println("Maximum profit="+Knapsack(weight,profit,w,n));
    }
    
}
