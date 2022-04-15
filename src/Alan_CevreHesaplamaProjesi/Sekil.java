package Alan_CevreHesaplamaProjesi;

public class Sekil {
    double uzunKenar;
    double kisaKenar;
    static double kenar;
    static double yaricap;

    public Sekil(double uzunKenar, double kisaKenar) {
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
    }

    public Sekil(double x) {
       this.kenar=x;
       this.yaricap=x;
    }


    public double cevreDikdortgenHesaplama (){
        return 2*(uzunKenar+kisaKenar);
    }

    public double alanDikdortgenHesaplama (){
        return (uzunKenar*kisaKenar);
    }




    public double cevreCemberHesaplama (){
        return (2*3.14*yaricap);
    }

    public double alanCemberHesaplama (){
        return (3.14*yaricap*yaricap);
    }




    public double cevreKareHesaplama (){
        return (4*kenar);
    }

    public double alanKareHesaplama (){
        return (kenar*kenar);
    }

}

