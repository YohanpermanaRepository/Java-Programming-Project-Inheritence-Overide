package praktikumod2;

import java.util.Scanner;

public class mainprogram {

    public static void main(String[] args) {
        Subclass data = new Subclass();
        Scanner input = new Scanner(System.in);
        int pilih = 1;

        while (pilih == 1) {
            data.data();
            System.out.println("\nMengulang lagi ? ( jika iya masukkan angka 1 dan jika tidak masukkan angka selain 1 )");
            System.out.print("Masukkan pilihan : ");
            pilih = input.nextInt();
            input.nextLine();
            if (pilih != 1) {
                pilih = 0;
                System.out.println("Selesai");
            }
        }
    }
}
