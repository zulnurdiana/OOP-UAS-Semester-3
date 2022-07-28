import Inheritance.*;
import java.util.Scanner;

public class APP_10120787 {
    static Scanner input = new Scanner(System.in);

    // Inheritance & Polymorphism
    private static ShowMenu_10120787 menu = new ShowMenu_10120787();
    private static ShowMenu_10120787 pesan = new PesanTiket_10120787();
    private static ShowMenu_10120787 makan = new PesanMakanan_10120787();
    private static ShowMenu_10120787 ong = new Ongoing_10120787();

    // Variabel untuk menampung harga total, tiket dan makanan
    private static int TotalSemuaHarga = 0;
    private static int TotalUang = 0;

    // -----------------------------------------------------------

    // Main Method untuk melakukan RUN Aplikasi
    public static void main(String[] args) throws Exception {

        // wait 0.5 sec
        Thread.sleep(500);

        // menampilkan menu
        ShowMenu();

    }

    // -----------------------------------------------------------

    // Method untuk menampilkan menu
    public static void ShowMenu() {

        clearScreen();

        System.out.println("+------------------------------------------------------+");
        System.out.println("|                APLIKASI E-CINEMAS                    |");
        System.out.println("+---+--------------------------------------------------+");
        System.out.println("| 1 | TAMPILKAN MOVIE YANG SEDANG TAYANG               |");
        System.out.println("| 2 | TAMPILKAN MOVIE YANG SEDANG ONGOING              |");
        System.out.println("| 3 | PESAN TIKET                                      |");
        System.out.println("| 4 | PESAN MAKANAN & MINUMAN                          |");
        System.out.println("| 5 | PEMBAYARAN                                       |");
        System.out.println("| 6 | KELUAR                                           |");
        System.out.println("+---+--------------------------------------------------+");

        System.out.println("\nSelamat Datang  di Aplikasi E-Cinemas");
        System.out.println("Silahkan pilih menu yang tersedia");
        System.out.print("Pilihan Anda : ");
        int PilihMenu = input.nextInt();

        // jika memilih menu 1 maka akan menampilkan movie
        if (PilihMenu == 1) {
            clearScreen();

            // wait 1 sec
            Tunggu1sec();

            // Mengambil method ShowMovies dari class ShowMenu_10120787
            menu.ShowMovies();

            System.out.println("\n");
            System.out.print("Tekan [Enter] untuk kembali kemenu utama ");

            input.nextLine();
            input.nextLine();
            ShowMenu();
        } // end menu 1

        // jika memilih menu 2 akan menampilkan movie yang sedang ongoing
        else if (PilihMenu == 2) {
            clearScreen();

            // wait 1 sec
            Tunggu1sec();

            // Mengambil method ComingSoon dari class Ongoing_10120787
            ong.ComingSoon();

            System.out.println("\n");
            System.out.print("Tekan [Enter] untuk kembali ke menu utama  ");
            input.nextLine();
            input.nextLine();
            ShowMenu();

        } // end menu 2

        // jika memilih menu 3 akan menampilkan menu pesan tiket
        else if (PilihMenu == 3) {

            clearScreen();

            // wait 1 sec
            Tunggu1sec();

            // Mengambil method PesanTiket dari class pesantiket_10120787
            pesan.PesanTiket();

            System.out.println("\n");
            System.out.print("Tekan [Enter] untuk kembali ke menu utama  ");
            input.nextLine();
            input.nextLine();
            ShowMenu();
        } // end menu 3

        // jika memilih menu 4 akan menampilkan menu pesan makanan & minuman
        else if (PilihMenu == 4) {
            clearScreen();

            // wait 1 sec
            Tunggu1sec();

            // Mengambil method PesanMakanan dari class pesanmakanan_10120787
            makan.PesanMakanan();

            System.out.println("\n");
            System.out.print("Tekan [Enter] untuk kembali ke menu utama  ");
            input.nextLine();
            input.nextLine();
            ShowMenu();
        } // end menu 4

        // jika memilih menu 5 akan menampilkan menu pembayaran
        else if (PilihMenu == 5) {
            clearScreen();

            // wait 1 sec
            Tunggu1sec();

            // totalSemuaHarga didapat dari total pembelian tiket dan makanan
            TotalSemuaHarga = pesan.getTotalHargaTiket() + makan.getTotalHargaMakanan();

            System.out.print("Total Harga Tiket       : Rp." + pesan.getTotalHargaTiket());
            System.out.print("\nTotal Harga Makanan     : Rp." + makan.getTotalHargaMakanan());

            System.out.print("\n-------------------------------------- +");

            System.out.print("\nTotal Harga Keseluruhan : Rp." + TotalSemuaHarga);

            System.out.print("\n--------------------------------------");
            System.out.print("\nMasukkan uang anda      : Rp.");
            TotalUang = input.nextInt();

            // Jika uang yang dimasukkan kurang dari total harga keseluruhan
            if (TotalUang < TotalSemuaHarga) {
                System.out.print("--------------------------------------");
                System.out.println("\nUang anda tidak cukup");

                System.out.print("Tekan [Enter] untuk kembali ke menu utama ");
                input.nextLine();
                input.nextLine();
                ShowMenu();
            }
            // jika uang yang dimasukkan benar
            else {
                TotalUang = TotalUang - TotalSemuaHarga;
                System.out.println("Uang kembalian anda     : Rp." + TotalUang);
            }

            System.out.println("--------------------------------------");

            System.out.print("Tekan [Enter] untuk kembali ke menu utama  ");
            input.nextLine();
            input.nextLine();
            ShowMenu();

        } // end menu 5

        // jika memilih menu 6 akan keluar dari program
        else if (PilihMenu == 6) {

            clearScreen();

            System.out.print("Terima kasih telah menggunakan Aplikasi E-Cinemas");

            // wait 1 sec
            Tunggu1sec();

            // keluar console
            System.exit(0);
        }

        // validasi ketika memilih menu yang tidak ada
        while (PilihMenu > 6 || PilihMenu < 1) {
            System.out.print("\nPilihan Anda salah, silahkan pilih menu yang tersedia");

            // wait 1,5 sec
            try {
                Thread.sleep(1500);
            } catch (Exception e) {
                System.out.println(e);
            }

            ShowMenu();
            System.out.print("Pilihan Anda : ");
            PilihMenu = input.nextInt();
        }

    }

    // method menunggu 1 detik
    static void Tunggu1sec() {
        // wait 1 sec
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Method Untuk Clear Screen
    static void clearScreen() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                // clear screen untuk windows
                new ProcessBuilder("cmd", "/c", "cls")
                        .inheritIO()
                        .start()
                        .waitFor();
            } else {
                // clear screen untuk Linux, Unix, Mac
                Runtime.getRuntime().exec("clear");
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            System.out.println("Error karena: " + e.getMessage());
        }
    }
}
