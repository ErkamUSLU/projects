package sansliKisiBul;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GirisPaneli {
    public static void panel(){
        Scanner scan = new Scanner(System.in);

        Kayit yeniKayit= new Kayit();// obje ile method calissin diye

        List<Kullanici> kisi=new ArrayList<>();
        boolean cikilsinMi =false;
        while(!cikilsinMi){//true ise calis
            System.out.println("Isleminizi seciniz: ");
            System.out.println("Lutfen \n1:Kayit al \n2: sansli kisi bul\n3:kisileri listele\n4:cikis");
            int islem= scan.nextInt();
            switch(islem){
                case 1:
                    kisi=yeniKayit.katitAl();
                    break;
                case 2:
                    yeniKayit.sansliKullanici(kisi);
                    break;
                case 3:
                    yeniKayit.listele(kisi);
                    break;
                case 4:
                    cikilsinMi=true;
                    break;
                default:
                    System.out.println("Hatali ver girdiniz...");
                    break;
            }
        }
    }
}
