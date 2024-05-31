public abstract class Tanaman {
    protected int masaHidup;
    protected int lamaHidup;
    protected int berbuah;
    protected int buah;
    protected double perkembangan;
    protected double prosesBerbuah;

    public Tanaman() {
    }

    public abstract void berkembang();

    public String status() {
        return lamaHidup >= masaHidup ? "Mati" : "Hidup";
    }

    public String toString() {
        return "Masa Hidup : " + masaHidup + ", Lama Hidup: " + lamaHidup + ", Buah: " + buah + ", Status: " + status();
    }

    public int getMasaHidup() {
        return masaHidup;
    }

    public void setMasaHidup(int masaHidup) {
        this.masaHidup = masaHidup;
    }

    public int getLamaHidup() {
        return lamaHidup;
    }

    public void setLamaHidup(int lamaHidup) {
        this.lamaHidup = lamaHidup;
    }

    public int getBerbuah() {
        return berbuah;
    }

    public void setBerbuah(int berbuah) {
        this.berbuah = berbuah;
    }

    public int getBuah() {
        return buah;
    }

    public void setBuah(int buah) {
        this.buah = buah;
    }

    public double getPerkembangan() {
        return perkembangan;
    }

    public void setPerkembangan(double perkembangan) {
        this.perkembangan = perkembangan;
    }

    public double getProsesBerbuah() {
        return prosesBerbuah;
    }

    public void setProsesBerbuah(double prosesBerbuah) {
        this.prosesBerbuah = prosesBerbuah;
    }

    protected abstract void treatment();
}