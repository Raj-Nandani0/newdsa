package LINKEDLIST;

public class Reverse {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node reverse(Node head){
        Node cur=head;
        Node pre=null;
        while(cur!=null){
           Node temp=cur.next;
           cur.next=pre;
           pre=cur;
           cur=temp;
        }
        return pre;
    }
    public static void dispaly(Node head){
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
        dispaly(node);
        System.out.println();
        node=reverse(node);
         dispaly(node);
    }
    
}
