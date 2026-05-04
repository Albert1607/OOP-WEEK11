class SepedaListrik extends Kendaraan {

    SepedaListrik(String nama, int kapasitas, int kecepatan) {
        super(nama, kapasitas, kecepatan);
    }

    @Override
    void bergerak() {
        System.out.println(nama + " bergerak menggunakan baterai dengan kecepatan " + kecepatan + " km/jam");
    }

    @Override
    void info() {
        System.out.println("Jenis     : Sepeda Listrik");
        System.out.println("Nama      : " + nama);
        System.out.println("Kapasitas : " + kapasitas + " penumpang");
        System.out.println("Kecepatan : " + kecepatan + " km/jam");
    }
}
