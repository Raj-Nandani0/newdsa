package COREJAVAPROGRAM;

public class ForLoop {
    public static void main(String[] args) {
        int i=1;
        for(i=1;i<=10;i++){
            if(i==5){
                continue;
            }
                System.out.print(i+" ");
    
        }
        System.out.println();
        for(int j=1;j<=10;j++){
            if(j==5){
                break;
            }
            System.out.print(j+" ");
        }
    }
    
}
