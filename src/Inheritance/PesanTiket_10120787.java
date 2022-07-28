package Inheritance;

// class pesantiket_10120787 menginduk class showmenu_10120787 (Inheritance)
public class PesanTiket_10120787 extends ShowMenu_10120787 {

    // variabel
    private int PriceTiket;
    private int JumlahTiket;
    private int subTotalTiket;
    private int totalHargaTiket;
    private int DiskonTiket;

    public void PesanTiket() {
        DiskonTiket = 0;
        totalHargaTiket = 0;

        // Menampilkan movies yang sedang tayang dari showmenu_10120787
        ShowMovies();

        System.out.print("\nPilih Film yang ingin anda tonton (Indeks) : ");
        int PilihTiket = input.nextInt();

        if (PilihTiket == 1) {
            PriceTiket = HargaTiket[PilihTiket - 1];
        } else if (PilihTiket == 2) {
            PriceTiket = HargaTiket[PilihTiket - 1];
        } else if (PilihTiket == 3) {
            PriceTiket = HargaTiket[PilihTiket - 1];
        } else if (PilihTiket == 4) {
            PriceTiket = HargaTiket[PilihTiket - 1];
        } else if (PilihTiket == 5) {
            PriceTiket = HargaTiket[PilihTiket - 1];
        } else {
            clearScreen();

            // wait 1 sec
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.print("Maaf, film yang anda pilih tidak ada di dalam menu");
            return;
        }

        System.out.print("Masukkan Jumlah Tiket yang ingin anda beli : ");
        JumlahTiket = input.nextInt();

        subTotalTiket = JumlahTiket * PriceTiket;

        // jika jumlah tiket > 3 dan <= 5 maka harga akan dikurangi sebesar 10%
        if (JumlahTiket > 3 && JumlahTiket <= 5) {
            DiskonTiket += (PriceTiket * JumlahTiket) * 0.1;
        }
        // jika jumlah tiket > 5 dan < 10 maka harga akan dikurangi sebesar 15%
        else if (JumlahTiket > 5 && JumlahTiket < 10) {
            DiskonTiket += (PriceTiket * JumlahTiket) * 0.15;
        }
        // jika jumlah tiket >= 10 maka harga akan dikurangi sebesar 20%
        else if (JumlahTiket >= 10) {
            DiskonTiket += (PriceTiket * JumlahTiket) * 0.2;
        }
        // jika jumlah tiket <= 3 maka harga akan tetap
        else {
            DiskonTiket = 0;
        }

        System.out.println("\n----------------------------------");
        totalHargaTiket = subTotalTiket - DiskonTiket;
        Tunggu();
        System.out.println("Subtotal          : Rp." + subTotalTiket);
        Tunggu();
        System.out.println("Diskon            : Rp." + DiskonTiket);
        Tunggu();
        System.out.println("---------------------------------- -");
        Tunggu();
        System.out.println("Total Harga Tiket : Rp." + totalHargaTiket);

    }

    // get TotalHargaTiket dari method PesanTiket
    public int getTotalHargaTiket() {
        return totalHargaTiket;
    }

}
