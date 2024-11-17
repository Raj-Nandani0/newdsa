package LINKEDLIST;

public class Delete {
   static class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
   }
   public static Node remove(Node head){
    Node temp=head;
    head=head.next;
    temp=null;
     return head;
   }
   public static void  display(Node head){
    Node cur= head;
      while(cur!=null){
        System.out.print(cur.data+" ");
        cur=cur.next;
      }
   }
   public static void main(String[] args) {
     Node node=new Node(5);
     node.next=new Node(10);
     node.next.next=new Node(15);
     node.next.next.next=new Node(25);
     node= remove(node);
     display(node);
   }
    
}
