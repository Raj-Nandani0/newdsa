package GRAPH;

import java.util.ArrayList;
import java.util.Stack;

public class Topological {
    static class Edge{
        int src;
        int dest;
        Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void Creategraph(ArrayList<Edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
     graph[2].add(new Edge(2,3));

     graph[3].add(new Edge(3,1));

     graph[4].add(new Edge(4,0));
     graph[4].add(new Edge(4,1));

     graph[5].add(new Edge(5,0));
     graph[5].add(new Edge(5,2));
    } 
    public static void Topoutil(ArrayList<Edge>graph[], int cur, boolean vist[], Stack<Integer> stack) {
        vist[cur]=true;
        for(int i=0;i<graph[cur].size();i++){
            Edge e=graph[cur].get(i);
            if(!vist[cur]){
                Topoutil(graph, e.dest, vist, stack);
            }
        }
        stack.push(cur);
    }
    public static void Toposort(ArrayList<Edge>graph[],int v){
        boolean vist[]=new boolean[v];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<v;i++){
              if(!vist[i]){
                Topoutil(graph, i, vist, stack);
              }
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
    public static void main(String[] args) {
        int v=6;
        ArrayList<Edge> graph[]=new ArrayList[v];
        Creategraph(graph);
        Toposort(graph, v);
    }

}







