package ERKAM_ATM;

import java.util.Scanner;

public class Musteri {
    public static Scanner scan = new Scanner(System.in);

    public static boolean giris() {
        boolean sifreOnay = false;
        String girilenKartNo;
        String girilenSifre;
        System.out.println("***Hosgeldiniz***");
        System.out.println("Kart numaranizi girin: ");
        girilenKartNo = scan.nextLine();
        girilenKartNo.replace(" ", "");
        System.out.println("Sifre: ");
        girilenSifre = scan.next();
        if (girilenKartNo.equals(Variable.kartNo) && girilenSifre.equals(Variable.sifre)) {
            sifreOnay = true;
        } else System.out.println("Hatali giris...");
        return sifreOnay;
    }

    public static void paraYatir() {
        System.out.println("Para yatirmayi sectiniz.Hesaptaki paraniz: " + Variable.bakiye);
        double yatirilanPara;
        do {
            System.out.println("Yatirmak istediginiz miktari giriniz: ");
            yatirilanPara = scan.nextDouble();
            if (yatirilanPara < 0) {
                System.out.println("Boyle bir para girisi olmaz.Yeniden girin:");
            }
            System.out.println("");
        } while (yatirilanPara < 0);
        Variable.bakiye += yatirilanPara;
        System.out.println("Hesaptaki para: " + Variable.bakiye);
    }

    public static void paraCekme() {
        double cekilenPara;
        System.out.println("Para cekmeyi sectiniz.Hesaptaki paraniz: " + Variable.bakiye);
        do {
            System.out.println("Cekmek istediginiz tutar: ");
            cekilenPara = scan.nextDouble();
            if (cekilenPara > Variable.bakiye) {
                System.out.println("Hesabinizda bu kadar nakit yok.Lutfen yeniden deneyiniz.");
            }
        } while (cekilenPara > Variable.bakiye);
        Variable.bakiye -= cekilenPara;
        System.out.println("Hesaptaki para: " + Variable.bakiye);
    }
    public static void bakiyeSorgulamak()
    {
        System.out.println("Hesbinizdaki para: " + Variable.bakiye);
    }
    public static void paraGonderme() {
        System.out.println("Para gonderme secenegini sectiniz.");
        System.out.println("Gondereceginiz IBAN nosunu giriniz: ");
        String ibanNo = scan.next();
        double gonderilenPara;
        if (ibanNo.length() == 26 && ibanNo.toUpperCase().startsWith("TR")) {
            System.out.println("Gondermek istediginiz tutar: ");
            gonderilenPara = scan.nextDouble();
            if (gonderilenPara > Variable.bakiye) {
                System.out.println("Hesabinizda bu kadar nakit yok.Lutfen baska bir tutar giriniz.");
            } else {
                System.out.println("Gonderme isleminiz tamamlandi.");
                System.out.println("Gonderilen tutar = " + gonderilenPara);
                Variable.bakiye -= gonderilenPara;
            }
        }
        System.out.println("Yanlis IBAN no girdiniz.");
        System.out.println("Cikis icin 1 tekrar denemek icin 2 e basin.");
        int tus =scan.nextInt();
        if (tus == 1) {
            cikis();
        } else if (tus == 2) {
            paraGonderme();
        }
    }
    public static void sifreDegistirme() {
        System.out.println("Sifre degistirme secenegini sectiniz.");
        System.out.println("Mevcut sifrenizi giriniz: ");
        String girilenSifre1=scan.next();
        if (Variable.sifre.equals(girilenSifre1)){
            System.out.println("Koyacaginiz yeni sifreyi giriniz: ");
            String yeniSifre = scan.next().substring(0, 3);
            String sifre = yeniSifre;
            System.out.println("Sifreniz basariyla degistirildi...");
        }else{
            System.out.println("Yanlis sifre girdiniz.");
            System.out.println("Cikis icin 1 tekrar denemek icin 2 e basin.");
            int tus1 =scan.nextInt();
            if (tus1 == 1) {
                cikis();
            } else if (tus1 == 2) {
                sifreDegistirme();
            }
        }
    }
    public static void cikis() {
        System.out.println("Cikis yapiliyor.Kendinize iyi bakin.Gorusmek dilegiyle.");
    }
}
