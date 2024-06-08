package Produk;
import java.util.Scanner;

public class ProductTesterJF6 {
	
	  // Metode ini bertujuan untuk menampilkan informasi produk yang ada dalam array.
	  public static void displayInventory(ProdukJF6[] products) {
	      System.out.println("\nInformasi Produk:");
	      
	      // Melakukan iterasi melalui setiap produk dalam array 'products'.
	      for (ProdukJF6 product : products) {
	          System.out.println(product + "\n");
	      }
	  }
	
// Metode ini bertanggung jawab untuk menambahkan produk baru ke dalam array 
// berdasarkan input dari pengguna.
public static void addToInventory(ProdukJF6[] products, Scanner in) {
   for (int i = 0; i < products.length; i++) {
       in.nextLine();

       System.out.println("Enter details for Product " + (i + 1) + ": ");

       // Meminta input untuk nama, kuantitas, harga, dan nomor produk.
       System.out.print("Enter product name  : ");
       String tempName = in.nextLine();

       System.out.print("Enter quantity      : ");
       int tempQty = in.nextInt();

       System.out.print("Enter price         : ");
       double tempPrice = in.nextDouble();

       System.out.print("Enter item number   : ");
       int tempNumber = in.nextInt();

       // Menyimpan detail produk baru ke dalam array 'products'.
       products[i] = new ProdukJF6(tempNumber, tempName, tempQty, tempPrice);
   }
}

// - - - - - (DVD dan CD) - - - - -
	// Metode untuk menambahkan CD ke inventory
	   public static void addCDToInventory(CD[] products, Scanner in, int i) {
	       in.nextLine(); // Membersihkan buffer input sebelum meminta nilai baru
	       
	       System.out.print("Please enter the CD name						     : ");
	       String cdName = in.nextLine();
	
	       System.out.print("Please enter the artist name						 : ");
	       String artistName = in.nextLine();
	
	       System.out.print("Please enter the record label name				 	 : ");
	       String labelName = in.nextLine();
	
	       System.out.print("Please enter the number of songs				     : ");
	       int numOfSongs = in.nextInt();
	
	       System.out.print("Please enter the quantity of stock for this product : ");
	       int quantity = in.nextInt();
	
	       System.out.print("Please enter the price for this product             : ");
	       double price = in.nextDouble();
	
	       System.out.print("Please enter the item number						 : ");
	       int itemNumber = in.nextInt();
	
	       products[i] = new CD(itemNumber, cdName, quantity, price, artistName, numOfSongs, labelName);
	   }
	
	   // Metode untuk menambahkan DVD ke inventory
	   public static void addDVDToInventory(DVD[] products, Scanner in, int i) {
	       in.nextLine(); // Membersihkan buffer input sebelum meminta nilai baru
	       
	       System.out.print("Please enter the DVD name							 : ");
	       String dvdName = in.nextLine();
	
	       System.out.print("Please enter the film studio name					 : ");
	       String studioName = in.nextLine();
	
	       System.out.print("Please enter the age rating						 : ");
	       int ageRating = in.nextInt();
	
	       System.out.print("Please enter the length in minutes					 : ");
	       int lengthMinutes = in.nextInt();
	
	       System.out.print("Please enter the quantity of stock for this product : ");
	       int quantity = in.nextInt();
	
	       System.out.print("Please enter the price for this product			 : ");
	       double price = in.nextDouble();
	
	       System.out.print("Please enter the item number						 : ");
	       int itemNumber = in.nextInt();
	
	       products[i] = new DVD(itemNumber, dvdName, quantity, price, lengthMinutes, ageRating, studioName);
	   }

	
	//Metode ini bertujuan untuk meminta jumlah produk yang ingin ditambahkan dari pengguna.
	  public static int getNumProducts(Scanner in) {
	      int maxSize = -1; // Initialize maxSize with a value that will fail the loop
	
	      // Use a do-while loop to get a valid positive value for maxSize
	      do {
	          try {
	              System.out.print("Enter the number of products you would like to add\n" +
	                      "Enter 0 (zero) if you do not wish to add products: ");
	              maxSize = in.nextInt();
	
	              // Memeriksa apakah jumlah produk valid (tidak negatif).
	              if (maxSize < 0) {
	                  throw new IllegalArgumentException("Incorrect Value entered");
	              }
	
	          } catch (Exception e) {
	              System.out.println(e);
	              in.nextLine(); // Clear the input buffer
	          }
	      } while (maxSize < 0);
	
	      return maxSize; // Mengembalikan nilai maxSize
	  }
	  
