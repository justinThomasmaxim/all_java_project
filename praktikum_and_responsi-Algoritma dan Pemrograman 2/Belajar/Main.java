package Belajar;

import java.util.Scanner;

// ========================(ALGORITMA Bellman Ford)===========================

public class Main {
    
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

    // constructur class Main
    Main(int v, int e) {
        V = v;
        E = e;
        edge = new Edge[e];
        for (int i = 0; i < e; ++i)
            edge[i] = new Edge();
    }

    void BellmanFord(Main graph, int src) {

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
                if (dist[u - 65] != Integer.MAX_VALUE && dist[u - 65] + weight < dist[v - 65]) {

                    // maka set dist v = dist u + dist untuk ke v
                    dist[v - 65] = dist[u - 65] + weight;
                }
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
                System.out.println("Main contains negative weight cycle");
                return;
            }
        }
        printArr(dist, V, src);
    }

    void printArr(int dist[], int V, int src) {
        System.out.println("Vertex\t\tShortest Distance from Source = " + (char)(src+65) );
        for (int i = 0; i < V; ++i)
            if (i == (V - 1)) {
                System.out.println( (char)(i+65) + "\t\t\t\t" + dist[i]);
            }
    }

    public static void main(String[] args) {
        int V = 12;
        int E = 22;
        Main graph = new Main(V, E);

        // inisialisasi edge pada graphnya

        // ===== (A) =====
        graph.edge[0].src = 'A';
        graph.edge[0].dest = 'B';
        graph.edge[0].weight = 100;

        graph.edge[1].src = 'A';
        graph.edge[1].dest = 'D';
        graph.edge[1].weight = 250;

        // ===== (B) =====
        graph.edge[2].src = 'B';
        graph.edge[2].dest = 'C';
        graph.edge[2].weight = 20;

        // ===== (C) =====
        graph.edge[3].src = 'C';
        graph.edge[3].dest = 'D';
        graph.edge[3].weight = 80;

        graph.edge[4].src = 'C';
        graph.edge[4].dest = 'F';
        graph.edge[4].weight = 190;

        // ===== (D) =====
        graph.edge[5].src = 'D';
        graph.edge[5].dest = 'C';
        graph.edge[5].weight = 70;

        graph.edge[6].src = 'D';
        graph.edge[6].dest = 'E';
        graph.edge[6].weight = 180;

        // ===== (E) =====
        graph.edge[7].src = 'E';
        graph.edge[7].dest = 'G';
        graph.edge[7].weight = 50;

        graph.edge[8].src = 'E';
        graph.edge[8].dest = 'I';
        graph.edge[8].weight = 110;

        graph.edge[9].src = 'E';
        graph.edge[9].dest = 'K';
        graph.edge[9].weight = 90;

        // ===== (F) =====
        graph.edge[10].src = 'F';
        graph.edge[10].dest = 'G';
        graph.edge[10].weight = 40;

        graph.edge[11].src = 'F';
        graph.edge[11].dest = 'H';
        graph.edge[11].weight = 230;

        // ===== (G) =====
        graph.edge[12].src = 'G';
        graph.edge[12].dest = 'E';
        graph.edge[12].weight = 50;

        graph.edge[13].src = 'G';
        graph.edge[13].dest = 'F';
        graph.edge[13].weight = 40;

        graph.edge[14].src = 'G';
        graph.edge[14].dest = 'H';
        graph.edge[14].weight = 120;

        // ===== (H) =====
        graph.edge[15].src = 'H';
        graph.edge[15].dest = 'I';
        graph.edge[15].weight = 50;

        graph.edge[16].src = 'H';
        graph.edge[16].dest = 'K';
        graph.edge[16].weight = 90;

        // ===== (I) =====
        graph.edge[17].src = 'I';
        graph.edge[17].dest = 'H';
        graph.edge[17].weight = 60;

        graph.edge[18].src = 'I';
        graph.edge[18].dest = 'J';
        graph.edge[18].weight = 60;

        // ===== (J) =====
        graph.edge[19].src = 'J';
        graph.edge[19].dest = 'I';
        graph.edge[19].weight = 50;

        graph.edge[20].src = 'J';
        graph.edge[20].dest = 'L';
        graph.edge[20].weight = 60;
       
        // ===== (K) =====
        graph.edge[21].src = 'K';
        graph.edge[21].dest = 'J';
        graph.edge[21].weight = 90;

        Scanner input = new Scanner(System.in);
        boolean ulang = true;
       
        do{
            System.out.println("\033[H\033[2J");
            System.out.println("---RESPONSI---");
            System.out.println("--------------");
            System.out.print("Masukkan Source : ");
            int source = input.nextInt();
            System.out.println();

            graph.BellmanFord(graph, source);

            System.out.print("\nAnda ingin melanjutkan lagi {y/t} : ");
            char pilih = input.next().charAt(0);
            if (pilih == 't' || pilih == 'T'){
                System.out.println("Selesai");
                ulang = false;
            }
        } while (ulang);
    }
}
