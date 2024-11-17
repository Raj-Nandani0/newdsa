package TREE;
import java.util.*;

import java.util.LinkedList;

public class BinaryTreex {
        public static class Node{
            int data;
            Node left;
            Node right;
            Node(int data){
                this.data=data;
            }
        }
        public static class BinaryTree{
            static int id=-1;
            public static Node BuildTree(int node[]){
                id++;
                if(node[id]==-1){
                    return null;
                }
                Node newnode=new Node(node[id]);
                newnode.left=BuildTree(node);
                newnode.right=BuildTree(node);
                return newnode;
            }
        }
        public static void preorder(Node root){
            if(root==null){
                return ;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
        public static void inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        public static void postorder(Node root){
            if(root==null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
        public static int count(Node root){
              if(root==null){
                return 0;
              }
              int leftnode=count(root.left);
              int rightnode=count(root.right);
              return leftnode+rightnode+1;
        }
        public static int sum(Node root){
            if(root==null){
                return 0;
            }
            int leftsum=sum(root.left);
            int rightsum=sum(root.right);
            return leftsum+rightsum+root.data;
        }
        public static int height(Node root){
            if(root==null){
                return 0;
            }
            int leftheight=height(root.left);
            int rightheight=height(root.right);
            int result=Math.max(leftheight,rightheight)+1;
             return result;
        }
        public static void Level(Node root){
            if(root==null)
              return ;
            Queue<Node>q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node curr=q.remove();
                if(curr==null){
                    System.out.println();
                
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
                }
                else{
                    System.err.print(curr.data+" ");
                    if(curr.left!=null){
                        q.add(curr.left);
                    }
                    if(curr.right!=null){
                        q.add(curr.right);
                    }
                }
            }
        }
        public static int diameter(Node root){
            if(root==null){
                return 0;
            }
            int dia1= diameter(root.left);
            int dia2=diameter(root.right);
            int dia3=height(root.left)+height(root.right)+1;
            return Math.max(dia3, Math.max(dia1,dia2));
        }
        public static void main(String[] args) {
            int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            BinaryTree tree=new BinaryTree();
            Node root=tree.BuildTree(node);
            // preorder(root);
            // inorder(root);
           // postorder(root);
          // System.out.print(sum(root));
         // System.out.println(height(root));
           // Level(root);
            System.err.println(diameter(root));
        }
        
    }
    

