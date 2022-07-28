package Inheritance;

// import scanner
import java.util.Scanner;

public class ShowMenu_10120787 {

    Scanner input = new Scanner(System.in);

    // membuat array harga tiket
    protected int[] HargaTiket = {
            42500,
            43500,
            40000,
            37500,
            45000

    };

    // membuat array harga makanan
    protected int[] HargaMakanan = {
            65000,
            35000,
            45000,
            20000,
            42500

    };

    // membuat method menampilkan movies
    public void ShowMovies() {
        System.out.println("+------------------------------------------------------------------------------------+");
        System.out.println("|                             MOVIES YANG SEDANG TAYANG                              |");
        System.out.println("+----+-----------------------------+---------------+--------+-----------+------------+");
        System.out.println("| NO |         NAMA MOVIE          |  SUTRADARA    |  JAM   |   HARI    |    HARGA   |");
        System.out.println("+----+-----------------------------+---------------+--------+-----------+------------+");
        System.out.println("| 1. |   SPIDERMAN : NO WAY HOME   |   JON WATTS   |  18.30 |   KAMIS   |  Rp.42.500 |");
        System.out.println("| 2. |     KU KIRA KAU RUMAH       |  UMAY SHABAB  |  13.00 |   SENIN   |  Rp.43.500 |");
        System.out.println("| 3. |          MAKMUM 2           |   GUNTUR S    |  9.40  |   RABU    |  Rp.40.000 |");
        System.out.println("| 4. |           SING 2            |   GARTH JEAN  |  16.00 |   JUMAT   |  Rp.37.500 |");
        System.out.println("| 5. |         UNCHARTED           |   RUBEN FER   |  12.00 |   SELASA  |  Rp.45.000 |");
        System.out.println("+----+-----------------------------+---------------+--------+-----------+------------+");
    }

    // membuat method menampilkan movies yang sedang ongoing
    public void ShowOngoingMovies() {
        System.out.println("+------------------------------------------------------------------------------------+");
        System.out.println("|                             MOVIES YANG SEDANG ONGOING                             |");
        System.out.println("+----+-----------------------------+--------------+---------------+------------------+");
        System.out.println("| NO |         NAMA MOVIE          |  SUTRADARA   |    TANGGAL    |      GENRE       |");
        System.out.println("+----+-----------------------------+--------------+---------------+------------------+");
        System.out.println("| 1. |         THE BATMAN          |  MATT REEVES |  4 MARET 2022 |  ACTION,HEROES   |");
        System.out.println("| 2. |         GREAT WHITE         |  MARTIN WIL  |  7 MEI 2022   |  SURVIVAL,HORROR |");
        System.out.println("| 3. |        DOCTOR STRANGE       |  SAM RAIMI   |  6 MEI 2022   |  ACTION,HEROES   |");
        System.out.println("| 4. |         FIRESTARTER         |  ZAC EFRON   |  13 MEI 2022  |  SCI-FICTION     |");
        System.out.println("| 5. |          MOON FALL          |  ROLLAND E   |  2 MARET 2022 |  SCI-FICTION     |");
        System.out.println("+----+-----------------------------+--------------+---------------+------------------+");
    }

    // membuat method menampilkkan makanan & minuman yang tersedia
    public void ShowMakanan() {
        System.out.println("+-------------------------------------------------------------+");
        System.out.println("|                  DAFTAR MAKANAN & MINUMAN                   |");
        System.out.println("+----+-----------------------------+------------+-------------+");
        System.out.println("| NO |         NAMA MAKANAN        |   UKURAN   |    HARGA    |");
        System.out.println("+----+-----------------------------+------------+-------------+");
        System.out.println("| 1. |       CARAMEL POPCORN       |      L     |   Rp.65000  |");
        System.out.println("| 2. |       CHEESE POPCORN        |      S     |   Rp.35000  |");
        System.out.println("| 3. |        SALT POPCORN         |      M     |   Rp.45000  |");
        System.out.println("| 4. |       BROWNSUGAR BOBA       |      -     |   Rp.20000  |");
        System.out.println("| 5. |       HOT COFFEE LATTE      |      -     |   Rp.22500  |");
        System.out.println("+----+-----------------------------+------------+-------------+");

    }

    // membuat inisiasi method pesantiket
    public void PesanTiket() {
        System.out.println("Belum Memiliki Tiket");
    }

    // membuat inisiasi method pesanmakanan
    public void PesanMakanan() {
        System.out.println("Belum Memiliki Makanan");
    }

    // membuat inisiasi method comingsoon
    public void ComingSoon() {
        System.out.println("Coming Soon");
    }

    // membuat inisiasi method getTotalHargaTiket
    public int getTotalHargaTiket() {
        return 0;
    }

    // membuat inisiasi method getTotalHargaMakanan
    public int getTotalHargaMakanan() {
        return 0;
    }

    // method tunggu 0,5 detik
    public void Tunggu() {
        // wait 0,5 sec
        try {
            Thread.sleep(500);
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
