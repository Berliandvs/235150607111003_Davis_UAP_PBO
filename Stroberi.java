public class Stroberi extends Tanaman implements Perawatan {
    public Stroberi() {
        this.masaHidup = 60;
        this.berbuah = 150;
        this.perkembangan = 0.35;
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