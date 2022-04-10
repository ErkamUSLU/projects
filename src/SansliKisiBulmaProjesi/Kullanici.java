package SansliKisiBulmaProjesi;

import java.time.LocalDateTime;

public class Kullanici {
    String name;
    LocalDateTime kayitZamani;

    public Kullanici () {  //p'siz constructor
         }

    public Kullanici(String name, LocalDateTime kayitZamani){//p'li constructor
        this.name=name;
        this.kayitZamani=kayitZamani;

        }
    }

