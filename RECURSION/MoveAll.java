package RECURSION;

public class MoveAll {
    public static void Move(String str, int id, int count, String newstr){
        
        if(id==str.length()-1){
            for(int i=0;i<count;i++){
                newstr+='x';
            }
            System.out.println(newstr+" ");
            return;
        }
        char curstr=str.charAt(id);
        if(curstr=='x'){
            count++;
            Move(str, id+1, count, newstr);
            return;
        }
        else{
            newstr+=curstr;
            Move(str, id+1,count, newstr);
            return;
        }
    }
    public static void main(String[] args) {
        String str="axbcxxd";
        Move(str, 0, 0, " ");
    }
    
}
