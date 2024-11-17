package LINKEDLIST;

public class MoveLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node Reverse(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node seclast=null;
        Node last=head;
    while(last.next!=null){
        seclast=last;
        last=last.next;
    }
         seclast.next=null;
         head=last;
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
        node.next.next.next.next=new Node(5);
        node=Reverse(node);
        Display(node);
    }
    
}
