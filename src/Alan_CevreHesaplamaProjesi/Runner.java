package Alan_CevreHesaplamaProjesi;

public class Runner {
    public static void main(String[] args) {

        Cember cember = new Cember(1);
        cember.cevreCemberHesaplama();
        cember.alanCemberHesaplama();
        System.out.println(cember);



        Dikdortgen dikdortgen = new Dikdortgen(5,1);
        dikdortgen.cevreDikdortgenHesaplama();
        dikdortgen.alanDikdortgenHesaplama();
        System.out.println(dikdortgen);

        Kare kare = new Kare(3);
        kare.cevreKareHesaplama();
        kare.alanKareHesaplama();
        System.out.println(kare);

    }
}