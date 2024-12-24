import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WGraph graph = new WGraph();

        // Read the adjacency matrix and labels from files
        try {
            Scanner matrixScanner = new Scanner(new File("adjacency_matrix.txt"));
            List<int[]> matrixList = new ArrayList<>();
            while (matrixScanner.hasNextLine()) {
                String[] line = matrixScanner.nextLine().trim().split("\\s+");
                int[] row = Arrays.stream(line).mapToInt(Integer::parseInt).toArray();
                matrixList.add(row);
            }
            int[][] adjacencyMatrix = matrixList.toArray(new int[0][0]);
            graph.setAMatrix(adjacencyMatrix, adjacencyMatrix.length);

            Scanner labelScanner = new Scanner(new File("labels.txt"));
            if (labelScanner.hasNextLine()) {
                String[] labels = labelScanner.nextLine().trim().split("\\s+");
                graph.setLabel(labels);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }

        // Perform graph traversals and shortest path calculation
        System.out.println("Breadth First Traverse:");
        graph.breadthFirstTraverse(0);

        System.out.println("Depth First Traverse:");
        graph.depthFirstTraverse(0);

        System.out.println("Dijkstra's Shortest Path:");
        graph.dijkstra(0);
    }
}