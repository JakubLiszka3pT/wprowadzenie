public class Uczen extends  Osoba{
    private static int liczbaUczniow = 0;
    private int nrUcznia = 0;

    public Uczen(String nazwisko, String imie) {
        super(nazwisko, imie);
        this.liczbaUczniow  ++;
        this.nrUcznia = liczbaUczniow;
    }

    public int getLiczbaUczniow() {
        return liczbaUczniow;
    }

    public void setLiczbaUczniow(int liczbaUczniow) {
        this.liczbaUczniow = liczbaUczniow;
    }

    public int getNrUcznia() {
        return nrUcznia;
    }

    public void setNrUcznia(int nrUcznia) {
        this.nrUcznia = nrUcznia;
    }

    @Override
    public String toString() {
        return "Uczen{" + getImie() +
                getNazwisko() +
                "liczbaUczniow=" + liczbaUczniow +
                ", nrUcznia=" + nrUcznia +
                '}';
    }
}
