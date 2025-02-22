package TREE;

public class SearchBst {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
     }
     public static Node insert(Node root, int val){
        if(root==null){
             root=new Node(val);
             return root;
        }
        if(root.data>val){
            root.left=insert(root.left, val);
        }
        else{
            root.right=insert(root.right, val);
        }
        return root;
     }
      public static boolean Search(Node root, int key){

        if(root==null){
            return false;
        }
        if(root.data >key){
            return Search(root.left, key);
        }
         else if(root.data==key){
            return true;
         }
         else if(root.data<key){
              return Search(root.right,key);
         }
         return true;
      }   
     public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
     }
     public static void main(String[] args) {
         int val[]={5,1,3,4,2,7};
         Node root=null;
         int key=1;
         for(int i=0;i<val.length;i++){
               root=insert(root,val[i]);
         }
         inorder(root);
        if(Search(root, 10)){
            System.out.println("found");
        }
        else{
            System.out.println("Not Found");
        }
     }
}


