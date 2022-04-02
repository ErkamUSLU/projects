package UcusProjesi;

public class Methodlar {

    static int mesafeB = 500;
    static int mesafeC = 700;
    static int mesafeD = 900;

    public static String yasKategoriSec(int yas) {

        String yasKategori = " ";

        if (yas <= 12) yasKategori = "cocuk";
        else if (yas <= 24 && yas > 12) yasKategori = "genc";
        else if (yas >= 65) yasKategori = "yasli";
        return yasKategori;
    }

    public static double sehirBUl(String hedefSehir, double anaFiyat) {

        switch (hedefSehir) {
            case "B": {
                anaFiyat = mesafeB * 0.10;
                break;
            }
            case "C": {
                anaFiyat = mesafeC * 0.10;
                break;
            }
            case "D": {
                anaFiyat = mesafeD * 0.10;
                break;
            }
            default:
                System.out.println("Firmamiz oraya gitmiyor...");
                break;
        }
        return anaFiyat;
    }

    public static double yasIndirimi(String yasKategori, double anaFiyat) {

        switch (yasKategori) {
            case "cocuk": {
                anaFiyat = anaFiyat * 0.5;
                break;
            }
            case "genc": {
                anaFiyat = anaFiyat * 0.9;
            }
            case "yasli": {
                anaFiyat = anaFiyat * 0.7;
            }
            default:
                break;

        }
        return anaFiyat;
    }
}

