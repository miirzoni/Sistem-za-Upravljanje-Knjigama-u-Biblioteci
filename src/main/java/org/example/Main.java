package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        HashMap<String, Knjiga> biblioteka = new HashMap<>();

        ObicnaKnjiga o1 = new ObicnaKnjiga("1", 150);
        ObicnaKnjiga o2 = new ObicnaKnjiga("2", 60);
        RijetkaKnjiga r1 = new RijetkaKnjiga("3", 1890);
        RijetkaKnjiga r2 = new RijetkaKnjiga("4", 99);

        biblioteka.put(o1.getISBN(), o1);
        biblioteka.put(o2.getISBN(), o2);
        biblioteka.put(r1.getISBN(), r1);
        biblioteka.put(r2.getISBN(), r2);

        o1.azurirajStatus("Rezervisana");
        o2.azurirajStatus("Izgubljeno");
        r1.azurirajStatus("Ne postoji");
        r2.azurirajStatus("Posuđeno");

        double ukupno = 0;
        System.out.println("====== SVE KNJIGE ======");
        for(Map.Entry<String, Knjiga> entry : biblioteka.entrySet()){
            Knjiga knjiga = entry.getValue();
            System.out.println("---------------------");
            System.out.println("ISBN: " + knjiga.getISBN());
            System.out.println("Tip: " + (knjiga instanceof RijetkaKnjiga ? "Rijetka" : "Obična"));
            if(knjiga instanceof  RijetkaKnjiga){
                System.out.println("Status: " + ((Status)knjiga).getStatus());
            }
            double vrijednost = knjiga.izracunajVrijednost();
            System.out.println("Vrijednost knjige je: " + vrijednost);
            ukupno += vrijednost;
        }
        System.out.println("Ukupna vrijednost knjiga je: " + ukupno);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite ISBN za pretragu: ");
        String trazeni = scanner.nextLine();

        if(biblioteka.containsKey(trazeni)){
            Knjiga knjiga = biblioteka.get(trazeni);
            System.out.println("====== PRONAĐENA KNJIGA ======");
                System.out.println("ISBN: " + knjiga.getISBN());
                System.out.println("Tip: " + (knjiga instanceof RijetkaKnjiga ? "Rijetka" : "Obična"));
                if(knjiga instanceof  RijetkaKnjiga){
                    System.out.println("Status: " + ((Status)knjiga).getStatus());
                }
                System.out.println("Vrijednost knjige je: " + knjiga.izracunajVrijednost());
        }else{
            System.out.println("ISBN ne postoji!");
        }
    }
}