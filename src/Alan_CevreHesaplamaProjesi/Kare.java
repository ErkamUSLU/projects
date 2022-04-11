package Alan_CevreHesaplamaProjesi;

public class Kare extends Sekil{
    public Kare(double kenar){
        super(kenar);
    }

    public double alanKareHesaplama(){
        return  super.alanKareHesaplama();
    }

    public double cevreKareHesaplama(){
        return super.cevreKareHesaplama();
    }

    @Override
    public String toString() {
        return "Kare" +"\nkenar=" + kenar +"\ncevre= "+cevreCemberHesaplama()+"\nalan= "+alanCemberHesaplama();
    }
}
