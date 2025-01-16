package Bu_Aulia;

public class Laptop {
    String Merk;
    String Warna = "Warna Hitam";
    String Spesifikasi = "RTX 3050" + " Intel I5";
    String Type = "A15";
    int RAM = 16;
    int Harga = 1000000;

    void tampilMerk() {
        System.out.println("Nama Laptop: " + Merk);
    }

    void tampiltype() {
        System.out.println("Type Laptop: " + Type);
    }

    void tampilWarna() {
        System.out.println("Warna Laptop: " + Warna);
    }

    void tampilSpek() {
        System.out.println("Spesifikasi Laptop: " + Spesifikasi);
    }

    void tampilRAM() {
        System.out.println("RAM: " + RAM + "gb");
    }

    void tampilHarga() {
        System.out.println("Harga Laptop: " + Harga);
    }
}