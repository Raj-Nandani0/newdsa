package LINKEDLIST;

public class GFG {
        public static class Node{
              int data;
              Node next;
              Node(int data){
                  this.data=data;
              }
        }
        
          public  static  void display(Node head){
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
              b.next=c;
              c.next=d;
              display(a);
        
          }   
      }
