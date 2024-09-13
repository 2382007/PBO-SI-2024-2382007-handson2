import java.util.Scanner;

public class Soal1 {
    // Buatlah sebuah program yang mengambil 2 input number
    // dari user Program tersebut akan print out nilai yang paling besar
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Masukan angka pertama: ");
        int a = scanner.nextInt();

        System.out.println(" Masukan angka kedua: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("Angka terbesar adalah: " + a);
        } else if (b > a) {
            System.out.println(" Angka terbesar adalah: " + b);
        } else {
            System.out.println("Kedua angka yang anda masukan sama besar.");
        }
    }
}
