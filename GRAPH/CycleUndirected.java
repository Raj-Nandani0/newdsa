package GRAPH;

import java.util.ArrayList;

public class CycleUndirected {
    static class Edge{
        int src;
        int dest;
        Edge(int s, int d){
            this.dest=d;
            this.src=s;
        }
    }

     public static void creategraph(ArrayList<Edge> graph[]){
    for(int i=0;i<graph.length;i++){
         graph[i]=new ArrayList<Edge>();
    }
    graph[0].add(new Edge(0,1));
    graph[0].add(new Edge(0,4));
    graph[1].add(new Edge(1,0));
    graph[1].add(new Edge(1,2));
    graph[1].add(new Edge(1,4));
    graph[2].add(new Edge(2,3));
    graph[2].add(new Edge(2,1));
    graph[3].add(new Edge(3,2));
    graph[4].add(new Edge(4,0));
    graph[4].add(new Edge(4,1));
    graph[4].add(new Edge(4,5));
    graph[5].add( new Edge(5,4));
  } 
    public  static boolean DFS(ArrayList<Edge> graph[],boolean vist[], int cur,int par){
        vist[cur]=true;
        for(int i=0;i<graph[cur].size();i++){
            Edge e=graph[cur].get(i);
            if(vist[e.dest] && e.dest!=par){
                return true;
            }
            else if(!vist[e.dest]){
                  if(DFS(graph, vist,e.dest, cur))
                  return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int V=6;
        ArrayList<Edge> graph[]=new ArrayList[V];
        creategraph(graph);
       System.out.println(DFS(graph, new boolean[V], 0, -1));
    }
}
