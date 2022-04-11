package Alan_CevreHesaplamaProjesi;

public class Runner {
    public static void main(String[] args) {

        Cember cember = new Cember(4);
        cember.cevreCemberHesaplama();
        cember.alanCemberHesaplama();
        System.out.println(cember);

        Kare kare = new Kare(3);
        kare.cevreKareHesaplama();
        kare.alanKareHesaplama();
        System.out.println(kare);

        Dikdortgen dikdortgen = new Dikdortgen(2,1);
        dikdortgen.cevreDikdortgenHesaplama();
        dikdortgen.alanDikdortgenHesaplama();
        System.out.println(dikdortgen);

    }
}