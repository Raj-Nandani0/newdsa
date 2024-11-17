package RECURSION;

public class TowerHanoi {
    public  static void TowerHanoi(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("Tower of S TO D="+src+" "+dest);
            return;
        }
        TowerHanoi(n-1, src, dest, helper);
        System.out.println("Tower of S TO D="+src+" "+dest);
        TowerHanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int n=2;
        TowerHanoi(n, "src", "helper", "dest");
    }
    
}
