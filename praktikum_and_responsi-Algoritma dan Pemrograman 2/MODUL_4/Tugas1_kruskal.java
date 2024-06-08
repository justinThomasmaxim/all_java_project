package MODUL_4;

import java.util.Arrays;
public class Tugas1_kruskal {
    class Edge implements Comparable<Edge> {			//mendeklarasikan class edge untuk merepresentasikan bagian tepi
        int src, dest, weight;					//variabel yang akan digunakan 

        public int compareTo(Edge compareEdge) {
            return this.weight - compareEdge.weight;
        }
    }
    
    class subset {						
        int parent, rank;
    }
    
    int vertices, edges;						
    Edge edge[ ];					//yang akan menyimpan semua sisi
    Tugas1_kruskal(int v, int e) {				// akan membuat graph dengan node vertices dan node sisi edges
        vertices = v;
        edges = e;
        edge = new Edge[edges];
        for (int i = 0; i < e; ++i)			//looping for dimana nilai awal i=0 dan pada perulangan i kurang e, i akan diincrementkan
            edge[i] = new Edge();			//maka edge[i] akan bernilai sama dengan new edge
    }
                                                //Fungsi utilitas yang berguna untuk menemukan kumpulan elemen i dan untuk menemukan                      
    int find(subset subsets[ ], int i) {			// root dan menjadikan root tsb sebagai induk dari i
        if (subsets[i].parent != i)			//jika kondisi subsets[i].parent tidak sama dengan i 
            subsets[i].parent = find(subsets, subsets[i].parent);	// maka subsets[i] akan menemukan variabel (subsets, subsets[i].parent)	
        return subsets[i].parent;			//dan akan menjalankan perintah return seperti disamping
    }
    
    void Union(subset subsets[ ], int x, int y) {	//fungsi union yang berguna untuk menggabungkan dua set dari x dan y berdasarkan peringkat
        int xroot = find(subsets, x);			//xroot akan menemukan variabel subsets, x
        int yroot = find(subsets, y);			//yroot akan menemukan variabel subsets, y
        if (subsets[xroot].rank < subsets[yroot].rank)	//jika kondisi subsets[xroot].rank kurang dari subsets[yroot].rank
            subsets[xroot].parent = yroot;		//maka subsets[yroot].rank akan menyimpan xroot
        else if (subsets[xroot].rank > subsets[yroot].rank) // namun jika tidak maka
            subsets[yroot].parent = xroot;		   // subsets[yroot].parent akan menyimpan nilai xroot;
        else {						 
            subsets[yroot].parent = xroot;
 
            subsets[xroot].rank++;			//variabel ini akan diincrementkan
        } }
    
    void KruskalAlgo() {
        Edge result[ ] = new Edge[vertices];
        int e = 0;
        int i = 0;
        for (i = 0; i < vertices; ++i)			//looping for dimana nilai awal i=0, dan pada perulangan i kurang dari vertices dan i akan diincrementkan
            result[i] = new Edge();			//maka result yang menyimpan nilai i akan bernilai sama dengan new edge(result akan menyimpan new edge)
        Arrays.sort(edge);				//edge akan diurutkan daam urutan naik (rendah ke terbesar)
        subset subsets[ ] = new subset[vertices];
        for (i = 0; i < vertices; ++i)			//looping for
            subsets[i] = new subset();			//dimana subsets yang menyimpan nilai i akan bernilai sama dengan new subsets
        for (int v = 0; v < vertices; ++v) {		//perulangan for untuk variabel v dimana nilai awal v=0, pada perulangan v akan kurang dari vertices, dan v akan diincrementkan
            subsets[v].parent = v;			//subsets[banyak nilai v]. parent akan bernilai sama dengan v
           subsets[v].rank = 0;				//dan subsets[v].rank akan bernilai kosong/ 0
        }
        i = 0;						//i sama dengan 0
        while (e < vertices - 1) { //dimana kondisi ketika variabel e kurang dari vertices-1, maka
            Edge next_edge = new Edge(); //Edge next_edge akan bernilai sama dengan new edge
            next_edge = edge[i++];
            int x = find(subsets, next_edge.src); //variabel x akan menemukan variabel subsets dan next_edge.src
            int y = find(subsets, next_edge.dest); //variabel y akan menemukan variabel subsets dan next_edge.dest
            if (x != y) { //jika terjadi kondisi dimana x tidak sama dengan y 
                result[e++] = next_edge; //maka akan dijalankan perintah seperti sintaks di samping
                Union(subsets, x, y);
            }
        }
        int jumlah = 0;
        for (i = 0; i < e; ++i) {
            System.out.println(result[i].src + " - " + result[i].dest + ": " + result[i].weight);
            jumlah = jumlah + result[i].weight;
        }

        System.out.println("\nMinimum spanning tree dari graf : " + jumlah);
    }
    
    public static void main(String[ ] args) {
        int vertices = 7; // Number of vertices 		//jumlah simpul atau titik=7 buah
        int edges = 14; // Number of edges		//14 sisi
        Tugas1_kruskal G = new Tugas1_kruskal(vertices, edges);
        
      
         G.edge[0].src = 0;				//src merupakan simpul awal/titik awal
         G.edge[0].dest = 6;				//dest merupakan titik tujuan
         G.edge[0].weight = 15;				//weight merupakan panjang jarak antar titik awal ke titik tujuan
         
         G.edge[1].src = 3;
         G.edge[1].dest = 4;
         G.edge[1].weight = 2;
         
         G.edge[2].src = 2;
         G.edge[2].dest = 6;
         G.edge[2].weight = 10;
         
         G.edge[3].src = 1;
         G.edge[3].dest = 2;
         G.edge[3].weight = 4;
         
         G.edge[4].src = 2;
         G.edge[4].dest = 4;
         G.edge[4].weight = 5;
         
         G.edge[5].src = 3;
         G.edge[5].dest = 5;
         G.edge[5].weight = 7;
         
         G.edge[6].src = 1;
         G.edge[6].dest = 4;
         G.edge[6].weight = 3;
         
         G.edge[7].src = 0;
         G.edge[7].dest = 2;
         G.edge[7].weight = 12;
         
         G.edge[8].src = 1;
         G.edge[8].dest = 5;
         G.edge[8].weight = 8;
         
         G.edge[9].src = 1;
         G.edge[9].dest = 3;
         G.edge[9].weight = 2;
         
         G.edge[10].src = 4;
         G.edge[10].dest = 5;
         G.edge[10].weight = 6;
         
         G.edge[11].src = 0;
         G.edge[11].dest = 4;
         G.edge[11].weight = 11;
         
         G.edge[12].src = 4;
         G.edge[12].dest = 6;
         G.edge[12].weight = 14;
 
         G.edge[13].src = 0;
         G.edge[13].dest = 1;
         G.edge[13].weight = 9;

        System.out.println("\033[H\033[2J"); 

        G.KruskalAlgo();  // pemanggilan fungsi KruskalAlgo
         
     }
     
 }
