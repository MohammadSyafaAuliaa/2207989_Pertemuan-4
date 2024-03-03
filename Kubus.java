import java.util.Scanner;

public class Kubus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] sisi = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan panjang sisi ke-" + (i + 1) + ":");
            sisi[i] = scanner.nextInt();
        }
        
        // Mengecek apakah semua sisi sama
        boolean semuaSisiSama = true;
        for (int i = 1; i < 3; i++) {
            if (sisi[i] != sisi[0]) {
                semuaSisiSama = false;
                break;
            }
        }

        // Menampilkan hasil
        if (semuaSisiSama) {
            System.out.println("Termasuk Kubus");
        } else {
            System.out.println("Bukan Kubus");
        }

        scanner.close();
    }
}
