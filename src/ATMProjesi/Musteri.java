package ATMProjesi;

import java.util.Scanner;

public class Musteri extends Variable{
    public static Scanner scan = new Scanner(System.in);
    protected static int secim;

    public static void giris() {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("***Hosgeldiniz***");
        System.out.println("Kart numaranizi girin: ");
        String girilenKartNo = scan1.nextLine();
        girilenKartNo.replace(" ", "");
        System.out.println("Sifre: ");
        String girilenSifre = scan1.next();
        if(girilenKartNo.equals(kartNo) && girilenSifre.equals(sifre)) {
         girisEkrani();
        }else {System.out.println("Hatali giris...");
        giris();}
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
            if (yeniSifre.length()!=4){
                System.out.println("Sifreniz 4 haneli olmali.");
                sifreDegistirme();
            }
            else {
            String sifre = yeniSifre;
            System.out.println("Sifreniz basariyla degistirildi...");}
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
    public static void girisEkrani() {
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
                bakiyeSorgulamak();
                girisEkrani();
                break;
            case 2:
                obj.paraYatir();
                girisEkrani();
                break;
            case 3:
                obj.paraCekme();
                girisEkrani();
                break;
            case 4:
                obj.sifreDegistirme();
                girisEkrani();
                break;
            case 5:
                obj.paraGonderme();
                girisEkrani();
                break;
            case 6:
                cikis();
                break;
            default:
                System.out.println("Lutfen gecerli bir tus girin...");
                girisEkrani();
                break;
        }

        }

    }
