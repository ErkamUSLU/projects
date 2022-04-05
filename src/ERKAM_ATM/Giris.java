package ERKAM_ATM;

import java.util.Scanner;

import static ERKAM_ATM.Musteri.scan;

public class Giris {

    static int secim;

    public static void main(String[] args) {


        Variable.sifreOnay = Musteri.giris();
        // TR111111111111111111111111

        while (Variable.sifreOnay) {
            System.out.println("***MENU***");
            System.out.println("1-)Bakiye Sorgulama: ");
            System.out.println("2-)Para Yatirma: ");
            System.out.println("3-)Para Cekme: ");
            System.out.println("4-)Sifre degistirme: ");
            System.out.println("5-)Para Gonderme: ");
            System.out.println("6-)Cikis: ");

            Musteri obj = new Musteri();
            secim = scan.nextInt();

            switch (secim) {
                case 1:
                    obj.bakiyeSorgulamak();
                    break;
                case 2:
                    obj.paraYatir();
                    break;
                case 3:
                    obj.paraCekme();
                    break;
                case 4:
                    obj.sifreDegistirme();
                    break;
                case 5:
                    obj.paraGonderme();
                    break;
                default:
                    break;
            }
            if (secim == 6) {
                obj.cikis();
                break;
            }
        }
    }
}
