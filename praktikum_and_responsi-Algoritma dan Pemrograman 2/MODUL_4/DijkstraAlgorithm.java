package MODUL_4;

// ========================(ALGORITMA DJIKSTRA)===========================

public class DijkstraAlgorithm {
    public static void dijkstra(int[][] graph, int source) {
        int count = graph.length;
        boolean[ ] visitedVertex = new boolean[count];
        int[ ] distance = new int[count];
        for (int i = 0; i < count; i++) {
            visitedVertex[i] = false;
            distance[i] = Integer.MAX_VALUE;
        }
        distance[source] = 0;
        for (int i = 0; i < count; i++) {
            int u = findMinDistance(distance, visitedVertex);
            visitedVertex[u] = true;
            for (int v = 0; v < count; v++) {
                if (!visitedVertex[v] && graph[u][v] != 0 && (distance[u] + graph[u][v] < distance[v])) {
                    distance[v] = distance[u] + graph[u][v];
                }
            }
        }
        for (int i = 0; i < distance.length; i++) {
            System.out.println(String.format("Distance from %s to %s is %s", source, i, distance[i]));
        }
    }

    private static int findMinDistance(int[] distance, boolean[] visitedVertex) {
        int minDistance = Integer.MAX_VALUE;
        int minDistanceVertex = -1;
        for (int i = 0; i < distance.length; i++) {
            if (!visitedVertex[i] && distance[i] < minDistance) {
                minDistance = distance[i];
                minDistanceVertex = i;
            }
        }
        return minDistanceVertex;
    }
    
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        int graph[][] = new int[][] {
            { 0, 10, 7, 0, 15 },
            { 10, 0, 9, 6, 5 },
            { 7, 9, 0, 2, 8}, 
            { 0, 6, 2, 0, 4 },
            { 15, 5, 8, 4, 0 }
        };
        DijkstraAlgorithm T = new DijkstraAlgorithm();
        T.dijkstra(graph, 0);
    }
}

