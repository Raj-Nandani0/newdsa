package GRAPH;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class ClasssRoom {
    public static class Edge{
        int src;
        int dest;
        int wt;
        Edge(int s, int d, int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    public static void creategraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length;i++){
              graph[i]= new ArrayList<>();
        }
       graph[0].add(new Edge(0,1,10));
       graph[0].add(new Edge(0,2,15));
       graph[0].add(new Edge(0,3,30));

       graph[1].add(new Edge(1,0,10));
       graph[1].add(new Edge(1,3,40));

       graph[2].add(new Edge(2,0,15));
       graph[2].add(new Edge(2,3,50));

       graph[3].add(new Edge(3,0,30));
       graph[3].add(new Edge(3,1,40));
       graph[3].add(new Edge(3,2,50));
   
    }

    public static class Pair implements Comparable<Pair>{
        int node;
        int cost;
        public  Pair(int n,int c){
            this.cost=c;
            this.node=n;
        }

        @Override
        public int compareTo(Pair p2){
            return this.cost-p2.cost;
        }
    }
 public static void PrimsAlgo(ArrayList<Edge> graph[], int v){
    PriorityQueue<Pair> pq=new PriorityQueue<>();
    boolean vist[]=new boolean[v];
    pq.add(new Pair(0,0));
     int mstcost=0;
    while(!pq.isEmpty()){
        Pair cur=pq.remove();
        if(!vist[cur.node]){
            vist[cur.node]=true;
            mstcost+=cur.cost;
            for(int i=0;i<graph[cur.node].size();i++){
                Edge e=graph[cur.node].get(i);
                if(!vist[e.dest]){
                    pq.add( new Pair(e.dest,e.wt));
                }
            }
        }

    }
    System.out.println("Mstcost=" +mstcost);
 }
   public static void main(String[] args) {
      int v=4;
      ArrayList<Edge> graph[]=new ArrayList[v];
      creategraph(graph);
      PrimsAlgo(graph, v);
   } 
    
}








