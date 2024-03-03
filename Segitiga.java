import java.util.Scanner;

public class Segitiga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menginput panjang sisi
        System.out.print("Masukkan panjang sisi a: ");
        int a = scanner.nextInt();

        System.out.print("Masukkan panjang sisi b: ");
        int b = scanner.nextInt();

        System.out.print("Masukkan panjang sisi c: ");
        int c = scanner.nextInt();

        // Memastikan a <= b <= c
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }

        // Menentukan jenis segitiga
        if (a + b > c) {
            if (a * a + b * b == c * c) {
                System.out.println("Segitiga Siku-siku");
            } else if (a * a + b * b < c * c) {
                System.out.println("Segitiga Tumpul");
            } else {
                System.out.println("Segitiga Lancip");
            }
        } else {
            System.out.println("Tidak membentuk segitiga");
        }

        scanner.close();
    }
}
