package LINKEDLIST;

public class RemoveDuplication {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }

    }
    public static Node Remove(Node head){
        Node cur=head;
        while(cur!=null){
            if(cur.data==cur.next.data){
                Node next=cur.next.next;
                cur.next=next;
            }
            else{
                cur=cur.next;
            }
        }
        return head;
    }
    public static void Display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node node=new Node(1);
        node.next=new Node(1);
        node.next.next=new Node(2);
        node.next.next.next=new Node(3);
        node.next.next.next=new Node(3);
        node= Remove(node);
        Display(node);
    }
    
}
