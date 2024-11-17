package LINKEDLIST;

public class PairWise {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void PairWise(Node head){
        if( head!=null || head.next!=null){
            return;
        }
        int temp=head.data;
        head.data=head.next.data;
        head.next.data=temp;
        PairWise(head.next.next);

    }
    public static void Display(Node head){
        Node cur=head;
        while(cur!=null){
            System.out.println(cur.data);
            cur=cur.next;
        }
    }
    public static void main(String[] args) {
        Node node=new Node(1);
        node.next=new Node(2);
        node.next.next=new Node(3);
        node.next.next.next=new Node(4);
        node.next.next.next.next=new Node(5);
        node.next.next.next.next.next=new Node(6);
        PairWise(node);
        Display(node);
    }
    
}
