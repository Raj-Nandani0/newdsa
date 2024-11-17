package GRAPH;

import java.util.*;

public class ClassRoom {
    static class Edge{
        int src;
        int dest;
        Edge(int s,int d ){
            this.src=s;
            this.dest=d;
        }
    }
    static void createEdge(ArrayList<Edge>graph[]){
        for(int i=0;i<graph.length;i++){

        graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3, 2));
    }
    public static void Bfs(ArrayList<Edge>graph[], int v){
        Queue<Integer>q=new LinkedList<>();
        boolean vis[]=new boolean[v];
        q.add(0);
        while(!q.isEmpty()){
            int cur=q.remove();
            if(vis[cur]==false){
                System.out.print(cur+" ");
                vis[cur]=true;
                for(int i=0;i<graph[cur].size();i++){
                    Edge e=graph[cur].get(i);
                    q.add(e.dest);
                }
            }
        }
    } 
    public static void main(String[] args) {
        int v=4;
        ArrayList<Edge>graph[]=new ArrayList[v];
            createEdge(graph);
            Bfs(graph, v);
        /*for(int i=0;i<graph[2].size();i++){
            Edge e= graph[2].get(i);
            System.out.println(e.dest+" ");
        }*/
    }
    
}
