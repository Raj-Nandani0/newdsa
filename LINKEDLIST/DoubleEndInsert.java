package LINKEDLIST;

public class DoubleEndInsert {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
        }
    }
    public static Node Insert(Node head, int data){
        Node new_node=new Node(data);
        if(head==null){
            head=new_node;
        }
        else{
            Node cur=head;
            while(cur.next!=null){
                cur=cur.next;
            }
            cur.next=new_node;
            new_node.prev=cur;
        }
        return head;
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
         a= Insert(a, data);
         Display(a);
    }
    
}
