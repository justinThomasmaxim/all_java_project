package MODUL_4;

// ========================(ALGORITMA Bellman Ford)===========================

public class Tugas2 {
    
    // inner class
    class Edge {
        int weight;
        char src, dest;

        // constructur inner class Edge
        Edge() {
            src = ' ';
            dest = ' ';
            weight = 0;
        }
    }

    int V, E;
    Edge edge[];

    // constructur class Tugas2
    Tugas2(int v, int e) {
        V = v;
        E = e;
        edge = new Edge[e];
        for (int i = 0; i < e; ++i)
            edge[i] = new Edge();
    }

    void BellmanFord(Tugas2 graph, int src) {

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
                if (dist[u-65] != Integer.MAX_VALUE && dist[u-65] + weight < dist[v-65])
                    // maka set dist v = dist u + dist untuk ke v
                    dist[v-65] = dist[u-65] + weight;
            }
        }

        /* lakukan iterasi sekali lagi untuk memastikan data tidak berubah
         * jika data nya berubah / di update lagi, maka ada cycle negatif
         */
        for (int j = 0; j < E; ++j) {
            int u = graph.edge[j].src;
            int v = graph.edge[j].dest;
            int weight = graph.edge[j].weight;

            if (dist[u-65] != Integer.MAX_VALUE && dist[u-65] + weight < dist[v-65]) {

                System.out.println("Tugas2 contains negative weight cycle");
                return;
            }
        }
        printArr(dist, V, src);
    }

    void printArr(int dist[], int V, int src) {
        System.out.println("Vertex\t\tShortest Distance from Source = " + (char)(src+65) );
        for (int i = 0; i < V; ++i)
            System.out.println( (char)(i+65) + "\t\t\t\t" + dist[i]);
    }

    public static void main(String[] args) {
        int V = 5;
        int E = 9;
        Tugas2 graph = new Tugas2(V, E);

        System.out.println("\033[H\033[2J");

        // inisialisasi edge pada graphnya
        graph.edge[0].src = 'A';
        graph.edge[0].dest = 'B';
        graph.edge[0].weight = 6;

        graph.edge[1].src = 'A';
        graph.edge[1].dest = 'E';
        graph.edge[1].weight = 7;

        graph.edge[2].src = 'B';
        graph.edge[2].dest = 'C';
        graph.edge[2].weight = 5;

        graph.edge[3].src = 'B';
        graph.edge[3].dest = 'D';
        graph.edge[3].weight = -4;

        graph.edge[4].src = 'B';
        graph.edge[4].dest = 'E';
        graph.edge[4].weight = 8;

        graph.edge[5].src = 'C';
        graph.edge[5].dest = 'B';
        graph.edge[5].weight = -2;

        graph.edge[6].src = 'D';
        graph.edge[6].dest = 'C';
        graph.edge[6].weight = 7;

        graph.edge[7].src = 'E';
        graph.edge[7].dest = 'C';
        graph.edge[7].weight = -3;

        graph.edge[8].src = 'E';
        graph.edge[8].dest = 'D';
        graph.edge[8].weight = 9;

        graph.BellmanFord(graph, 0);
    }
}
