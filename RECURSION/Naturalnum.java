package RECURSION;

public class Naturalnum {
  public static void num(int i,int n, int sum){
    if(i==n){
        sum+=i;
        System.out.print(sum+" ");
        return;
    }
    sum+=i;
    num(i+1, n, sum);
  }
  public static void main(String[] args) {
    num(1, 5, 0);
  }
    
}
