import java.util.*;

class WGraph {
    private int[][] a; 
    private String[] label; 
    private int n; 

    public void setAMatrix(int[][] b, int m) {
        this.a = b;
        this.n = m;
    }

    public void setLabel(String[] c) {
        this.label = c;
    }

    public List<String> bfs(int start) {
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        List<String> traversal = new ArrayList<>();

        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int v = queue.poll();
            traversal.add(label[v]);

            for (int i = 0; i < n; i++) {
                if (a[v][i] > 0 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
        return traversal;
    }

    public List<String> dfs(int start) {
        boolean[] visited = new boolean[n];
        List<String> traversal = new ArrayList<>();
        dfsUtil(start, visited, traversal);
        return traversal;
    }

    private void dfsUtil(int v, boolean[] visited, List<String> traversal) {
        visited[v] = true;
        traversal.add(label[v]);

        for (int i = 0; i < n; i++) {
            if (a[v][i] > 0 && !visited[i]) {
                dfsUtil(i, visited, traversal);
            }
        }
    }

    public Map<String, Integer> dijkstra(int start) {
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(pair -> pair[1]));
        pq.add(new int[]{start, 0});

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int u = current[0];
            int currentDist = current[1];

            if (currentDist > dist[u]) continue;

            for (int v = 0; v < n; v++) {
                if (a[u][v] > 0) {
                    int newDist = dist[u] + a[u][v];
                    if (newDist < dist[v]) {
                        dist[v] = newDist;
                        pq.add(new int[]{v, newDist});
                    }
                }
            }
        }

        Map<String, Integer> shortestPaths = new HashMap<>();
        for (int i = 0; i < n; i++) {
            shortestPaths.put(label[i], dist[i]);
        }
        return shortestPaths;
    }

    public static void main(String[] args) {
        WGraph graph = new WGraph();
        int[][] adjMatrix = {
            {0, 5, 0, 0, 2, 1},
            {5, 0, 4, 0, 0, 1},
            {0, 4, 0, 2, 0, 1},
            {0, 0, 2, 0, 3, 50},
            {2, 0, 0, 3, 0, 7},
            {1, 1, 1, 50, 7, 0}
        };
        String[] labels = {"1", "2", "3", "4", "5", "6"};

        graph.setAMatrix(adjMatrix, 6);
        graph.setLabel(labels);

        System.out.println("BFS: " + graph.bfs(0)); 
        System.out.println("DFS: " + graph.dfs(0)); 
        System.out.println("Dijkstra: " + graph.dijkstra(0)); 
    }
}