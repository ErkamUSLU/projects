package SansliKisiBulmaProjesi;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayit {

    List<Kullanici> kisiler = new ArrayList<>();//bos list create edildi. method bu liste element atayacak.


    public List<Kullanici> katitAl() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Adinizi girin= ");
        String isim = scan.nextLine();
        Kullanici k1 = new Kullanici(isim, LocalDateTime.now());//Kullanici class'dan p'li constructor ile obje create edildi.
        kisiler.add(k1);//Kullanici classindan p'li cons ile crearte edilen obje kisiler listesine eklendi

        return kisiler;
    }

    public void sansliKullanici(List<Kullanici> kll) {
        for (Kullanici k : kll// kayitAl() methodunda create edilen her bir kullanici donguye sokuldu
        ) {
            if (k.kayitZamani.getSecond() < 10) {// her bir kullanicinin kayit zamanindaki saniye if sartina sokuldu
                System.out.println("Sansli kisisiniz " + k.name + "5 kila bal kazandiniz.");
            } else {
                System.out.println("Malesef sanssiz kisisiniz.");
            }
        }
    }

    public void listele(List<Kullanici> kullanicilar) {
        for (Kullanici k : kullanicilar) {//kayitAl methodundan kisiler listini donguye sokuyor
            System.out.println("adi: " + k.name + "  kayit zamani: " + k.kayitZamani);//kisiler listteki her bir kullanicinin ad ve kayit zamanini yazdiriyor
        }
    }
}
