import java.util.Scanner;

public class Tugas3No19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahToko;
        do {
            System.out.print("Jumlah toko: ");
            jumlahToko = sc.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Jumlah toko minimal 1.");
            }
        } while (jumlahToko < 1);
 
        String ringkasan = "";      
        int totalSemuaBarang = 0;
        int tokoTerbanyak = 1;
        int barangTerbanyak = -1;
 
        for (int t = 1; t <= jumlahToko; t++) {
            int pelanggan;
            do {
                System.out.print("Jumlah pelanggan Toko " + t + ": ");
                pelanggan = sc.nextInt();
                if (pelanggan < 0) {
                    System.out.println("Tidak boleh negatif.");
                }
            } while (pelanggan < 0);
 
            int totalBarangToko = 0;
 
            for (int p = 1; p <= pelanggan; p++) {
                int barang;
                do {
                    System.out.print("  Barang dibeli pelanggan " + p + " (Toko " + t + "): ");
                    barang = sc.nextInt();
                    if (barang < 0) {
                        System.out.println("  Tidak boleh negatif.");
                    }
                } while (barang < 0);
 
                totalBarangToko += barang; 
            }
 
            ringkasan += "Toko " + t + " - pelanggan: " + pelanggan + ", total barang: " + totalBarangToko + "\n";
            totalSemuaBarang += totalBarangToko;
 
            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = t;
            }
        }
 
        System.out.println();
        System.out.print(ringkasan);
        System.out.println("Total barang seluruh toko: " + totalSemuaBarang);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
 
        sc.close();
    }
}