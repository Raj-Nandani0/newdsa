package LINKEDLIST;

public class MidElement {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static int Length(Node head){
        int length=0;
        while(head!=null){
            length++;
            head=head.next;
        }
        return length;
    }
    public static void  Display(Node head, int length){
        int mid=length/2;
        while(mid>0){
         head=head.next;
            mid--;
        }
        System.out.println(head.data);
    }
    public static void main(String[] args) {
        Node node=new Node(1);
        node.next=new Node(2);
        node.next.next=new Node(4);
        node.next.next.next=new Node(5);
        node.next.next.next=new Node(6);
        int size=Length(node);
        Display(node, size);
    }
    
}
