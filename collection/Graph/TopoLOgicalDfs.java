import java.util.*;
public class TopoLOgicalDfs {
    static class Edge {
        int src, dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
        
    }
    public static void createGraph(ArrayList<Edge>graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[2].add(new Edge(2, 3));
        graph[5].add(new Edge(5, 2));
        graph[5].add(new Edge(5, 0));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
    }
    public static  void dfs(ArrayList<Edge>[]graph,int curr,boolean[] vis,Stack<Integer>st){
      vis[curr] = true;
    for (int i = 0; i < graph[curr].size(); i++) {
        Edge e = graph[curr].get(i);
        if(!vis[e.dest]){
        dfs(graph, e.dest, vis,st);
        }
    }
    st.push(curr);
    }
 public static void toposort(ArrayList<Edge> graph[],int v){
    // System.out.println(graph.length);
    Stack<Integer> st=new Stack<>();
    boolean vis[]=new boolean[v];
    for(int i=0;i<v;i++){
        if(!vis[i]){
            dfs(graph,i,vis,st);
        }
    }

    while(!st.isEmpty()){
      int i=  st.pop();
      System.out.println(i);
    }
  }

// public static void dfs(ArrayList<Edge> graph[], int curr, boolean[] vis) {
//     if (vis[curr])
//         return;
//     System.out.print(curr + " ");
//     vis[curr] = true;
//     for (int i = 0; i < graph[curr].size(); i++) {
//         Edge e = graph[curr].get(i);
//         dfs(graph, e.dest, vis);
//     }

// }
    public static void main(String[] args) {
        int v=6;

        ArrayList<Edge>graph[]=new ArrayList[v];
        createGraph(graph);
        toposort(graph,v);
        // dfs(graph,4,new boolean[v]);


    }
}
