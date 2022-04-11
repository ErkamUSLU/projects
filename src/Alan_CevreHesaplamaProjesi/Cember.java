package Alan_CevreHesaplamaProjesi;

public class Cember extends Sekil {
    public Cember(double yaricap) {
        super(yaricap);
    }

    public double cevreCemberHesaplama (){
        return super.cevreCemberHesaplama();
    }

    public double alanCemberHesaplama (){
       return super.alanCemberHesaplama();
    }

    @Override
    public String toString() {
        return "Cember" + "\nyaricap= " + yaricap+"\ncevre= "+cevreCemberHesaplama()+"\nalan= "+alanCemberHesaplama();
    }
}
