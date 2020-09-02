import java.util.*;
import java.io.*;

public class haspath{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int vrts = Integer.parseInt(br.readLine());
        ArrayList<Edge>[] graph = new ArrayList[vrts];
        for(int i = 0 ;i < vrts; i++){
            graph[i] = new ArrayList<Edge>();
        }

        int edge = Integer.parseInt(br.readLine());
        for(int i = 0; i < edge; i++){
            String parts[] = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            int wt = Integer.parseInt(parts[2]);
            graph[v1].add(new Edge(v1,v2,wt));
            graph[v2].add(new Edge(v2,v1,wt));
        }
        int src = Integer.parseInt(br.readLine());
        int dest = Integer.parseInt(br.readLine());
        
        boolean[] visited = new boolean[vrts];
        System.out.println(hasPath(graph,src,dest,visited));
    }
    static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean[] visited){
        if(src == dest){
            return true;
        }
        visited[src] = true;
        for(Edge edge : graph[src]){
            if(!visited[edge.neighbour]){
                boolean ans = hasPath(graph,edge.neighbour,dest,visited);
                if(ans){
                    return true;
                }
            }
        }
        return false;
    }
}