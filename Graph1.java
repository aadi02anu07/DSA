import java.util.*;
import java.util.LinkedList;

public class Graph1 {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));
    }

    public static void BFS(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                BFSutil(graph, vis);
            }
        }
    }

    public static void BFSutil(ArrayList<Edge>[] graph, boolean vis[]) { // O(V+E) // V= no. of vertices and E=no. of
                                                                         // Edges || for matrice it is O(V^2)
        Queue<Integer> q = new LinkedList<>();
        q.add(0); // source=0

        while (!q.isEmpty()) {
            int curr = q.remove();

            if (!vis[curr]) { // visit curr
                System.out.print(curr + " ");
                vis[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void DFS(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            DFSutil(graph, i, vis);
        }
    }

    public static void DFSutil(ArrayList<Edge>[] graph, int curr, boolean vis[]) { // O(V+E)
        // visit
        System.out.print(curr + " ");
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                DFSutil(graph, e.dest, vis);
            }
        }
    }

    // hasPath
    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean vis[]) {
        if (src == dest) {
            return true;
        }

        vis[src] = true;

        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            // e.dest=neighbour
            if (!vis[e.dest] && hasPath(graph, e.dest, dest, vis)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        /*
         * (5)
         * 1
         * / \
         * (1)/ \(3)
         * / \
         * 2 ------- 3
         * | \ (1)
         * (2)| |
         * | |
         * 4
         */

        /*
         * // Creating a Graph
         * int V = 5;
         * 
         * @SuppressWarnings("unchecked")
         * ArrayList<Edge>[] graph = new ArrayList[V]; // here we declared array of
         * ArrayList
         * // Abhi upr vale ke Array ke har index pe null stored hai
         * 
         * for (int i = 0; i < V; i++) {
         * graph[i] = new ArrayList<>(); // Hamne array ke har index pe arrayList create
         * krdiya
         * }
         * 
         * // 0 -vertex
         * graph[0].add(new Edge(0, 1, 5)); // yaha ham first index of array pe gye and
         * list me edge create kardi
         * 
         * // 1 vertex
         * graph[1].add(new Edge(1, 0, 5));
         * graph[1].add(new Edge(1, 2, 1));
         * graph[1].add(new Edge(1, 3, 3));
         * 
         * // 2 vertex
         * graph[2].add(new Edge(2, 1, 1));
         * graph[2].add(new Edge(2, 3, 1));
         * graph[2].add(new Edge(2, 4, 4));
         * 
         * // 3 vertex
         * graph[3].add(new Edge(3, 1, 3));
         * graph[3].add(new Edge(3, 2, 1));
         * 
         * // 4 vertex
         * graph[4].add(new Edge(4, 2, 2));
         * 
         * // 2's neighbors
         * for (int i = 0; i < graph[2].size(); i++) {
         * Edge e = graph[2].get(i); // edge will contain src, dest, wt
         * System.out.println(e.dest);
         * }
         */
        /*
         * 1 --- 3
         * / | \
         * 0 | 5 --- 6
         * \ | /
         * 2 --- 4
         */

        int V = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        // BFS
        // BFS(graph);

        // DFS
        // DFS(graph, 0, new boolean[V]);

        // hasPath
        System.out.println(hasPath(graph, 0, 5, new boolean[V]));
    }
}
