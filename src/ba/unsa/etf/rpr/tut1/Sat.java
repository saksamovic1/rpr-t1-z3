package ba.unsa.etf.rpr.tut1;

public class Sat {
    private int sati, minute, sekunde;

    public Sat(int sati, int minute, int sekunde) {
        Postavi(sati, minute, sekunde);
    }

    public final void Postavi(int sati, int minute, int sekunde) {
        this.sati = sati;
        this.minute = minute;
        this.sekunde = sekunde;
    }

    public void Sljedeci() {
        sekunde = sekunde + 1;
        if (sekunde == 60) {
            sekunde = 0;
            minute = minute + 1;
        }
        if (minute == 60) {
            minute = 0;
            sati = sati + 1;
        }
        if (sati == 24) sati = 0;
    }

    public void Prethodni() {
        sekunde = sekunde - 1;
        if (sekunde == -1) {
            sekunde = 59;
            minute = minute - 1;
        }
        if (minute == -1) {
            minute = 59;
            sati = sati - 1;
        }
        if (sati == -1) sati = 23;
    }

    public void pomjeriZa(int pomak) {
        if (pomak > 0) for (int i = 0; i < pomak; i++) Sljedeci();
        else for (int i = 0; i < -pomak; i++) Prethodni();
    }

    int dajSate() {
        return sati;
    }

    int dajMinute() {
        return minute;
    }

    int dajSekunde() {
        return sekunde;
    }

    void Ispisi() {
        System.out.println(sati + ":" + minute + ":" + sekunde);
    }
}