package PATTERN;

public class Holpyramid {  
    public static void main(String[] args) {
        int i,j,k;
         for(i=1;i<=8;i++){
            for(j=8;j>i;j--){
                System.out.print(" ");
            }
            for(k=1;k<=(2*i-1);k++){
                if(k==1||k==(2*i-1)||i==8){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
         }
    }
    
}
