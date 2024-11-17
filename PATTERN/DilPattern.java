package PATTERN;

public class DilPattern {
    public static void main(String[] args) {
         for(int i=0;i<5;i++){
            for(int j=0;j<6;j++){
                if((i==0&&j%3!=0)||(i==0&&j%3==0)||(i-j==2)||(i+j)==8){
                    System.out.print(" * ");
                }
                System.out.print(" ");
            }
            System.out.println();
         }
         System.out.println();
    }
    
}
