package UcusProjesi;

import java.util.Scanner;

public class Yolcu_Bilgileri {
    public static void main(String[] args) {


        double anaFiyat = 0;
        Scanner scanner = new Scanner(System.in);


        System.out.println("***UCUS PROGRAMI***");

        System.out.println("Isim Soyisim : ");
        OnBilgi yolcu = new OnBilgi();
        yolcu.isimSoyisim=scanner.nextLine();



        System.out.print("Lutfen gitmek istediginiz yeri girin = ");
        yolcu.hedefSehir=scanner.next().substring(0,1).toUpperCase();
        anaFiyat=Methodlar.sehirBul(yolcu.hedefSehir,anaFiyat);

        System.out.println("Lutfen yasinizi giriniz = ");
        yolcu.yas=scanner.nextInt();
        yolcu.yasKategori=Methodlar.yasKategoriSec(yolcu.yas);

        anaFiyat= Methodlar.yasIndirimi(yolcu.yasKategori,anaFiyat);

        System.out.println("Tek yon ise 1 gidis donus ise 2 tiklayiniz.");
        yolcu.gidisDonusSecim=scanner.nextInt();
        if(yolcu.gidisDonusSecim==1){}
        else if (yolcu.gidisDonusSecim==2){anaFiyat*=0.8;}
        System.out.println("ToplamUcetiniz = "+ anaFiyat+ " Tl'dir.");

    }
}