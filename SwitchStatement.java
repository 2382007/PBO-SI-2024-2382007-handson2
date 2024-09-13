import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nomorHari;
        System.out.println(" Masukan nomor diantara 1 sampai 7 : ");
        nomorHari = scanner.nextInt();
        String namaHari = "";

        switch (nomorHari) {
            case 1:
                namaHari = "minggu";
                break;
            case 2:
                namaHari = "senin";
                break;
            case 3:
                namaHari = "selasa";
                break;
            case 4:
                namaHari = "rabu";
                break;
            case 5:
                namaHari = "kamis";
                break;
            case 6:
                namaHari = "jumat";
                break;
            case 7:
                namaHari = "sabtu";
                break;
            default:
                System.out.println("Masukan nomor diantara 1 sampai 7");
                System.exit(0);
        }

        System.out.println("Nama hari : " + namaHari);

    }
}
