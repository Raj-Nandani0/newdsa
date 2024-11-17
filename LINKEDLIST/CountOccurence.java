package LINKEDLIST;

public class CountOccurence {
    public static  class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node KeyMethode(Node head, int key){
        int count=0;
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                count++;
            }
            temp=temp.next;
        }
        System.out.println(count+" ");
        return head;
    }
    public static void main(String[] args) {
        Node node=new Node(1);
        node.next=new Node(2);
        node.next.next=new Node(1);
        node.next.next.next=new Node(2);
        node.next.next.next.next=new Node(1);
        node.next.next.next.next.next=new Node(3);
        int key=1;
        node= KeyMethode(node,key);
        

    }
    
}
