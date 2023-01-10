import java.util.*;
public class Store {
    Scanner inp = new Scanner(System.in);

    public void run(){
        int secim;
        System.out.println("Patika Store Yönetim Paneli");
        System.out.println("1)Notebook İşlemleri");
        System.out.println("2)Cep Telefonu İşlemleri");
        System.out.println("3)Marka İşlemleri");
        System.out.println("4)Çıkış yap");
        System.out.print("Yapmak istediğiniz işlemi seçin :");
        secim = inp.nextInt();


        switch (secim) {
            case 1:
                Computer c1 = new Computer();
                c1.menu();
                break;
            case 2:
                MobilPhone m1 = new MobilPhone();
                m1.menu();
                break;
            case 3:
                Brand b1 =new Brand();
                b1.menu();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Hatalı Giriş !");
                break;
        }


    }

}
