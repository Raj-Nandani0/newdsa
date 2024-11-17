package LINKEDLIST;

public class DoubleLength {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
        }
    }
    public static int  Length(Node head){
        int length=0;
        Node temp=head;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        return length;

    }
    public static void main(String[] args) {
        
    Node a=new Node(5);
    Node b=new Node(10);
    Node c=new Node(15);
    Node d=new Node(20);
    a.next=b;
    b.prev=a;
    b.next=c;
    c.prev=b;
     c.next=d;
    System.out.println("Length="+Length(a));
 } 
}
