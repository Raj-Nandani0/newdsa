package PATTERN;

public class pyramidPattern {
    public static void main(String[] args) {
        int n=8;
         for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i+1;k++){
                System.out.print(k);
            }
            for(int k=i;k>0;k--){
                System.out.print(k);
            }
            System.out.println();
         }
         System.out.println();
    }
    
}
