package RECURSION;

public class Occurance {
 public static int first=-1;
  public static int last=-1;
    public static void Occurance(String str, int id,  char element){
    
        if(id==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char cur=str.charAt(id);
        if(cur==element){
            if(first==-1){
                first=id;
            }
            else{
                last=id;
            }
        }
        Occurance(str, id+1,element);
    }
    public static void main(String[] args) {
        String str="abaacdaefaah";
        Occurance(str, 0 ,'a');
    }
    
}
