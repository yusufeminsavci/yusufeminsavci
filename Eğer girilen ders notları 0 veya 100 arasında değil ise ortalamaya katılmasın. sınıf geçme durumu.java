
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

            if (mat < 0 || mat > 100)
                mat = 0;
            if (fizik < 0 || fizik > 100)
                fizik = 0;
            if (kimya < 0 || kimya > 100)
                kimya = 0;
            if (turkce < 0 || turkce > 100)
                turkce = 0;
            if (muzik < 0 || muzik > 100)
                muzik = 0;

            double avarage = (mat + fizik + turkce + kimya + muzik) / 5;
            if (avarage < 55){
                System.out.println("Sınıfta kaldınız,seneye tekrar görüşmek üzere!");

            }else{
                System.out.println("Tebrikler,sınıfı geçtiniz !");

            }

            System.out.println("Ortalamanız :" + avarage);






        }
    }


