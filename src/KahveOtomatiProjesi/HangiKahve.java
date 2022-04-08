package KahveOtomatiProjesi;

import java.util.Locale;
import java.util.Scanner;

public class HangiKahve extends Varibles {
    static Scanner scanner = new Scanner(System.in);

    public static void hangiKahve() throws InterruptedException {
        System.out.println("Hangi Kahveyi İstersiniz?\n" + "  1.Türk kahvesi\n" + "  2.Filtre Kahve\n" + "  3.Espresso");

        kahveSecim = scanner.nextInt();
        switch (kahveSecim) {
            case 1:
                System.out.println("Turk kahvesi ");
                kahveTuru="Turk kahvesi ";
                sutEkleme();
                break;
            case 2:
                System.out.println("Filtre kahve ");
                kahveTuru="Filtre kahve ";
                sutEkleme();
                break;
            case 3:
                System.out.println("Espresso ");
                kahveTuru="Espresso ";
                sutEkleme();
                break;
            default:
                ;
                System.out.println("Hatali girdiniz, tekrar deneyin...");
                hangiKahve();
        }
    }

    public static void sutEkleme() throws InterruptedException {
        System.out.println("Süt eklememizi ister misiniz ? E/H " + "\nE- Sutlu\n" + "H- Sutsuz");

        sutSecim = scanner.next().toUpperCase();
        switch (sutSecim) {
            case "E":
                System.out.println("sutlu ");
                sut="sutlu ";
                sekerEkleme();
                break;
            case "H":
                System.out.println("sutsuz ");
                sut="sutsuz";
                sekerEkleme();
                break;
            default:
                System.out.println("Hatali girdiniz, tekrar deneyin...");
                sutEkleme();
                break;
        }
    }

    public static void sekerEkleme() throws InterruptedException {
        System.out.println("Seker eklemek istermisini? E/H" + "\nE- Sekerli\n" + "H- Sekersiz");

        sekerSecim = scanner.next().toUpperCase();
        switch (sekerSecim) {
            case "E":
                System.out.println("sekerli ");
                seker="Sekerli ";
                boyut();
                break;
            case "H":
                System.out.println("sekersiz ");
                seker="sekersiz ";
                boyut();
                break;
            default:
                System.out.println("Hatali girdiniz, tekrar deneyin...");
                sekerEkleme();
                break;
        }
    }

    public static void boyut() throws InterruptedException {
        System.out.println("Kahvenizin boyunu seciniz: \n" + "1 buyuk\n" + "2 orta\n" + "3 kucuk");

        boySecim = scanner.nextInt();
        if (boySecim == 1) {
            System.out.println("buyuk boy ");
            byt="buyuk boy";
            sonuc();
        } else if (boySecim == 2) {
            System.out.println("orta boy ");
            byt="orta boy ";
            sonuc();
        } else if (boySecim == 3) {
            System.out.println("kucuk boy ");
            byt="kucuk boy";
            sonuc();
        } else {
            System.out.println("Hatali girdiniz, tekrar deneyin...");
            boyut();
        }
        Thread.sleep(9000);//bekleme araligi olsun diye yazdim
    }

    public static void sonuc() {
        System.out.println(kahveTuru+ sut + seker + byt+"kahveniz hazir...Afiyet olsun...");
    }

}







