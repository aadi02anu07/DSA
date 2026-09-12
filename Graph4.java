import java.util.*;

public class Graph4 {
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

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    // Bellman ford
    // Edge[]
    static void createGraph2(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));
    }

    static class Pair implements Comparable<Pair> {
        int n;
        int path;

        public Pair(int n, int path) {
            this.n = n;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.path - p2.path; // path based sorting for my pairs
        }
    }

    public static void dijktra(ArrayList<Edge> graph[], int src) {
        int dist[] = new int[graph.length]; // dist[i] -> src to i
        for (int i = 0; i < graph.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE; // +infinity
            }
        }

        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));
        // Loop for bfs
        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!vis[curr.n]) {
                vis[curr.n] = true;
                // neighbours
                for (int i = 0; i < graph[curr.n].size(); i++) {
                    Edge e = graph[curr.n].get(i);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    if (dist[u] + wt < dist[v]) { // update distance of src to v;
                        dist[v] = dist[u] + wt;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }
        // print all source to vertices shortest dist
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }

    public static void bellmanFord(ArrayList<Edge> graph[], int src) { // TC = O(V*E)
        int dist[] = new int[graph.length];
        for (int i = 0; i < dist.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        int V = graph.length;
        // algo
        for (int i = 0; i < V - 1; i++) { // outerloop TC = O(V)
            {
                // edges: Inner loop TC = O(E)
                for (int j = 0; j < graph.length; j++) {
                    for (int k = 0; k < graph[j].size(); k++) {
                        Edge e = graph[j].get(k);
                        // u,v,wt
                        int u = e.src;
                        int v = e.dest;
                        int wt = e.wt;
                        // relaxation
                        if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
                            dist[v] = dist[u] + wt;
                        }
                    }
                }
            }

        }

        // print
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }

    // Prims Algo MST
    static void createGraph3(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
    }

    static class Pair2 implements Comparable<Pair2> {
        int v;
        int cost;

        public Pair2(int v, int cost) {
            this.v = v;
            this.cost = cost;
        }

        @Override
        public int compareTo(Pair2 p2) {
            return this.cost - p2.cost; // ascending order sorting
        }
    }

    public static void prims(ArrayList<Edge> graph[]) { // O(ElogE)
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair2> pq = new PriorityQueue<>();
        pq.add(new Pair2(0, 0));
        int finalCost = 0; // MST cost //Total min weight

        while (!pq.isEmpty()) {
            Pair2 curr = pq.remove();
            if (!vis[curr.v]) {
                vis[curr.v] = true;
                finalCost += curr.cost;

                for (int i = 0; i < graph[curr.v].size(); i++) {
                    Edge e = graph[curr.v].get(i);
                    pq.add(new Pair2(e.dest, e.wt));
                }
            }
        }
        System.out.println("Minimum cost of MST = " + finalCost);
    }

    public static void main(String[] args) {
        /*
         * // Dijktra's
         * int V = 6;
         * 
         * @SuppressWarnings("unchecked")
         * ArrayList<Edge> graph[] = new ArrayList[V];
         * createGraph(graph);
         * 
         * int src = 0;
         * dijktra(graph, src);
         * 
         * // Bellman ford
         * int V = 5;
         * 
         * @SuppressWarnings("unchecked")
         * ArrayList<Edge> graph[] = new ArrayList[V];
         * createGraph2(graph);
         * bellmanFord(graph, 0);
         */

        // Prim's Algo for MST
        int V = 4;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph3(graph);

        prims(graph);
    }
}
