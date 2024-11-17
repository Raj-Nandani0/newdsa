package ARRAYPROGRAM;

public class LargestContinous {
    public static int Largest(int a[]){
        int maxcur=0;
        int cur=0;
        for(int i=0;i<a.length;i++){
            cur=cur+a[i];
            if(cur>maxcur){
                maxcur=cur;
            }
            if(cur<0){
                cur=0;
            }
        }
        return maxcur;
    }
    public static void main(String[] args) {
        int a[]={-2,-3,4,-1,-2,1,5,-3};
        int result = Largest(a);
        System.out.println(result);
    }
    
}
