package LINKEDLIST;

public class Insert {
        static class Node{
            int data;
            Node next;
            Node(int data){
                this.data=data;
            }
        }
         
       public static Node add(Node head, int new_data){
            Node new_node=new Node(new_data);
            new_node.next=head;
            head=new_node;
            return new_node;
        }
        public static void display( Node head){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        public static void main(String[] args) {
            Node node=new Node(10);
            node.next=new Node(15);
            node.next.next=new Node(20);
            int data=5;
            node=add(node, data);
            display(node);
        }
        
    }
    

