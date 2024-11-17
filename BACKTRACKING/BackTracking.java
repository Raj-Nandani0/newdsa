package BACKTRACKING;

public class BackTracking {
    public static void Permutation(String str, String perm, int id){
        if(str.length()==0){
            System.out.print(perm+" ");
            return ;
        }
        for(int i=0;i<str.length();i++){
           char curchar=str.charAt(i);
           String newstr=str.substring(0, i)+str.substring(i+1);
            
            Permutation(newstr, newstr+perm, id+1);
        }
    }
    public static void main(String[] args) {
      String str="ABC";
       
      Permutation(str, "", 0);

    }
    
}
