import java.util.Scanner;

public class BilanganPrima {
    public static void main(String[] args) throws Exception {Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan awal: ");
        int awal = input.nextInt();
        System.out.print("Masukkan bilangan akhir: ");
        int akhir = input.nextInt();
        for (int i = awal; i <= akhir; i++) {
        boolean isPrima = true;
        for (int j = 2; j < i; j++) {
        if (i % j == 0) {
        isPrima = false;
        break;
        }
        }
        if (isPrima) {
        System.out.print(i + " ");
        }
        }
        input.close();
    }
}
