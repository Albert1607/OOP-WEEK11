abstract class Kendaraan {
    String nama;
    int kapasitas;
    int kecepatan;

    Kendaraan(String nama, int kapasitas, int kecepatan) {
        this.nama = nama;
        this.kapasitas = kapasitas;
        this.kecepatan = kecepatan;
    }

    abstract void bergerak();
    abstract void info();
}
