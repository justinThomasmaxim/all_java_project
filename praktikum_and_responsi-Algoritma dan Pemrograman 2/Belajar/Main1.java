package Belajar;

import java.util.Arrays;

// ====================(MINIMUM SPANNING TREE)========================
// ========================(ALGORITMA PRIM)===========================

public class Main1 {
    public void Prim(long G[][], int V) {
        int INF = 9999999;
        int no_edge;
        long jumlah = 0;

        boolean[] selected = new boolean[V];

        // isi array selected dengan false semuanya
        Arrays.fill(selected, false);

        no_edge = 0;
        selected[0] = true;
        System.out.println("\tRute Kota   \t| biaya pengiriman barang");

        // lakukan perulangan sebanyak V-1 untuk mendapatkan semua kemungkinannya
        while (no_edge < V - 1) {
            // set min ke INF terlebih dahulu sebagai nilai awal
            long min = INF;
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

            // fungsi " (char) (x + 65) " disini adalah untuk mengkonversi angka menjadi abjad (huruf)
            System.out.println("\t" + (char) (x + 65) + " - " + (char) (y + 65) + "         \t: \t" + "Rp." + G[x][y]);
            selected[y] = true;
            no_edge++;
            jumlah += min;
        }
        System.out.println("\nTotal biaya termurah dalam pengiriman barang = Rp." + jumlah);
    }

    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        Main1 classtest = new Main1();
        int V = 9;   // jumlah vertex
        long[][] G = {
          //    A        B        C       D        E        F       G       H        I
 /* A */    { 0     , 400    , 0     , 0      , 0      , 0      , 0     , 800    , 0   },  // = {a->a, a->b, a->c, a->d, a->e, a->f, a->g, a->h, a->i}
 /* B */    { 400   , 0      , 800   , 0      , 0      , 0      , 0     , 1100   , 0   },  // = {b->a, b->b, b->c, b->d, b->e, b->f, b->g, b->h, b->i}
 /* C */    { 0     , 800    , 0     , 700    , 0      , 400    , 0     , 0      , 200 },  // dan seterusnya
 /* D */    { 0     , 0      , 700   , 0      , 900    , 1400   , 0     , 0      , 0   },
 /* E */    { 0     , 0      , 0     , 900    , 0      , 1000   , 0     , 0      , 0   },
 /* F */    { 0     , 0      , 400   , 1400   , 1000   , 0      , 200   , 0      , 0   },
 /* G */    { 0     , 0      , 0     , 0      , 0      , 200    , 0     , 100    , 500 },
 /* H */    { 800   , 1100   , 0     , 0      , 0      , 0      , 100   , 0      , 700 },
 /* I */    { 0     , 0      , 200   , 0      , 0      , 0      , 600   , 700    , 0   }
        };
        classtest.Prim(G, V);  // pemanggilan fungsi prim
    }
}
