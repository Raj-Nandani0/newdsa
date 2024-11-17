package ARRAYPROGRAM;

public class SegregateEvenOdd {
    public static void main(String[] args) {
        int a[]={7,2,9,4,6,1,3,8,5};
        int left=0;
        int n=a.length;
        int right=n-1;
         while(left<right){
            while(a[left]%2==0&&left<right){
                left++;
            }
            while(a[right]%2==1&&left<right){
                right--;
            }
         }
         if(left<right){
            int temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
         }
         for(int i=0;i<n;i++){
            System.out.print(a[i]);
         }

    }
    
}
