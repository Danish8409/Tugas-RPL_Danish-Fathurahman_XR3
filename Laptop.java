package Bu_Aulia;

public class Laptop {
    String Merk;
    String Warna;
    String Spesifikasi = "RTX 3050" + " Intel Core I5";
    String Type = "Gaming";
    int RAM = 16;
    int Harga = 1000000;

    void tampilSpek() {
        System.out.println("Nama Laptop: " + Merk);
        System.out.println("Type Laptop: " + Type);
        System.out.println("Warna Laptop: " + Warna);
        System.out.println("Spesifikasi Laptop: " + Spesifikasi);
        System.out.println("RAM: " + RAM + "gb");
        System.out.println("Harga Laptop: " + Harga);
    }
}
