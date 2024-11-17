package ARRAYPROGRAM;

public class BuyandSell {

    public static void MaxProfit(int price[],int n){
        int maxprofit=0;
        int bestbuy=price[0];
        for(int i=0;i<n;i++){
            if(price[i]>bestbuy){
                maxprofit=Math.max(maxprofit,price[i]-bestbuy);
            }
            bestbuy=Math.min(price[i], bestbuy);
        }
        System.out.println(" MaxProfit="+maxprofit);
    }
    public static void main(String[] args) {
        int price[]={7,1,5,3,6,4};
        int n=price.length;
          MaxProfit(price, n);
    }
    
}
