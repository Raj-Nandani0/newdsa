package LINKEDLIST;

public class DeleteMiddle {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node Delete(Node head){
       Node p1=head,p2=head;
       int count=0;
       while(p1!=null){
        count++;
        p1=p1.next;
       }
       p2=p2.next;
       p2.next=p2.next.next;
       return head;
    }
    public static void Display(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    public static void main(String[] args) {
        Node node=new Node(1);
        node.next=new Node(2);
        node.next.next=new Node(3);
        node.next.next.next=new Node(4);
        node=Delete(node);
        Display(node);
    }
    
}
