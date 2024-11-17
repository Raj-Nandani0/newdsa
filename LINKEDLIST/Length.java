package LINKEDLIST;

public class Length {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static int  Count(Node head, int count){
        Node temp=head;
        while(temp!=null){
          count++;
          temp=temp.next;
        }
        return count;
    }
    public static void main(String[] args) {
        Node node=new Node(5);
        node.next=new Node(10);
        node.next.next=new Node(15);
        node.next.next.next=new Node(25);
        int size=0;
        int result=Count(node,size);
        System.err.println(result);
    }
    
}
