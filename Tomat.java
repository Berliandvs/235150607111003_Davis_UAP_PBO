public class Tomat extends Tanaman implements Perawatan {
    public Tomat() {
        this.masaHidup = 100;
        this.berbuah = 100;
        this.perkembangan = 0.025;

    }

    @Override
    public void berkembang() {
        lamaHidup++;
        prosesBerbuah += perkembangan;

        if (prosesBerbuah >= berbuah) {
            buah++;
            prosesBerbuah -= berbuah;
        }
    }

    @Override
    public void treatment() {
        perkembangan += perkembangan * 0.05;
    }
    @Override
    public String toString() {
        return "\nMasa hidup \t: " + masaHidup + "\nUmur tanaman \t: " + lamaHidup +" hari"+ "\nMenghasilkan \t: " + berbuah +" buah"+ "\nStatus  \t: " + status();
    }
}