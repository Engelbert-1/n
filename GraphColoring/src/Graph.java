import java.util.*;
public class Graph {
    private int V; // số đỉnh
    private LinkedList<Integer> adj[]; // danh sách kề

    public Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    // Thêm một cạnh vào đồ thị
    public void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v); // Đồ thị vô hướng
    }

    // Tô màu đồ thị bằng thuật toán tuần tự
    public void sequentialColoring() {
        int result[] = new int[V];
        int colors[] = new int[V];

        // Khởi tạo tất cả các đỉnh chưa được tô màu
        Arrays.fill(result, -1);

        // Xác định thứ tự của các đỉnh
        int[] verticesOrder = new int[V];
        for (int i = 0; i < V; i++) {
            verticesOrder[i] = i;
        }
        // Bạn có thể thay đổi thứ tự của các đỉnh ở đây nếu cần

        // Duyệt qua các đỉnh của đồ thị theo thứ tự
        for (int i = 0; i < V; i++) {
            int vertex = verticesOrder[i];

            // Tìm các màu đã được sử dụng bởi các đỉnh kề
            Arrays.fill(colors, 0);
            Iterator<Integer> it = adj[vertex].iterator();
            while (it.hasNext()) {
                int neighbor = it.next();
                if (result[neighbor] != -1) {
                    colors[result[neighbor]] = 1;
                }
            }

            // Tìm màu đầu tiên chưa được sử dụng
            int color;
            for (color = 0; color < V; color++) {
                if (colors[color] == 0) {
                    break;
                }
            }
            
            // Gán màu cho đỉnh
            result[vertex] = color;
        }

        // In kết quả
        System.out.println("Tô màu đồ thị bằng thuật toán tuần tự:");
        for (int u = 0; u < V; u++)
            System.out.println("Đỉnh " + u + " được tô màu " + result[u]);
    }
}