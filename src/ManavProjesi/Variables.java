package ManavProjesi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Variables {
    public static Scanner scan= new Scanner(System.in);

    protected static List<String> urunListesi=new ArrayList<>(Arrays.asList
    ("Domates 1","Patates 2", "Biber 3", "Sogan 4", "Havuc 5","Elma 6", "Muz 7", "Cilek 8", "Kavun 9", "Uzum 10", "Limon 11"));

    protected static List<Double>fiyatListesi=new ArrayList<Double>(Arrays.asList
    (2.1,3.2,1.5, 2.3, 3.1, 1.2, 1.9, 6.1, 4.3, 2.7, 0.5));

    protected static List<String>sepet=new ArrayList<>();

    protected static double sepetTutari;

    protected static double musteriBakiye;


}
