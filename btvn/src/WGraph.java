import java.util.*;

public class WGraph {
    int[][] a; // adjacency matrix
    String[] label; // vertex labels
    int n; // number of vertices

    // Constructor
    public WGraph() {
        // Initialize the graph with default values
        a = new int[0][0];
        label = new String[0];
        n = 0;
    }

    // Set adjacency matrix
    public void setAMatrix(int[][] b, int m) {
        n = m;
        a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = b[i][j];
            }
        }
    }

    // Set labels
    public void setLabel(String[] c) {
        label = new String[c.length];
        System.arraycopy(c, 0, label, 0, c.length);
    }

    // Breadth First Traverse
    public void breadthFirstTraverse(int start) {
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int v = queue.poll();
            System.out.print(label[v] + " ");
            for (int i = 0; i < n; i++) {
                if (a[v][i] != 0 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
        System.out.println();
    }

    // Depth First Traverse
    public void depthFirstTraverse(int start) {
        boolean[] visited = new boolean[n];
        depthFirstTraverseUtil(start, visited);
        System.out.println();
    }

    private void depthFirstTraverseUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(label[v] + " ");
        for (int i = 0; i < n; i++) {
            if (a[v][i] != 0 && !visited[i]) {
                depthFirstTraverseUtil(i, visited);
            }
        }
    }

    // Dijkstra's Shortest Path Algorithm
    public void dijkstra(int src) {
        int[] dist = new int[n];
        boolean[] sptSet = new boolean[n];

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        for (int count = 0; count < n - 1; count++) {
            int u = minDistance(dist, sptSet);
            sptSet[u] = true;

            for (int v = 0; v < n; v++) {
                if (!sptSet[v] && a[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + a[u][v] < dist[v]) {
                    dist[v] = dist[u] + a[u][v];
                }
            }
        }

        printSolution(dist);
    }

    private int minDistance(int[] dist, boolean[] sptSet) {
        int min = Integer.MAX_VALUE, minIndex = -1;

        for (int v = 0; v < n; v++) {
            if (!sptSet[v] && dist[v] <= min) {
                min = dist[v];
                minIndex = v;
            }
        }
        return minIndex;
    }

    private void printSolution(int[] dist) {
        System.out.println("Vertex Distance from Source");
        for (int i = 0; i < n; i++) {
            System.out.println(label[i] + " \t\t " + dist[i]);
        }
    }
}