package Collection.Graph;

import java.util.*;

public class BFS {

    static class Edge {
        int src, dest, wt;

        Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w; // this compulsury nhi h , kyuki variable same nhi h
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) { // static bnana jruri h , kyuki bina object ke call hora
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 3, 1));
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 2, 1));
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[3].add(new Edge(3, 0, 1));
        graph[3].add(new Edge(3, 2, 1));
    }

    public static void bfs(ArrayList<Edge> graph[], int v) {
        boolean[] vis = new boolean[v];
        Queue<Integer> q = new ArrayDeque<>();
        q.add(0);
        // q.add & q.offer - same , q.add memory limit exceed a.offer try catch ka use
        // krke loop ko rok deta h
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!vis[curr]) {
                System.out.print(curr + " ");
                vis[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    if (!vis[e.dest])
                        q.add(e.dest);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean[] vis) {
        if (vis[curr])
            return;
        System.out.print(curr + " ");
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            dfs(graph, e.dest, vis);
        }

    }

    public static void printAllpath(ArrayList<Edge> []graph, int src, int dest, String path, boolean visited[]) {
        if(src==dest){
            System.out.println(path+" ");
            return ;
        }
        for(int i=0;i<graph[src].size();i++){
            Edge e=graph[src].get(i);
            if(!visited[e.dest]){
                visited[e.dest]=true;
                printAllpath(graph, e.dest,dest, path+e.dest, visited);
                visited[e.dest]=false;
            }
        }
    }

    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge> graph[] = new ArrayList[v]; // adjacency arraylist
        createGraph(graph);
        bfs(graph, v);
        dfs(graph,0,new boolean[v]);
        boolean[] visited = new boolean[v];
        visited[0]=true;
        printAllpath(graph, 0, 2, "0",visited);
   
    }
}