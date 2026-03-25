import java.util.ArrayList;

public class Zamowienie {

    private int numerZamowienia;
    private KlientKawiarni klient;
    private ArrayList<ProduktMenu> produkty;
    private boolean oplacone;
    private static int kolejnyNumer;

    public Zamowienie(KlientKawiarni klient) {
        this.klient = klient;
        this.produkty = new ArrayList<>();
    }

    public void dodajProdukt(ProduktMenu p) {
        produkty.add(p);
    }


    public double policzWartosc() {
        double suma = 0;
        for (int i =0; i < produkty.size(); i++) {
            suma += produkty.get(i).getCena();
        }
        return suma;
    }

    public int policzLiczbeProduktow() {
        return produkty.size();
    }

    public void oznaczJakoOplacone() {
        oplacone = true;
    }

    public static int pobierzKolejnyNumer() {
        return kolejnyNumer++;
    }

    @Override
    public String toString() {
        return "Zamowienie :" + numerZamowienia + "Czy Opłacone : " + oplacone;
    }
}
