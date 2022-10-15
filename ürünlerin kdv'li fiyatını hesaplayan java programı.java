import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ürünün KDV'siz fiyatını giriniz: ");
        int fiyat = scanner.nextInt();

        double yeni_fiyat = fiyat + (fiyat * 0.18);

        System.out.println("KDV'li fiyat = " + yeni_fiyat);
    }

}
