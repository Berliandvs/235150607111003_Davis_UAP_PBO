import java.util.ArrayList;
import java.util.Scanner;

public class Data {
    private ArrayList<Tanaman> tanamans;
    private ArrayList<Integer> lokasi;
    private Scanner in;

    public Data() {
        tanamans = new ArrayList<>();
        lokasi = new ArrayList<>();
        in = new Scanner(System.in);
    }

    public void mulai() {
        System.out.print("Masukkan masa tanam (dalam bulan): ");
        int masaTanamBulan = in.nextInt();
        int masaTanamHari = masaTanamBulan * 30;

        for (int i = 0; i < 3; i++) {
            menanam();
        }

        for (int hari = 1; hari <= masaTanamHari; hari++) {
            ArrayList<Integer> mati = new ArrayList<>();
            for (int j = 0; j < tanamans.size(); j++) {
                Tanaman tanaman = tanamans.get(j);
                if (lokasi.contains(j)) {
                    continue;
                }
                if (tanaman.status().equals("Hidup")) {
                    tanaman.berkembang();
                } else {
                    lokasi.add(j);
                    menanam();
                    mati.add(j);
                }
            }

            if (hari % 90 == 0) {
                for (int i = 0; i < tanamans.size(); i++) {
                    if (!lokasi.contains(i)) {
                        tanamans.get(i).treatment();
                    }
                }
            }
            for (int j : mati) {
                System.out.println("Tanaman " + tanamans.get(j).getClass().getSimpleName() + " telah mati.");
                tanamans.remove(j);
                menanam();
            }
        }

        System.out.println("====================");
        System.out.println("PROSES PERKEMBANGAN");
        System.out.println("====================");
        System.out.println("------HASIL MENANAM------");
        tampilkanPerkembangan();
    }

    public void menanam() {
        System.out.println("Pilih tanaman yang akan ditanam:");
        System.out.println("1. Tomat");
        System.out.println("2. Stroberi");
        System.out.println("3. Persik");
        int pilihan = in.nextInt();

        Tanaman tanamanBaru = null;
        switch (pilihan) {
            case 1:
                tanamanBaru = new Tomat();
                break;
            case 2:
                tanamanBaru = new Stroberi();
                break;
            case 3:
                tanamanBaru = new Persik();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }

        tanamans.add(tanamanBaru);
        System.out.println(tanamanBaru.getClass().getSimpleName() + " berhasil ditanam");
    }

    public void info() {
        for (int i = 0; i < tanamans.size(); i++) {
            Tanaman tanaman = tanamans.get(i);
            System.out.println("\nTanaman buah ke-" + (i + 1) + ": " + tanaman);
        }
    }

    public void tampilkanPerkembangan() {
        for (int i = 0; i < tanamans.size(); i++) {
            Tanaman tanaman = tanamans.get(i);
            System.out.println("\nTanaman buah ke-" + (i + 1));
            System.out.println(tanaman);
        }
    }
}
