import java.util.Scanner;

public class main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int sayi, toplam = 0;

        System.out.print("Girmek istediğiniz sayı adedini giriniz: ");
        int adet = Scanner.nextInt();

        for (int i = 0; i < adet; i++) {
            System.out.print((i + 1) + ". sayiyi giriniz: ");
            sayi = scanner.nextInt();
            toplam += sayi;

        }
        System.out.println("Sayıların ortalaması = " + ((float) toplam / adet));

    }
}
