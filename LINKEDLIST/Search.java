package LINKEDLIST;

public class Search {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static boolean display(Node head, int key){
        Node temp=head;
        while(temp!=null){
          if(temp.data==key){
            return true;
          }
          temp=temp.next;
        }
        return  false;
    }
    public static void main(String[] args) {
        Node node=new Node(5);
        node.next=new Node(10);
        node.next.next=new Node(20);
        node.next.next.next=new Node(25);
         int key=10;
        if(display(node, key)){
            System.out.println("yes");
        }
        else{
            System.err.println("No");
        }
    }
    
}
