package KitapProjesi;

import java.util.Scanner;

public class Methods extends Kitap {
    static Scanner scan = new Scanner(System.in);
    static int kitapSayac = 0;


    public static void kitapEkle() {
        System.out.println("Gireceginiz kitap bilgilerini yaziniz...");
        scan.nextLine();//DUMMY
        System.out.println("Kitap adi : ");
        String kitapAdi = scan.nextLine();
        System.out.println("Kitap yazari : ");
        String kitapYazari = scan.nextLine();
        System.out.println("Kitap fiyati : ");
        int kitapFiyat = scan.nextInt();
        kitapSayac++;
        int kitapNo = 1000 + kitapSayac;
        System.out.println("Kitap no : " + kitapNo);
        Kitap yeniKitap = new Kitap(kitapNo, kitapAdi, kitapYazari, kitapFiyat);
        kitapListesi.add(yeniKitap);
        System.out.println("Kitabiniz eklendi. Devam etmek icin 1 ana menu icin 0 a basiniz:");
        int secim4 = 0;
        try {
            secim4 = scan.nextInt();
            if (secim4 == 1) {
                kitapEkle();
            } else if (secim4 == 0) {
                menu();
            }
        } catch (Exception e) {
            String str = scan.next();
            System.out.println("Hatali giris yaptiniz. Tekrar deneyiniz...");
        }
    }


    public static void noSec() {
        for (int i = 0; i < kitapListesi.size(); i++) {
            System.out.println(kitapListesi.get(i).getKitapNo());
        }
        System.out.println("Listeden bir kitap no giriniz : ");
        int secim1 = scan.nextInt();
        boolean bulunduMu = false;
        for (int i = 0; i < kitapListesi.size(); i++) {
            if (kitapListesi.get(i).getKitapNo() == secim1) {
                bulunduMu = true;
                System.out.println("Aradiginiz sonuc bulundu : ");
                System.out.print("KItap No : " + kitapListesi.get(i).getKitapNo() + " ");
                System.out.print("KItap Adi : " + kitapListesi.get(i).getKitapAdi() + " ");
                System.out.print("KItap Yazari : " + kitapListesi.get(i).getKitapYazar() + " ");
                System.out.print("KItap Fiyati : " + kitapListesi.get(i).getKitapFiyat() + " ");
                System.out.println();
            }
        }
        if (!bulunduMu) System.out.println("Aradiginiz sonuc bulunamadi.");
        while (true) {
            System.out.println("Aramaya devam icin 1, menuye donmek icin 2 e basin.");
            try {
                secim1 = scan.nextInt();
                if (secim1 == 1) {
                    noSec();
                } else if (secim1 == 2) {
                    menu();
                }
            } catch (Exception e) {
                String str = scan.next();
                System.out.println("Hatali giris yaptiniz.");
                menu();
            }
        }
    }


    public static void noSil() {
        for (int i = 0; i < kitapListesi.size(); i++) {
            System.out.println(kitapListesi.get(i).getKitapNo());}
        System.out.println("Silmek icin bir kitap no giriniz : ");

        int secim3 = scan.nextInt();

        for (int i = 0; i < kitapListesi.size(); i++) {
            if (kitapListesi.get(i).getKitapNo()==secim3) {
                kitapListesi.remove(kitapListesi.get(i));
            }
        }
        System.out.println("Silmeye devam etmek icin 1, ana menu icin 2 e basin : ");
        int secim8 = 0;
        try {
            secim8 = scan.nextInt();
            if (secim8 == 1) {
                noSil();
            } else if (secim8 == 2) {
                menu();
            }
        } catch (Exception e) {
            String strr = scan.next();
            System.out.println("Hatali giris yaptiniz.");
            menu();
        }
    }


    public static void adSec() {
        for (int i = 0; i < kitapListesi.size(); i++) {
            System.out.println(kitapListesi.get(i).getKitapAdi());
        }
        System.out.println("Listeden bir kitap adi giriniz : ");
        scan.nextLine();
        String secim7 = scan.nextLine();
        boolean bulunduMu = false;
        for (int i = 0; i < kitapListesi.size(); i++) {
            if (kitapListesi.get(i).getKitapAdi().equalsIgnoreCase(secim7)) {
                bulunduMu = true;
                System.out.println("Aradiginiz sonuc bulundu : ");
                System.out.print("KItap No : " + kitapListesi.get(i).getKitapNo() + " ");
                System.out.print("KItap Adi : " + kitapListesi.get(i).getKitapAdi() + " ");
                System.out.print("KItap Yazari : " + kitapListesi.get(i).getKitapYazar() + " ");
                System.out.print("KItap Fiyati : " + kitapListesi.get(i).getKitapFiyat() + " ");
                System.out.println();
            }
        }
        if (!bulunduMu) System.out.println("Aradiginiz sonuc bulunamadi.");
        while (true) {
            System.out.println("Aramaya devam icin 1, menuye donmek icin 2 e basin.");
            try {
                int secim2 = scan.nextInt();
                if (secim2 == 1) {
                    adSec();
                } else if (secim2 == 2) {
                    menu();
                }
            } catch (Exception e) {
                String str = scan.next();
                System.out.println("Hatali giris yaptiniz.");
                menu();
            }
        }
    }


    public static void listele() {
        for (int i = 0; i < kitapListesi.size(); i++) {
            System.out.print("KItap No : " + kitapListesi.get(i).getKitapNo() + " ");
            System.out.print("KItap Adi : " + kitapListesi.get(i).getKitapAdi() + " ");
            System.out.print("KItap Yazari : " + kitapListesi.get(i).getKitapYazar() + " ");
            System.out.println("KItap Fiyati : " + kitapListesi.get(i).getKitapFiyat() + " ");
        }
        menu();
    }


    public static void cikis() {
        System.out.println("Iyi gunler...");
    }


    public static void menu() {
        System.out.println("Lutfen yapmak istediginiz islemi tuslayiniz : ");
        System.out.println(
                "1-)Kitap ekle\n" +
                        "2-)Numara ile kitap goruntule\n" +
                        "3-)Bilgi ile kitap goruntule\n" +
                        "4-)Numara ile kitap sil\n" +
                        "5-)Tum kitaplari goruntule\n" +
                        "6-)Cikis ");

        int secim = 0;
        try {
            secim = scan.nextInt();
        } catch (Exception e) {
            String str = scan.next();
            System.out.println("Hatali giris yaptiniz. Lutfen tekrar deneyiniz...");
            menu();
        }
        switch (secim) {
            case 1:
                kitapEkle();
                break;
            case 2:
                noSec();
                break;
            case 3:
                adSec();
                break;
            case 4:
                noSil();
                break;

            case 5:
                listele();
                break;
            case 6:
                cikis();
                break;
            default:
                System.out.println("Hatali giris...");
                menu();
                break;
        }
    }
}