	// menampilkan sistem menu dan meminta input pilihan
public static int getMenuOption(Scanner scanner) { // objek scanner
    int choice;
    do {
        try {
        	System.out.println("\n+======================+");
        	System.out.println("|        Menu          |");
        	System.out.println("+======================+");
            System.out.println("|1. View Inventory     |");
            System.out.println("|2. Add Stock          |");
            System.out.println("|3. Deduct Stock       |");
            System.out.println("|4. Discontinue Product|");
            System.out.println("|0. Exit               |");
            System.out.println("+======================+");
            System.out.print("Please enter a menu option: ");
            choice = scanner.nextInt();

            // Hanya angka antara 0 dan 4 yang diterima
            // jika tidak akan memaksa konfirmasi ulang
            if (choice < 0 || choice > 4) {
                throw new IllegalArgumentException("Invalid input. Enter a number between 0 and 4.");
            }
        } catch (Exception e) {
            System.out.println(e);
            scanner.nextLine();
            choice = -1; // menginisialisasikan choice menjadi -1 untuk menggagalkan kondisi while
        }
    } while (choice < 0 || choice > 4);

    return choice; // mengembalikai nilai choice bertipe data integer
}

// memilih nomor produk dari daftar yang ada
// mengambil array produk dan scanner sebagai parameter
public static int getProductNumber(ProdukJF6[] products, Scanner scanner) {
    int productChoice;
    do {
        try {
            System.out.println("Product List:");
            
            // menggunakan for loop untuk menampilkan nilai indeks dan nama produk
            // Dan mengakhiri loop sesuai panjang array product
            for (int i = 0; i < products.length; i++) {
                System.out.println(i + ". " + products[i].getNamaProduk());
            }
            System.out.print("Silakan pilih produk dengan memasukkan indeksnya: ");
            productChoice = scanner.nextInt();
            
            // jika tidak memasukkan nilai antara 0 dan 1 atau kurang dari panjang array
            // Maka akan menampilkan "Invalid input" dan memaksa untuk menginputkan angka yang sesuai pada menu
            if (productChoice < 0 || productChoice >= products.length) {
                throw new IllegalArgumentException("Invalid input. Enter a number between 0 and " + (products.length - 1));
            }
        } catch (Exception e) {
            System.out.println(e);
            scanner.nextLine();
            productChoice = -1;
        }
    } while (productChoice < 0 || productChoice >= products.length);

    return productChoice; // mengembalikai nilai productChoice bertipe data integer
}

//// menambah stok produk yang dipilih
//// mengambil array products dan objek scanner sebagai parameter
//public static void addInventory(ProdukJF6[] products, Scanner scanner) {
//	// pemanggilan method getProductNumber dengan parameter 
//	// kemudian menyimpannya divariabel productChoice
//    int productChoice = getProductNumber(products, scanner);
//    int updateValue;
//    do {
//        try {
//        	// memunculkan pesan "Berapa unit yang ingin Anda tambahkan?"
//            System.out.print("Berapa unit yang ingin Anda tambahkan? ");
//            updateValue = scanner.nextInt();
//
//            // Hanya diperbolehkan memasukkan nilai positif
//            if (updateValue <= 0) {
//                throw new IllegalArgumentException("Invalid input. Enter a positive number.");
//            }
//
//            // Akan memperbarui stok produk pada inventory
//            products[productChoice].addToInventory(updateValue);
//        } catch (Exception e) {
//            System.out.println(e);
//            scanner.nextLine();
//            updateValue = -1;
//        }
//    } while (updateValue <= 0);
//}

//Metode untuk mencari indeks kosong dalam array produk
public static int findEmptyIndex(ProdukJF6[] products) {
    for (int i = 0; i < products.length; i++) {
        if (products[i] == null) {
            return i;
        }
    }
    return -1; // Jika tidak ada indeks kosong dalam array
}   

public static void addInventory(ProdukJF6[] products, Scanner scanner) {
	// pemanggilan method getProductNumber dengan parameter 
	// kemudian menyimpannya divariabel productChoice
	
	int productChoice = getProductNumber(products, scanner);
    int stockChoice = -1;
    int updateValue = 0;
    do {
        try {
            System.out.println("1: CD");
            System.out.println("2: DVD");
            System.out.println("Tolong masukan tipe produk: ");
            stockChoice = scanner.nextInt();

            if (stockChoice < 1 || stockChoice > 2) {
                System.out.println("Hanya angka 1 atau 2 saja yang bisa dimasukan!");
                continue;
            }

        	// memunculkan pesan "Berapa unit yang ingin Anda tambahkan?"
            System.out.print("Berapa unit yang ingin Anda tambahkan? ");
            updateValue = scanner.nextInt();

            // Hanya diperbolehkan memasukkan nilai positif
            if (updateValue <= 0) {
                throw new IllegalArgumentException("Invalid input. Enter a positive number.");
            }

            products[productChoice].addToInventory(updateValue);
            
        } catch (Exception e) {
            System.out.println(e);
            scanner.nextLine();
            updateValue = -1;
        }
    } while (updateValue <= 0);

    if (stockChoice == 1) {
        addCDToInventory((CD[]) products, scanner, productChoice);
    } else if (stockChoice == 2) {
        addDVDToInventory((DVD[]) products, scanner, productChoice);
    }
    
    
}

// mengurangi stok produk yang dipilih
// mengambil array products dan objek scanner sebagai parameter
public static void deductInventory(ProdukJF6[] products, Scanner scanner) {
    int productChoice = getProductNumber(products, scanner);
    int updateValue;
    do {
        try {
            System.out.print("Berapa unit yang ingin Anda kurangi? ");
            updateValue = scanner.nextInt();

            // Batasan nilainya harus 0 atau lebih besar dan tidak lebih besar dari jumlah stok
            if (updateValue <= 0 || updateValue > products[productChoice].getJumlahUnit()) {
                throw new IllegalArgumentException("Invalid input. Enter a number between 1 and " + products[productChoice].getJumlahUnit());
            }

            // Akan memperbarui nilai untuk mengurangi stok produk pada inventory
            products[productChoice].deductFromInventory(updateValue);
        } catch (Exception e) {
            System.out.println(e);
            scanner.nextLine();
            updateValue = -1;
        }
    } while (updateValue <= 0 || updateValue > products[productChoice].getJumlahUnit());
}

//  menandai produk sebagai dihentikan
// mengambil array products dan objek scanner sebagai parameter
public static void discontinueInventory(ProdukJF6[] products, Scanner scanner) {
	
	// productChoice yang menyimpan nilai integer dan method getProductNumber dengan parameter
    int productChoice = getProductNumber(products, scanner);
    
    // Method setActive untuk menyetel nilai active ke false untuk products objek
    products[productChoice].setActive(false);
}

// mengeksekusi pilihan menu yang dipilih pengguna
// Mengambil pilihan menu (choice), array produ, dan objek scanner sebagai parameter
public static void executeMenuChoice(int choice, ProdukJF6[] products, Scanner scanner) {
    
	// Menggunakan statement switch untuk mengeksekusi kasus (case) yang sesuai dengan pilihan
	switch (choice) {
        case 1:
            // View Inventory
        	displayInventory(products);
            break;
        case 2:
            // Add Stock
            addInventory(products, scanner);
            break;
        case 3:
            // Deduct Stock
            deductInventory(products, scanner);
            break;
        case 4:
            // Discontinue Product
            discontinueInventory(products, scanner);
            break;
        case 0:
            System.out.println("Exiting...");
            break;
        default:
            System.out.println("Invalid choice.");
            break;
    }
}

// Main Method
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int maxSize, menuChoice;

