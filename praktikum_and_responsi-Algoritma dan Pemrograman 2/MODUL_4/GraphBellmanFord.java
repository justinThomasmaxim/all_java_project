package MODUL_4;

// ========================(ALGORITMA Bellman Ford)===========================

public class GraphBellmanFord {

    // inner class
    class Edge {
        int src, dest, weight;

        // constructur inner class Edge
        Edge() {
            src = dest = weight = 0;
        }
    }

    int V, E;
    Edge edge[];

    // constructur class GraphBellmanFord
    GraphBellmanFord(int v, int e) {
        V = v;
        E = e;
        edge = new Edge[e];
        for (int i = 0; i < e; ++i)
            edge[i] = new Edge();
    }

    void BellmanFord(GraphBellmanFord graph, int src) {

        int V = graph.V, E = graph.E;
        int dist[] = new int[V];

        /* untuk mengeset semua jaraknya infinity (karena masih tidak
        diketahui jadi anggapannya infinity)*/
        for (int i = 0; i < V; ++i)
            dist[i] = Integer.MAX_VALUE;

        // buat beban dari sourcenya 0, karena awalan (anggap garis start)
        dist[src] = 0;

        // for ini bagian iterasinya (sebanyak V-1)
        for (int i = 1; i < V; ++i) {
            // for dibawah ini bagian relaxation nya
            for (int j = 0; j < E; ++j) {
                int u = graph.edge[j].src;
                int v = graph.edge[j].dest;
                int weight = graph.edge[j].weight;

                /* jika dist u (sumber) tidak inf dan dist u + dist ke v
                lebih kecil dari dist v */
                if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v])
                    // maka set dist v = dist u + dist untuk ke v
                    dist[v] = dist[u] + weight;
            }
        }

        /* lakukan iterasi sekali lagi untuk memastikan data tidak berubah
         * jika data nya berubah / di update lagi, maka ada cycle negatif
         */
        for (int j = 0; j < E; ++j) {
            int u = graph.edge[j].src;
            int v = graph.edge[j].dest;
            int weight = graph.edge[j].weight;

            if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {

                System.out.println("GraphBellmanFord contains negative weight cycle");
                return;
            }
        }
        printArr(dist, V);
    }

    void printArr(int dist[], int V) {
        System.out.println("Vertex Distance from Source");
        for (int i = 0; i < V; ++i)
            System.out.println(i + "\t\t" + dist[i]);

    }

    public static void main(String[] args) {
        int V = 5;
        int E = 10;
        GraphBellmanFord graph = new GraphBellmanFord(V, E);

        System.out.println("\033[H\033[2J");

        // inisialisasi edge pada graphnya
        graph.edge[0].src = 0;
        graph.edge[0].dest = 1;
        graph.edge[0].weight = 6;

        graph.edge[1].src = 0;
        graph.edge[1].dest = 2;
        graph.edge[1].weight = 7;

        graph.edge[2].src = 1;
        graph.edge[2].dest = 2;
        graph.edge[2].weight = 8;

        graph.edge[3].src = 1;
        graph.edge[3].dest = 3;
        graph.edge[3].weight = 5;

        graph.edge[4].src = 1;
        graph.edge[4].dest = 4;
        graph.edge[4].weight = -4;

        graph.edge[5].src = 2;
        graph.edge[5].dest = 3;
        graph.edge[5].weight = -3;

        graph.edge[6].src = 2;
        graph.edge[6].dest = 4;
        graph.edge[6].weight = 9;

        graph.edge[7].src = 3;
        graph.edge[7].dest = 1;
        graph.edge[7].weight = -2;

        graph.edge[8].src = 4;
        graph.edge[8].dest = 0;
        graph.edge[8].weight = 2;

        graph.edge[9].src = 4;
        graph.edge[9].dest = 3;
        graph.edge[9].weight = 7;

        graph.BellmanFord(graph, 0);
    }
}
