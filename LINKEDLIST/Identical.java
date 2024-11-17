package LINKEDLIST;

public class Identical {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Boolean Show(Node head1, Node head2){
        while(head1!=null && head2!=null){
            if(head1.data!=head2.data){
                return false;
            }
            head1=head1.next;
            head2=head2.next;
        }
        return(head1==null && head2==null);
    }
    public static void main(String[] args) {
        //First data
        Node node1=new Node(1);
        node1.next=new Node(2);
        node1.next.next=new Node(3);
      
        //Second data
        Node node2=new Node(1);
        node2.next=new Node(2);
        node2.next.next=new Node(3);
        if(Show(node1, node2)){
            System.out.println("True");
        }
        else{
            System.out.println("false");
        }

    }
    
}
