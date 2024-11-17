package COREJAVAPROGRAM;

public class WhileLoop {
    public static void main(String[] args) {
        int i[]={10};
        int  j=10;
   /* while(j<=10){
        System.out.print(j+" ");
        j++;
    }*/
   /* do{
        System.out.print(j+" ");
        j++;
    }while(j<10);*/
   /*  for(j=1;j<=10;j++){
        System.out.print(j+" ");
    }*/
    //Infinite Loop
   /* for(;;){
        System.out.print(j);
    }*/
    //not use Iterable to normal varible
   // it can use  array and implement of iterable interface 
    for(int a:i){
        System.out.println(a);
    }
    //error Code
    /*or(int c:j){
        System.out.print(c);
    }*/

}
    
}
