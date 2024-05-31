public class Persik extends Tanaman implements Perawatan {
    public Persik() {
        this.masaHidup = 180;
        this.berbuah = 250;
        this.perkembangan = 0.15;
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
        perkembangan += perkembangan * 0.025;
    }
    @Override
    public String toString() {
        return "\nMasa hidup \t: " + masaHidup + "\nUmur tanaman \t: " + lamaHidup +" hari"+ "\nMenghasilkan \t: " + berbuah +" buah"+ "\nStatus  \t: " + status();
    }
}