    // Meminta pengguna untuk memasukkan jumlah produk yang ingin ditambahkan.
    maxSize = getNumProducts(in);
    
    // Jika jumlah produk yang diminta adalah 0, 
    // tampilkan pesan bahwa tidak ada produk yang diperlukan.
    if (maxSize == 0) {
        System.out.println("No product required!");
    } else {
        ProdukJF6[] products = new ProdukJF6[maxSize];
        addToInventory(products, in);
        do {
            menuChoice = getMenuOption(in);
            executeMenuChoice(menuChoice, products, in);
        } while (menuChoice != 0);
    }
    // Menutup objek Scanner setelah selesai digunakan.
    in.close();
}

}



























//public class ProductTesterJF6 {
//	
//	  // Metode ini bertujuan untuk menampilkan informasi produk yang ada dalam array.
//	  public static void displayInventory(ProdukJF6[] products) {
//	      System.out.println("\nInformasi Produk:");
//	      
//	      // Melakukan iterasi melalui setiap produk dalam array 'products'.
//	      for (ProdukJF6 product : products) {
//	          System.out.println(product + "\n");
//	      }
//	  }
//	
//   // Metode ini bertanggung jawab untuk menambahkan produk baru ke dalam array 
//   // berdasarkan input dari pengguna.
//   public static void addToInventory(ProdukJF6[] products, Scanner in) {
//       for (int i = 0; i < products.length; i++) {
//           in.nextLine();
//
//           System.out.println("Enter details for Product " + (i + 1) + ": ");
//
//           // Meminta input untuk nama, kuantitas, harga, dan nomor produk.
//           System.out.print("Enter product name  : ");
//           String tempName = in.nextLine();
//
//           System.out.print("Enter quantity      : ");
//           int tempQty = in.nextInt();
//
//           System.out.print("Enter price         : ");
//           double tempPrice = in.nextDouble();
//
//           System.out.print("Enter item number   : ");
//           int tempNumber = in.nextInt();
//
//           // Menyimpan detail produk baru ke dalam array 'products'.
//           products[i] = new ProdukJF6(tempNumber, tempName, tempQty, tempPrice);
//       }
//   }
//   
//// Metode untuk mencari indeks kosong dalam array produk
//   public static int findEmptyIndex(ProdukJF6[] products) {
//       for (int i = 0; i < products.length; i++) {
//           if (products[i] == null) {
//               return i;
//           }
//       }
//       return -1; // Jika tidak ada indeks kosong dalam array
//   }   
//   
//// Metode untuk menambahkan produk ke inventory berdasarkan pilihan pengguna (CD atau DVD)
//   public static void addInventory(ProdukJF6[] products, Scanner in) {
//       int stockChoice = -1;
//       int productChoice = getProductNumber(products, in);
//
//       while (stockChoice < 1 || stockChoice > 2) {
//           try {
//               System.out.println("1: CD");
//               System.out.println("2: DVD");
//               System.out.print("Please enter the product type: ");
//               stockChoice = in.nextInt();
//
//               if (stockChoice < 1 || stockChoice > 2) {
//                   System.out.println("Only numbers 1 or 2 allowed!");
//               }
//           } catch (Exception e) {
//               System.out.println("Invalid input. Please enter a number.");
//               in.nextLine(); // Membersihkan input buffer
//               stockChoice = -1; // Menginisialisasi ulang nilai stockChoice agar terjadi loop lagi
//           }
//       }
//
//       if (stockChoice == 1) {
//           // Menambah CD ke inventory
//           addCDToInventory((CD[]) products, in, findEmptyIndex(products));
//       } else if (stockChoice == 2) {
//           // Menambah DVD ke inventory
//           addDVDToInventory((DVD[]) products, in, findEmptyIndex(products));
//       }
//   }  
//   
//   // - - - - - (DVD dan CD) - - - - -
//	// Metode untuk menambahkan CD ke inventory
//	   public static void addCDToInventory(CD[] products, Scanner in, int i) {
//	       in.nextLine(); // Membersihkan buffer input sebelum meminta nilai baru
//	       
//	       System.out.print("Please enter the CD name						     : ");
//	       String cdName = in.nextLine();
//	
//	       System.out.print("Please enter the artist name						 : ");
//	       String artistName = in.nextLine();
//	
//	       System.out.print("Please enter the record label name				 	 : ");
//	       String labelName = in.nextLine();
//	
//	       System.out.print("Please enter the number of songs				     : ");
//	       int numOfSongs = in.nextInt();
//	
//	       System.out.print("Please enter the quantity of stock for this product : ");
//	       int quantity = in.nextInt();
//	
//	       System.out.print("Please enter the price for this product             : ");
//	       double price = in.nextDouble();
//	
//	       System.out.print("Please enter the item number						 : ");
//	       int itemNumber = in.nextInt();
//	
//	       products[i] = new CD(itemNumber, cdName, quantity, price, artistName, numOfSongs, labelName);
//	   }
//	
//	   // Metode untuk menambahkan DVD ke inventory
//	   public static void addDVDToInventory(DVD[] products, Scanner in, int i) {
//	       in.nextLine(); // Membersihkan buffer input sebelum meminta nilai baru
//	       
//	       System.out.print("Please enter the DVD name							 : ");
//	       String dvdName = in.nextLine();
//	
//	       System.out.print("Please enter the film studio name					 : ");
//	       String studioName = in.nextLine();
//	
//	       System.out.print("Please enter the age rating						 : ");
//	       int ageRating = in.nextInt();
//	
//	       System.out.print("Please enter the length in minutes					 : ");
//	       int lengthMinutes = in.nextInt();
//	
//	       System.out.print("Please enter the quantity of stock for this product : ");
//	       int quantity = in.nextInt();
//	
//	       System.out.print("Please enter the price for this product			 : ");
//	       double price = in.nextDouble();
//	
//	       System.out.print("Please enter the item number						 : ");
//	       int itemNumber = in.nextInt();
//	
//	       products[i] = new DVD(itemNumber, dvdName, quantity, price, lengthMinutes, ageRating, studioName);
//	   }
//   
//	
//	//Metode ini bertujuan untuk meminta jumlah produk yang ingin ditambahkan dari pengguna.
//	  public static int getNumProducts(Scanner in) {
//	      int maxSize = -1; // Initialize maxSize with a value that will fail the loop
//	
//	      // Use a do-while loop to get a valid positive value for maxSize
//	      do {
//	          try {
//	              System.out.print("Enter the number of products you would like to add\n" +
//	                      "Enter 0 (zero) if you do not wish to add products: ");
//	              maxSize = in.nextInt();
//	
//	              // Memeriksa apakah jumlah produk valid (tidak negatif).
//	              if (maxSize < 0) {
//	                  throw new IllegalArgumentException("Incorrect Value entered");
//	              }
//	
//	          } catch (Exception e) {
//	              System.out.println(e);
//	              in.nextLine(); // Clear the input buffer
//	          }
//	      } while (maxSize < 0);
//	
//	      return maxSize; // Mengembalikan nilai maxSize
//	  }
//	  
//	// menampilkan sistem menu dan meminta input pilihan
//    public static int getMenuOption(Scanner scanner) { // objek scanner
//        int choice;
//        do {
//            try {
//            	System.out.println("\n+======================+");
//            	System.out.println("|        Menu          |");
//            	System.out.println("+======================+");
//                System.out.println("|1. View Inventory     |");
//                System.out.println("|2. Add Stock          |");
//                System.out.println("|3. Deduct Stock       |");
//                System.out.println("|4. Discontinue Product|");
//                System.out.println("|0. Exit               |");
//                System.out.println("+======================+");
//                System.out.print("Please enter a menu option: ");
//                choice = scanner.nextInt();
//
//                // Hanya angka antara 0 dan 4 yang diterima
//                // jika tidak akan memaksa konfirmasi ulang
//                if (choice < 0 || choice > 4) {
//                    throw new IllegalArgumentException("Invalid input. Enter a number between 0 and 4.");
//                }
//            } catch (Exception e) {
//                System.out.println(e);
//                scanner.nextLine();
//                choice = -1; // menginisialisasikan choice menjadi -1 untuk menggagalkan kondisi while
//            }
//        } while (choice < 0 || choice > 4);
//
//        return choice; // mengembalikai nilai choice bertipe data integer
//    }
//
//    // memilih nomor produk dari daftar yang ada
//    // mengambil array produk dan scanner sebagai parameter
//    public static int getProductNumber(ProdukJF6[] products, Scanner scanner) {
//        int productChoice;
//        do {
//            try {
//                System.out.println("Product List:");
//                
//                // menggunakan for loop untuk menampilkan nilai indeks dan nama produk
//                // Dan mengakhiri loop sesuai panjang array product
//                for (int i = 0; i < products.length; i++) {
//                    System.out.println(i + ". " + products[i].getNamaProduk());
//                }
//                System.out.print("Silakan pilih produk dengan memasukkan indeksnya: ");
//                productChoice = scanner.nextInt();
//                
//                // jika tidak memasukkan nilai antara 0 dan 1 atau kurang dari panjang array
//                // Maka akan menampilkan "Invalid input" dan memaksa untuk menginputkan angka yang sesuai pada menu
//                if (productChoice < 0 || productChoice >= products.length) {
//                    throw new IllegalArgumentException("Invalid input. Enter a number between 0 and " + (products.length - 1));
//                }
//            } catch (Exception e) {
//                System.out.println(e);
//                scanner.nextLine();
//                productChoice = -1;
//            }
//        } while (productChoice < 0 || productChoice >= products.length);
//
//        return productChoice; // mengembalikai nilai productChoice bertipe data integer
//    }
//    
////    // menambah stok produk yang dipilih
////    // mengambil array products dan objek scanner sebagai parameter
////    public static void addInventory(ProdukJF6[] products, Scanner scanner) {
////    	// pemanggilan method getProductNumber dengan parameter 
////    	// kemudian menyimpannya divariabel productChoice
////        int productChoice = getProductNumber(products, scanner);
////        int updateValue;
////        do {
////            try {
////            	// memunculkan pesan "Berapa unit yang ingin Anda tambahkan?"
////                System.out.print("Berapa unit yang ingin Anda tambahkan? ");
////                updateValue = scanner.nextInt();
////
////                // Hanya diperbolehkan memasukkan nilai positif
////                if (updateValue <= 0) {
////                    throw new IllegalArgumentException("Invalid input. Enter a positive number.");
////                }
////
////                // Akan memperbarui stok produk pada inventory
////                products[productChoice].addToInventory(updateValue);
////            } catch (Exception e) {
////                System.out.println(e);
////                scanner.nextLine();
////                updateValue = -1;
////            }
////        } while (updateValue <= 0);
////    }
//      
//    
//	  
//    
//    // mengurangi stok produk yang dipilih
//    // mengambil array products dan objek scanner sebagai parameter
//    public static void deductInventory(ProdukJF6[] products, Scanner scanner) {
//        int productChoice = getProductNumber(products, scanner);
//        int updateValue;
//        do {
//            try {
//                System.out.print("Berapa unit yang ingin Anda kurangi? ");
//                updateValue = scanner.nextInt();
//
//                // Batasan nilainya harus 0 atau lebih besar dan tidak lebih besar dari jumlah stok
//                if (updateValue <= 0 || updateValue > products[productChoice].getJumlahUnit()) {
//                    throw new IllegalArgumentException("Invalid input. Enter a number between 1 and " + products[productChoice].getJumlahUnit());
//                }
//
//                // Akan memperbarui nilai untuk mengurangi stok produk pada inventory
//                products[productChoice].deductFromInventory(updateValue);
//            } catch (Exception e) {
//                System.out.println(e);
//                scanner.nextLine();
//                updateValue = -1;
//            }
//        } while (updateValue <= 0 || updateValue > products[productChoice].getJumlahUnit());
//    }
//    
//    //  menandai produk sebagai dihentikan
//    // mengambil array products dan objek scanner sebagai parameter
//    public static void discontinueInventory(ProdukJF6[] products, Scanner scanner) {
//    	
//    	// productChoice yang menyimpan nilai integer dan method getProductNumber dengan parameter
//        int productChoice = getProductNumber(products, scanner);
//        
//        // Method setActive untuk menyetel nilai active ke false untuk products objek
//        products[productChoice].setActive(false);
//    }
//    
//    // mengeksekusi pilihan menu yang dipilih pengguna
//    // Mengambil pilihan menu (choice), array produ, dan objek scanner sebagai parameter
//    public static void executeMenuChoice(int choice, ProdukJF6[] products, Scanner scanner) {
//        
//    	// Menggunakan statement switch untuk mengeksekusi kasus (case) yang sesuai dengan pilihan
//    	switch (choice) {
//            case 1:
//                // View Inventory
//            	displayInventory(products);
//                break;
//            case 2:
//                // Add Stock
//                addInventory(products, scanner);
//                break;
//            case 3:
//                // Deduct Stock
//                deductInventory(products, scanner);
//                break;
//            case 4:
//                // Discontinue Product
//                discontinueInventory(products, scanner);
//                break;
//            case 0:
//                System.out.println("Exiting...");
//                break;
//            default:
//                System.out.println("Invalid choice.");
//                break;
//        }
//    }
//    
//    // Main Method
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int maxSize, menuChoice;
//
//        // Meminta pengguna untuk memasukkan jumlah produk yang ingin ditambahkan.
//        maxSize = getNumProducts(in);
//        
//        // Jika jumlah produk yang diminta adalah 0, 
//        // tampilkan pesan bahwa tidak ada produk yang diperlukan.
//        if (maxSize == 0) {
//            System.out.println("No product required!");
//        } else {
//            ProdukJF6[] products = new ProdukJF6[maxSize];
//            addToInventory(products, in);
//            do {
//                menuChoice = getMenuOption(in);
//                executeMenuChoice(menuChoice, products, in);
//            } while (menuChoice != 0);
//        }
//        // Menutup objek Scanner setelah selesai digunakan.
//        in.close();
//    }
//
//}

















