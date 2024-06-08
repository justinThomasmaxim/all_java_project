package com.example.domain;

public class Product {
    private int nomorBarang;
    private String namaProduk;
    private int jumlahUnitTersedia;
    private double hargaPerUnit;

    public Product() {
        nomorBarang = 0;
        namaProduk = "";
        jumlahUnitTersedia = 0;
        hargaPerUnit = 0.0;
    }

    public Product(int nomorBarang, String namaProduk, int jumlahUnitTersedia, double hargaPerUnit) {
        this.nomorBarang = nomorBarang;
        this.namaProduk = namaProduk;
        this.jumlahUnitTersedia = jumlahUnitTersedia;
        this.hargaPerUnit = hargaPerUnit;
    }

    public int getNomorBarang() {
        return nomorBarang;
    }

    public void setNomorBarang(int nomorBarang) {
        this.nomorBarang = nomorBarang;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public int getJumlahUnitTersedia() {
        return jumlahUnitTersedia;
    }

    public void setJumlahUnitTersedia(int jumlahUnitTersedia) {
        this.jumlahUnitTersedia = jumlahUnitTersedia;
    }

    public double getHargaPerUnit() {
        return hargaPerUnit;
    }

    public void setHargaPerUnit(double hargaPerUnit) {
        this.hargaPerUnit = hargaPerUnit;
    }

    public void displayProductDetails() {
        System.out.println("Nomor: " + nomorBarang);
        System.out.println("Nama: " + namaProduk);
        System.out.println("Jumlah tersedia: " + jumlahUnitTersedia);
        System.out.println("Harga: " + hargaPerUnit);
        System.out.println();
    }

    public static void main(String[] args) { 
        Product product1 = new Product(101, "Charger", 100, 50000);
        Product product2 = new Product(102, "Laptop", 50, 1200000);
        Product product3 = new Product(103, "Smartphone", 100, 8000000);
        Product product4 = new Product(104, "Charger", 100, 2700000); // Nama produk diperbaiki
        Product product5 = new Product(105, "Ipad", 30, 5000000);
        Product product6 = new Product(106, "Printer", 20, 3000000);
        
        // Menampilkan detail produk ke konsol
        product1.displayProductDetails();
        product2.displayProductDetails();
        product3.displayProductDetails();
        product4.displayProductDetails();
        product5.displayProductDetails();
        product6.displayProductDetails();
    }
}
