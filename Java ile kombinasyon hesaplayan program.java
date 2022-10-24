import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int n, r, com;
        int facn = 1, facr = 1, facnr = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen kombinasyonu alınacak sayıyı giriniz: "); //n
        n = input.nextInt();
        System.out.print("Lütfen kaçlı kombinasyonunu almak istiyorsanız sayıyı giriniz: "); //r
        r = input.nextInt();

        //İlk önce kombinasyonu n sayısının faktöriyelini hesapladık.
        for (int i = 1; i <= n; i++){
            facn *= i;
        }

        //Daha sonrasında r sayısının faktöriyelini hesapladık.
        for (int i = 1; i <= r; i++){
            facr *= i;
        }

        //En son (n-r)'nin faktöriyelini hesapladık.
        for (int i = 1; i <= (n-r); i++){
            facnr *= i;
        }

        com = facn/(facr*facnr); // C(n,r) = n! / (r! * (n-r)!)

        System.out.print("Kombinasyon: " + com);
    }
}
