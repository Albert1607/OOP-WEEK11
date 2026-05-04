class BusKampus extends Kendaraan {

    BusKampus(String nama, int kapasitas, int kecepatan) {
        super(nama, kapasitas, kecepatan);
    }

    @Override
    void bergerak() {
        System.out.println(nama + " berjalan mengelilingi kampus dengan kecepatan " + kecepatan + " km/jam");
    }

    @Override
    void info() {
        System.out.println("Jenis     : Bus Kampus");
        System.out.println("Nama      : " + nama);
        System.out.println("Kapasitas : " + kapasitas + " penumpang");
        System.out.println("Kecepatan : " + kecepatan + " km/jam");
    }
}
