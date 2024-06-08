package MODUL_4;

// ========================(ALGORITMA Dijkstra)===========================

import java.util.*;

public class Tugas2_dijkstra {
    private static int INF = Integer.MAX_VALUE;
    private int[][] graph;
    private int[] dist;
    private boolean[] visited;
    private int start, end;

    public Tugas2_dijkstra(int[][] graph, int start, int end) {
        this.graph = graph;
        this.start = start;
        this.end = end;
        this.dist = new int[graph.length];
        Arrays.fill(dist, INF);
        dist[start] = 0;
        this.visited = new boolean[graph.length];
    }

    public void run() {
        for (int i = 0; i < graph.length; i++) {
            int curNode = getMinDistanceNode();
            visited[curNode] = true;
            for (int j = 0; j < graph.length; j++) {
                int weight = graph[curNode][j];
                if (weight != 0 && !visited[j]) {
                    int newDist = dist[curNode] + weight;
                    if (newDist < dist[j]) {
                        dist[j] = newDist;
                    }
                }
            }
            printPath(curNode);
            System.out.println();
        }
    }

    private int getMinDistanceNode() {
        int min = INF;
        int minNode = -1;
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i] && dist[i] < min) {
                min = dist[i];
                minNode = i;
            }
        }
        return minNode;
    }

    private void printPath(int curNode) {
        System.out.print("Moving from " + start + " to " + curNode + ": ");
        if (dist[curNode] == INF) {
            System.out.println("No path found");
            return;
        }
        List<Integer> path = new ArrayList<>();
        int node = curNode;
        path.add(node);
        while (node != start) {
            for (int i = 0; i < graph.length; i++) {
                if (graph[i][node] != 0 && dist[node] == dist[i] + graph[i][node]) {
                    path.add(0, i);
                    node = i;
                    break;
                }
            }
        }
        System.out.print(start);
        for (int i = 1; i < path.size(); i++) {
            System.out.print(" -> " + path.get(i));
        }
        System.out.print("; \t\tDistance = " + dist[curNode]);
    }

    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        int[][] graph = new int[][] {{0,6,0,0,7},{0,0,5,-4,8},{0,-2,0,0,0},{0,0,7,0,0},{0,0,-3,9,0}};
        int start = 0, end = 4;
        Tugas2_dijkstra dijkstra = new Tugas2_dijkstra(graph, start, end);
        dijkstra.run();
    }
}