//public class ProductTesterJF6 {
//	
//	 // Metode ini bertujuan untuk menampilkan informasi produk yang ada dalam array.
//   public static void displayInventory(ProdukJF6[] products) {
//       System.out.println("\nInformasi Produk:");
//       
//       // Melakukan iterasi melalui setiap produk dalam array 'products'.
//       for (ProdukJF6 product : products) {
//           System.out.println(product + "\n");
//       }
//   }
//
//   // Metode ini bertanggung jawab untuk menambahkan produk baru ke dalam array 
//   // berdasarkan input dari pengguna.
//   public static void addToInventory(ProdukJF6[] products, Scanner in) {
//       for (int i = 0; i < products.length; i++) {
//           in.nextLine();
//
//           System.out.println("Enter details for Product " + (i + 1) + ": ");
//
//           // Meminta input untuk nama, kuantitas, harga, dan nomor produk.
//           System.out.print("Enter product name  : ");
//           String tempName = in.nextLine();
//
//           System.out.print("Enter quantity      : ");
//           int tempQty = in.nextInt();
//
//           System.out.print("Enter price         : ");
//           double tempPrice = in.nextDouble();
//
//           System.out.print("Enter item number   : ");
//           int tempNumber = in.nextInt();
//
//           // Menyimpan detail produk baru ke dalam array 'products'.
//           products[i] = new ProdukJF6(tempNumber, tempName, tempQty, tempPrice);
//       }
//   }
//
//// Metode ini bertujuan untuk meminta jumlah produk yang ingin ditambahkan dari pengguna.
//   public static int getNumProducts(Scanner in) {
//       int maxSize = -1; // Initialize maxSize with a value that will fail the loop
//
//       // Use a do-while loop to get a valid positive value for maxSize
//       do {
//           try {
//               System.out.print("Enter the number of products you would like to add\n" +
//                       "Enter 0 (zero) if you do not wish to add products: ");
//               maxSize = in.nextInt();
//
//               // Memeriksa apakah jumlah produk valid (tidak negatif).
//               if (maxSize < 0) {
//                   throw new IllegalArgumentException("Incorrect Value entered");
//               }
//
//           } catch (Exception e) {
//               System.out.println(e);
//               in.nextLine(); // Clear the input buffer
//           }
//       } while (maxSize < 0);
//
//       return maxSize; // Mengembalikan nilai maxSize
//   }
//
//   public static void main(String[] args) {
//       Scanner in = new Scanner(System.in);
//       
//       // Meminta pengguna untuk memasukkan jumlah produk yang ingin ditambahkan.
//       int maxSize = getNumProducts(in);
//
//       // Jika jumlah produk yang diminta adalah 0, 
//       // tampilkan pesan bahwa tidak ada produk yang diperlukan.
//       if (maxSize == 0) {
//           System.out.println("No product required");
//       } else {
//    	   // Buat array ProdukJF6 berdasarkan jumlah produk yang diminta oleh pengguna.
//           ProdukJF6[] products = new ProdukJF6[maxSize];
//
//           // Menambahkan produk ke dalam array menggunakan metode addToInventory.
//           addToInventory(products, in);
//
//           // Menampilkan informasi produk yang ada dalam array menggunakan metode displayInventory.
//           displayInventory(products);
//       }
//
//       // Menutup objek Scanner setelah selesai digunakan.
//       in.close();
//   }
//}















