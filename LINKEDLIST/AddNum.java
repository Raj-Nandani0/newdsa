package LINKEDLIST;

public class AddNum {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node Display(Node head){
        Node cur=head;
        int length=0;
        int count=0;
        int sum=1;
        while(cur!=null){
            length++;
            cur = cur.next;
        }
        while(cur!=null){
            if(count==length){
                cur.data+=sum;
                break;
            }
            cur=cur.next;
            count++;
        }
        return head;
    }
    public static void show(Node head){
        Node temp=head;
        while(temp!=null){
           System.out.println(temp.data);
           temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node node=new Node(5);
        node.next=new Node(10);
        node.next.next=new Node(15);
        node.next.next.next=new Node(25);
        Display(node);
        show(node);
    }
    
}
