package Inheritance;

// class ongoing_10120787 menginduk class showmenu_10120787 (Inheritance)
public class Ongoing_10120787 extends ShowMenu_10120787 {
    int PilihSinopsis;

    // method ComingSoon akan menampilkan movie yang sedang ongoing
    public void ComingSoon() {

        // menampilkan movie yang sedang ongoing didapat dari showmenu_10120787
        ShowOngoingMovies();

        System.out.print("\nPilih Sinopsis yang ingin anda pilih (Indeks) :   ");
        PilihSinopsis = input.nextInt();

        Sinopsis();

    }

    // method untuk menampilkan sinopsis
    public void Sinopsis() {
        System.out.println("\n\n");

        if (PilihSinopsis == 1) {
            System.out.println(
                    "Sinopsis :  [The Batman adalah sebuah kisah berlatar dengan Bruce Wayne yang telah memasuki tahun kedua  dalam “karirnya” sebagai Batman. Awalnya Bruce Wayne kurang bersemangat karena kurangnya pengaruh yang dia miliki terhadap kejahatan di Gotham ketika tiba-tiba serangkaian pembunuhan terjadi di tangan The Riddler. Hal ini kemudian akan mengungkapkan rahasia gelap tentang orang tuanya, Bruce juga dipaksa untuk menghadapi korupsi yang terjadi di bayang-bayang kotanya, sambil mencoba menangkap The Riddler sebelum dia membunuh lagi.]");
        } else if (PilihSinopsis == 2) {
            System.out.println(
                    "Sinopsis :  [Sebuah penerbangan penuh menyenangkan ke pulau terpencil berubah menjadi mimpi buruk bagi lima penumpang ketika pesawat mereka hancur dalam kecelakaan aneh dan mereka terjebak di rakit, 100 mil dari pantai dengan hiu pemakan manusia mengintai di bawah permukaan..]");
        } else if (PilihSinopsis == 3) {
            System.out.println(
                    "Sinopsis :  [Sekuel film Marvel 2016 Marvel 'Doctor Strange'.Setelah kejadian itu, Dr. Stephen Strange melanjutkan penelitiannya di Time Stone. Tapi seorang teman lama berbalik musuh berusaha untuk menghancurkan setiap penyihir di bumi, mengacaukan rencana aneh dan juga menyebabkan dia untuk melepaskan kejahatan yang tak terkalahkan]");
        } else if (PilihSinopsis == 4) {
            System.out.println(
                    "Sinopsis :  [Seorang remaja perempuan yang memiliki kekuatan pyrokinetik dan kemampuan melihat masa depan. ia diculik agen pemerintah misterius yang berencana mempersenjatai kemampuan manusia supernya.]");
        } else if (PilihSinopsis == 5) {
            System.out.println(
                    "Sinopsis :  [Moonfall mengisahkan tentang kekuatan misterius yang secara tiba-tiba mendorong orbit bulan mendekati bumi. Karena gaya gravitasi, akhirnya revolusi bulan semakin membawa satelit alami itu meyerempet bumi dan menghancurkan kehidupan.]");
        } else {
            clearScreen();
            // wait 1 sec
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.print("Maaf, sinopsis yang anda pilih tidak ada di dalam menu");
            return;
        }
    }
}