//  public static void main(string[] args) {
//  		// create a scanner object for keyboard input
//  		Scanner in = new Scanner (System.in);
//  int maxSize, menuChoice;
//  
//  maxSize = getNumProducts(in);
//  if (maxSize == 0) {
//  		// Display a no products message if zero is entered
//  		System.out.println("No product required!");
//  } else {
//  		Product[] products = new Product[maxSize];
//  addToInventory(products, in);
//  do {
//  		menuChoice = getMenuOption(in);
//  		executeMenuChoice(menuChoice, products, in);
//  } while(menuChoice!=0);
//  } //endif
//  }//end method main
 








//public class ProductTesterJF6 {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		
//		int maxSize = -1;
//
//		do {
//			try {
//				System.out.print("Enter the number of products you would like to add\n" +
//								 "Enter 0 (zero) if you do not wish to add products: ");
//				maxSize = in.nextInt();
//				
//				if (maxSize < 0) {
//					throw new IllegalArgumentException("Incorrect Value entered");
//				}
//				
//			} catch (Exception e) {
//				System.out.println(e);
//				in.nextLine();
//			}
//		} while (maxSize < 0);
//	
//		if (maxSize == 0) {
//			System.out.println("No product required");
//		} else {
//			ProdukJF6[] products = new ProdukJF6[maxSize];
//		
//			for (int i = 0; i < maxSize; i++) {
//				in.nextLine();
//				
//				System.out.println("Enter details for Product " + (i + 1) + ": ");
//			
//				System.out.print("Enter product name  : ");
//				String tempName = in.nextLine();
//				
//				System.out.print("Enter quantity      : ");
//				int tempQty = in.nextInt();
//				
//				System.out.print("Enter price         : ");
//				double tempPrice = in.nextDouble(); 
//		
//				System.out.print("Enter item number   : ");
//				int tempNumber = in.nextInt();
//				
//				products[i] = new ProdukJF6(tempNumber, tempName, tempQty, tempPrice);
//			}
//			
//			System.out.println("\nInformasi Produk:");
//			for (ProdukJF6 product : products) {
//				System.out.println(product + "\n");
//			}
//	
//		}
//		
//		// Close the Scanner object
//		in.close();
//	}
//	
//}



