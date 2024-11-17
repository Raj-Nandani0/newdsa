package ARRAYPROGRAM;

public class Book {

    boolean  isValid(int arr[], int n,int m,int maxAllo){
         int page=0, student=0;
        for(int i=0;i<n;i++){
            if(arr[i]>maxAllo){
                return false;
            }
            if( page+arr[i]<=maxAllo){
             page+=arr[i];
            }
            else{
                student++;
                page=arr[i];
            }
        }
        return student>m?false:true;

    }

public int Allocation(int arr[], int n,int m){
         if(m>n){
            return -1;
         }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int ans=-1;
        int st=0;int end=sum;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(isValid(arr,n,m,mid)){
                 ans=mid;
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Book b=new Book();
        int arr[]={2,1,3,4};
        int n=4, m=2;
       System.out.println( b.Allocation(arr, n, m));
    }
    
}
