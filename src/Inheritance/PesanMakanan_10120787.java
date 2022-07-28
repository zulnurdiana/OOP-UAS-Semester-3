package Inheritance;

// class pesanmakanan_10120787 menginduk class showmenu_10120787 (Inheritance)
public class PesanMakanan_10120787 extends ShowMenu_10120787 {

    // variabel
    private int PriceMakanan;
    private int JumlahMakanan;
    private int totalHargaMakanan;
    private int subTotalMakanan;
    private int DiskonMakanan;
    private String Membership;

    public void PesanMakanan() {
        totalHargaMakanan = 0;
        DiskonMakanan = 0;

        // Menampilkan makanan dan minuman didapat dari showmenu_10120787
        ShowMakanan();

        System.out.print("\nPilih Makanan yang ingin anda pesan (Indeks) : ");
        int PilihMakanan = input.nextInt();

        if (PilihMakanan == 1) {
            PriceMakanan = HargaMakanan[PilihMakanan - 1];
        } else if (PilihMakanan == 2) {
            PriceMakanan = HargaMakanan[PilihMakanan - 1];
        } else if (PilihMakanan == 3) {
            PriceMakanan = HargaMakanan[PilihMakanan - 1];
        } else if (PilihMakanan == 4) {
            PriceMakanan = HargaMakanan[PilihMakanan - 1];
        } else if (PilihMakanan == 5) {
            PriceMakanan = HargaMakanan[PilihMakanan - 1];
        } else {
            clearScreen();
            // wait 1 sec
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.print("Maaf, makanan yang anda pilih tidak ada di dalam menu");
            return;
        }

        System.out.print("Masukkan Jumlah Makanan yang ingin anda beli : ");
        JumlahMakanan = input.nextInt();

        subTotalMakanan = JumlahMakanan * PriceMakanan;

        System.out.print("Apakah Anda mempunyai Membership? (Y/N)      : ");
        Membership = input.next();

        // jika pengguna memiliki membership maka harga akan dikurangi sebesar 25%
        if (Membership.equalsIgnoreCase("y")) {
            DiskonMakanan += (JumlahMakanan * PriceMakanan) * 0.25;
        }
        // jika pengguna tidak memiliki membership maka harga akan tetap
        else {
            DiskonMakanan = 0;
        }

        System.out.println("\n----------------------------------");
        totalHargaMakanan = subTotalMakanan - DiskonMakanan;
        Tunggu();
        System.out.println("Subtotal             : Rp." + subTotalMakanan);
        Tunggu();
        System.out.println("Diskon Membership    : Rp." + DiskonMakanan);
        Tunggu();
        System.out.println("---------------------------------- -");
        Tunggu();
        System.out.println("Total Harga Makanan  : Rp." + totalHargaMakanan);
    }

    // get TotalHargaMakanan dari method pesanmakanan_10120787
    public int getTotalHargaMakanan() {
        return totalHargaMakanan;
    }
}
