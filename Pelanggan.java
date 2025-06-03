package tubes;

public class Pelanggan {
    String nama;
    private static int counter = 1;
    int idAntrean;

    public Pelanggan(String nama) {
        this.nama = nama;
        this.idAntrean = counter++;
    }

    public String toString() {
        return "ID Antrean: " + idAntrean + ", Nama Pelanggan: " + nama;
    }
}
