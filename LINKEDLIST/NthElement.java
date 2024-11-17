package LINKEDLIST;

public class NthElement {
    public static  class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
   public static void  Linkedlist(Node head, int id){
        Node temp=head;
        int count=1;
        while(temp!=null){
            if(count==id){
                System.out.println(temp.data);
            }
            count++;
            temp=temp.next;
            
        }
   }
    public static void main(String[] args) {
        Node node=new Node(1);
        node.next=new Node(10);
        node.next.next=new Node(15);
        node.next.next.next=new Node(20);
        int index=2;
        Linkedlist(node, index);
    }
    
}
