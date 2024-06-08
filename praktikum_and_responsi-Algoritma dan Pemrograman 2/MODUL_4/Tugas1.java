package MODUL_4;

// ========================(ALGORITMA Prim)===========================

import java.util.Arrays;
public class Tugas1 {
    public void Prim(int G[][], int V) {
        int INF = 9999999;
        int no_edge;
        int jumlah = 0;

        boolean[] selected = new boolean[V];

        // isi array selected dengan false semuanya
        Arrays.fill(selected, false);

        no_edge = 0;
        selected[0] = true;
        System.out.println("Kota saat ini ke tujuan\t: Rentang Kabel listrik");

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
            // System.out.println("\t" + (char) (x + 65) + " - " + (char) (y + 65) + "         \t: \t" + G[x][y]);
            System.out.println("\t" + (char) (x + 65) + " - " + (char) (y + 65) + "         \t: \t" + G[x][y]);
            selected[y] = true;
            no_edge++;
            jumlah += min;
        }
        System.out.println("\nTotal minimal rentangan kabel listrik = " + jumlah);
    }

    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        Tugas1 classtest = new Tugas1();
        int V = 7;   // jumlah vertex
        int[][] G = {
            { 0, 9, 12, 0, 11, 0, 15 }, // = {a->a, a->b, a->c, a->d, a->e, a->f, a->g}
            { 9, 0, 4, 2, 3, 8, 0 },    // = {b->a, b->b, b->c, b->d, b->e, b->f, b->g}
            { 12, 4, 0, 0, 5, 0, 10 },  // dan seterusnya
            { 0, 2, 0, 0, 2, 7, 0 },
            { 11, 3, 5, 2, 0, 6, 14 },
            { 0, 8, 0, 4, 6, 0, 0 },
            { 15, 0, 10, 0, 14, 0, 0 }
        };
        classtest.Prim(G, V);  // pemanggilan fungsi prim
    }
}
