package PATTERN;

public class Holerectangle {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=8;i++){
            for(j=1;j<=8;j++){
                if(i==1||i==8||j==1||j==8){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        
        }
        System.out.println();
    }
    
}
