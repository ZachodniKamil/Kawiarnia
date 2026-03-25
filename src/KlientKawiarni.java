public class KlientKawiarni {

    private int idKlienta;
    private String imie;
    private String nazwisko;
    private String email;

    public KlientKawiarni(int id,String imie, String nazwisko, String email) {
        this.idKlienta = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;

    }

    public void wyswietlDane() {
        System.out.println("Dane klienta" + idKlienta + " "+ imie + " " + nazwisko + " " + email);
    }

    @Override
    public String toString() {
        return "Dane klienta" + idKlienta + " "+ imie + " " + nazwisko + " " + email;
    }

    @Override
    public boolean equals(Object o) {
        return (this.idKlienta == ((KlientKawiarni) o).idKlienta) || (this.email.equals(((KlientKawiarni) o).email));
    }

}
