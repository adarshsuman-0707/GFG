import java.util.*;

// same as  for prims algorithm  is case me sptset = mstset 
public class Dijstktra {

   public static void  dijs(int graph[][],int s){
    int v=graph.length;
    int [] ans=new int[v];
    boolean [] sptset=new boolean[v];
    Arrays.fill(ans,Integer.MAX_VALUE);
    ans[s]=0;
    for(int i=0;i<v-1;i++){
        int u=minDistance(ans,sptset);
        sptset[u]=true;
        for(int x=0;x<v;x++){
            if (!sptset[x] && graph[u][x]!=0&& ans[u]+graph[u][x]<ans[x]) {
                ans[x]=ans[u]+graph[u][x];
            }
        }
    }
    for(int i:ans){
        System.out.println(i);
    }
   }
   static int minDistance(int ans[],boolean sptset[] ){
    int min=Integer.MAX_VALUE;
    int minindx=-1;
    for(int v=0;v<ans.length;v++){
        if(!sptset[v]&& ans[v]<=min){
            min=ans[v];
            minindx=v;
        }
    }

    return minindx;

   }
    public static void main(String[] args) {
        int [][]graph={{0,1,0,2,0,0},{1,0,3,1,0,0},{0,3,0,0,2,4},{2,1,0,0,1,0},{0,0,2,1,0,1},{0,0,4,0,1,0}};

       dijs(graph,0);

    }
}
