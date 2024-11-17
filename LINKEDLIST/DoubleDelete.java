package LINKEDLIST;

public class DoubleDelete {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
        }
    }
    public static Node Delete(Node head){
        if(head==null){
            return null;
        }
        Node temp=head;
        head=head.next;
        if(head!=null){
            head.prev=null;
        }
        return head;
    }
    public static  void Display(Node head){
        Node cur=head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
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
        a=Delete(a);
        Display(a);
    }
    
}
