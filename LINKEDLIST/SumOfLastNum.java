package LINKEDLIST;

public class SumOfLastNum {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static int  Display(Node head, int k){
        int length=1,sum=0;
        Node cur=head;
        while(cur!=null){
            length++;
            cur=cur.next;
        }
        cur=head;
        for(int i=0;i<length;i++){
            if(i>length-k){
                sum+=cur.data;
                cur=cur.next;
            }
        }
       return sum;
    }
    public static void main(String[] args) {
        Node node=new Node(5);
        node.next=new Node(10);
        node.next.next=new Node(15);
        node.next.next.next=new Node(25);
        int k=2;
      int sum= Display(node,k);
      System.out.print(sum);


    }
    
}
