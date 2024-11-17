package LINKEDLIST;

public class DoubleInsert {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;

        }
    }
    public static Node insert(Node head, int data){
        Node new_node=new Node(data);
        new_node.next=head;
        if(head!=null){
            head.prev=new_node;
        }
        return new_node;
    }
    public static void Display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
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
         int data=2;
         a=insert(a, data);
         Display(a);
    }
    
}
