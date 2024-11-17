package LINKEDLIST;

public class EndElement {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static int  Display(Node head, int n){
         Node temp=head;
         int length=0;
         while(temp!=null){
            temp=temp.next;
            length++;
         }
         if(length<n)
            return -1;
         temp=head;
         for(int i=1;i<length-n+1;i++){
            temp=temp.next;
         }
         return temp.data;
    }
    public static void main(String[] args) {
        Node node=new Node(1);
        node.next=new Node(2);
        node.next.next=new Node(3);
        node.next.next.next=new Node(4);
        int index=3;
       System.out.println(Display(node, index));
    }
    
}
