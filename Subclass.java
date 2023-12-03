package praktikumod2;

import java.util.Scanner;

public class Subclass {
    Scanner input = new Scanner(System.in);
    String select;

    void data() {
        System.out.println("");
        System.out.println("################################################");
        System.out.println("                Rental Dvd                      ");
        System.out.println("################################################");
        Superclass judul = new Superclass();
        System.out.println("Judul             : ");
        judul.name = input.nextLine();

        Superclass aktor = new Superclass();
        System.out.println("Aktor             : ");
        aktor.name = input.nextLine();

        Superclass sutradara = new Superclass();
        System.out.println("Sutradara         : ");
        sutradara.name = input.nextLine();

        Superclass publisher = new Superclass();
        System.out.println("Publisher         : ");
        publisher.name = input.nextLine();

        Superclass kategori = new Superclass();
        System.out.println("Kategori    :");
        System.out.println("1. Semua umur");
        System.out.println("2. Dewasa");
        System.out.println("3. Remaja");
        System.out.println("4. Anak-anak");
        System.out.println("Masukkan Pilihan  : (SU/D/R/A)");
        select = input.nextLine();

        switch (select) {
            case "SU":
                kategori.name = "semua umur";
                break;
            case "D":
                kategori.name = "Dewasa";
                break;
            case "R":
                kategori.name = "Remaja";
                break;
            case "A":
                kategori.name = "Anak-anak";
                break;
        }
        // menampilkan/mencetak
        Superclass stok = new Superclass();
        System.out.println("Stok              : ");
        stok.stok = input.nextInt();
        input.nextLine();
        System.out.println("");
        judul.Judul();
        aktor.Aktor();
        sutradara.sutradara();
        publisher.publisher();
        kategori.kategori();
        stok.stok();
    }
}