package Bu_Aulia;

import java.util.Scanner;

public class ObjekLaptop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Laptop L = new Laptop();
        System.out.println("Masukkan merk laptop untuk melihat spesifikasi");
        L.Merk = input.nextLine();
        System.out.println("Untuk varian warna?");
        L.Warna = input.nextLine();
        System.out.println("======== Rincian Spesifikasi ========");
        L.tampilSpek();

    }
}
