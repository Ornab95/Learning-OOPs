import java.util.*;

public class Exam {
    private int vertices;
    private LinkedList<Edge>[] adjacencyList;

    class Edge {
        int vertex, weight;

        Edge(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }

    @SuppressWarnings("unchecked")
    public Exam(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination, int weight) {
        adjacencyList[source].add(new Edge(destination, weight));
        adjacencyList[destination].add(new Edge(source, weight)); 
    }

    public void dfs(int source, int[] distances, boolean[] visited) {
        visited[source] = true;

        for (Edge edge : adjacencyList[source]) {
            int v = edge.vertex;
            int weight = edge.weight;

            if (!visited[v]) {
                if (distances[source] + weight < distances[v]) {
                    distances[v] = distances[source] + weight;
                }
                dfs(v, distances, visited);
            }
        }
    }

    public void findShortestPaths(int source) {
        int[] distances = new int[vertices];
        boolean[] visited = new boolean[vertices];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[source] = 0;

        dfs(source, distances, visited);
        printShortestPaths(distances, source);
    }

    private void printShortestPaths(int[] distances, int source) {
        for (int i = 0; i < vertices; i++) {
            System.out.println("Distance from " + (char) (source + 'a') + " to " + (char) (i + 'a') + " is " + distances[i]);
        }
    }

    
    public static void main(String[] args) {
        Exam graph = new Exam(6);

        graph.addEdge(0, 1, 5);
        graph.addEdge(0, 2, 9);
        graph.addEdge(0, 4, 1);
        graph.addEdge(1, 3, 8);
        graph.addEdge(1, 5, 3);
        graph.addEdge(2, 4, 4);
        graph.addEdge(3, 5, 7);
        graph.addEdge(5, 4, 2); 
        graph.findShortestPaths(0);
    }
}
