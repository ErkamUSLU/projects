package KitapProjesi;

import java.util.ArrayList;
import java.util.List;

public class Kitap {
    private int kitapNo;
    private String kitapAdi;
    private String kitapYazar;
    private int kitapFiyat;
   static List<Kitap> kitapListesi=new ArrayList<>();

    public Kitap(){

    }

    public Kitap(int kitapNo, String kitapAdi, String kitapYazar, int kitapFiyat) {
        this.kitapNo = kitapNo;
        this.kitapAdi = kitapAdi;
        this.kitapYazar = kitapYazar;
        this.kitapFiyat = kitapFiyat;
    }



    public int getKitapNo() {
        return kitapNo;
    }

    public void setKitapNo(int kitapNo) {
        this.kitapNo = kitapNo;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public String getKitapYazar() {
        return kitapYazar;
    }

    public void setKitapYazar(String kitapYazar) {
        this.kitapYazar = kitapYazar;
    }

    public int getKitapFiyat() {
        return kitapFiyat;
    }

    public void setKitapFiyat(int kitapFiyat) {
        this.kitapFiyat = kitapFiyat;
    }
}
