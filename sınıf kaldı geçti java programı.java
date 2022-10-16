import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();

        System.out.print("Türkçe notunuz : ");
        turkce = input.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();

        System.out.print("Müzik notunuz : ");
        muzik = input.nextInt();

        double avarage = (mat + fizik + turkce + kimya + muzik) / 5;
        if (avarage <= 55){
            System.out.println("Sınıfta kaldınız,seneye tekrar görüşmek üzere!");

        }else{
            System.out.println("Tebrikler,sınıfı geçtiniz !");

        }

        System.out.println("Ortalamanız :" + avarage);






    }
}
