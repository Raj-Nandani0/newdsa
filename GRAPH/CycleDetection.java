package GRAPH;

import java.util.ArrayList;

public class CycleDetection {
  static class Edge{
    int src;
    int dest;
    Edge(int s, int d){
        this.src=s;
        this.dest=d;
    }
  }
  public static void creategraph(ArrayList<Edge> graph[]){
    for(int i=0;i<graph.length;i++){
         graph[i]=new ArrayList<Edge>();
    }
    graph[0].add(new Edge(0,2));
    graph[1].add(new Edge(1,0));
    graph[2].add(new Edge(2,3));
    graph[3].add(new Edge(3,0));
  } 
   public static boolean IsCycle(ArrayList<Edge>graph[], boolean vist[], int cur, boolean rec[]){
    vist[cur]=true;
    rec[cur]=true;

    for(int i=0;i<graph[cur].size();i++){
          Edge e=graph[cur].get(i);
          if(rec[e.dest]==true){
              return true;
          }
          else if(!vist[e.dest]){
            if(IsCycle(graph, vist, e.dest, rec)){
                return true;
            }
          }
    }
    rec[cur]=false;
    return false;
   }
   public static void main(String[] args) {
    int V=6;
    ArrayList<Edge> graph[]=new ArrayList[V];
    creategraph(graph);
    System.out.println(IsCycle(graph, new boolean [V], 0, new boolean[V]));
}
    
}
