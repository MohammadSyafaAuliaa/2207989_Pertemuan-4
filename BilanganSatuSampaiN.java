import java.util.Scanner;

public class BilanganSatuSampaiN{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bilangan;
        
        //Menginput nilai
        System.out.println("Masukan Bilangan Batas : ");
        bilangan = scanner.nextInt();
        
        for (int i =1; i<=bilangan; i ++){
            System.out.print(i + " ");
        }
    }
}