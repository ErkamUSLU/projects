package ManavProjesi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Methods extends Variables {
    protected static void urunSec(List<String> urunListesi, List<Double> fiyatListesi) {
        System.out.println("...Manavimiza hosgeldiniz...");
        System.out.println("Lutfen almak istediginiz urunu seciniz: \n" + urunListesi);
        int secilenUrun = scan.nextInt();
        System.out.println("Lutfen kac kg almak istediginizi giriniz: ");
        double miktar = scan.nextDouble();

        sepet.add(miktar + " kg " + (urunListesi.get(secilenUrun - 1).replaceAll("\\d", "")) + " ");
        sepetTutari += fiyatListesi.get(secilenUrun - 1) * miktar;
        System.out.println("Suan sepetinizdeki urunler: " + sepet);
        secimYap();
    }

    protected static void paraUstuHesapla() {
        System.out.println("Lutfen hesap bakiyenizi giriniz: ");
        musteriBakiye = scan.nextDouble();
        System.out.println("Hesap bakiyeniz: " + musteriBakiye + " ve $ Odemeniz gereken tutar: " + (float) sepetTutari + "$");
        if (sepetTutari > musteriBakiye) {
            System.out.println("Bu kadarcik parayla bu kadar cok sey alamazsiniz");}

            System.out.println(musteriBakiye - sepetTutari);

        }

        protected static void secimYap () {
            System.out.println("Baska bir urun almak ister misiniz: E/H");
            String secim = scan.next().substring(0, 1).toUpperCase();

            if (secim.equals("E")) {
                urunSec(urunListesi, fiyatListesi);
            } else if (secim.equals("H")) {
                paraUstuHesapla();
            } else {
                System.out.println("Hatali secim yaptiniz. Lutfen tekrar deneyiniz");
                secimYap();
            }
        }


    }

