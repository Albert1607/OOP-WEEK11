class MobilOperasional extends Kendaraan {

    MobilOperasional(String nama, int kapasitas, int kecepatan) {
        super(nama, kapasitas, kecepatan);
    }

    @Override
    void bergerak() {
        System.out.println(nama + " digunakan untuk operasional kampus dengan kecepatan " + kecepatan + " km/jam");
    }

    @Override
    void info() {
        System.out.println("Jenis     : Mobil Operasional");
        System.out.println("Nama      : " + nama);
        System.out.println("Kapasitas : " + kapasitas + " penumpang");
        System.out.println("Kecepatan : " + kecepatan + " km/jam");
    }
}
