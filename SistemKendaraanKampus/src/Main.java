public class Main {
    public static void main(String[] args) {

        Kendaraan[] daftarKendaraan = new Kendaraan[4];

        daftarKendaraan[0] = new BusKampus("Bus UC", 50, 40);
        daftarKendaraan[1] = new MobilOperasional("Mobil Kampus", 6, 60);
        daftarKendaraan[2] = new SepedaListrik("Sepeda Listrik A", 1, 25);

        daftarKendaraan[3] = new Kendaraan("Scooter Kampus", 1, 30) {
            @Override
            void bergerak() {
                System.out.println(nama + " bergerak sebagai kendaraan sewa kampus");
            }

            @Override
            void info() {
                System.out.println("Jenis     : Kendaraan Tambahan (Anonymous Class)");
                System.out.println("Nama      : " + nama);
                System.out.println("Kapasitas : " + kapasitas + " penumpang");
                System.out.println("Kecepatan : " + kecepatan + " km/jam");
            }
        };

        for (Kendaraan k : daftarKendaraan) {
            k.info();
            k.bergerak();
            System.out.println();
        }
    }
}
