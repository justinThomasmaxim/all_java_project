package MODUL_4;

// ========================(ALGORITMA PRIM)===========================

import java.util.Arrays;
class PGraph {
    public void Prim(int G[][], int V) {
        int INF = 9999999;
        int no_edge; 
        boolean[] selected = new boolean[V];

        // isi array selected dengan false semuanya
        Arrays.fill(selected, false);

        no_edge = 0;
        selected[0] = true;
        System.out.println("Edge : Weight");

        // lakukan perulangan sebanyak V-1 untuk mendapatkan semua kemungkinannya
        while (no_edge < V - 1) {
            // set min ke INF terlebih dahulu sebagai nilai awal
            int min = INF;
            int x = 0; // nomor pada baris
            int y = 0; // nomor pada kolom
            for (int i = 0; i < V; i++) {
                if (selected[i] == true) {
                    for (int j = 0; j < V; j++) {
                        // jika vertex nya sudah dikunjungi maka skip
                        if (!selected[j] && G[i][j] != 0) {
                            if (min > G[i][j]) {
                                min = G[i][j];
                                x = i;
                                y = j;
                            }
                        }
                    }
                }
            }
            System.out.println(x + " - " + y + " : " + G[x][y]);
            selected[y] = true;
            no_edge++;
        }
    }

    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        PGraph g = new PGraph();
        int V = 4;
        int[][] G = {
            { 0, 1, 4, 3 },
            { 1, 0, 0, 2 },
            { 4, 0, 0, 5 },
            { 3, 2, 5, 0}};
        g.Prim(G, V);
    }
}
   