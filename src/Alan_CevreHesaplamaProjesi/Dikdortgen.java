package Alan_CevreHesaplamaProjesi;

public class Dikdortgen extends Sekil{
    public Dikdortgen(double uzunKenar,double kisaKenar){
        super(uzunKenar,kisaKenar);
    }

    public double cevreDikdortgenHesaplama(){
        return super.cevreDikdortgenHesaplama();
    }
    public double alanDikdortgenHesaplama(){
        return super.alanDikdortgenHesaplama();
    }

    @Override
    public String toString() {
        return "Dikdortgen" +"\nuzunKenar= " + uzunKenar +"\nkisaKenar= " + kisaKenar +"\nalan= "
                +alanDikdortgenHesaplama()+"\ncevre= "+cevreDikdortgenHesaplama();
    }
}
