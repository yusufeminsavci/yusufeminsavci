import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i=1000,toplam=0,q=3;
        System.out.print("Kullanıcı adı giriniz: ");
        String t=scanner.nextLine();
        System.out.print("Şifre giriniz: ");
        String k=scanner.nextLine();

        if(t.equals("muhammed") && k.equals("12345")) {
            System.out.print("Türkiye bankasına hoşgeldiniz.\nYapmak istediğiniz işlem seçiniz\n");
            System.out.println("Para yatırma için 1, " +
                    "\nPara çekmek için 2,\nBakiye sorgulama için 3,\nÇıkış için 4 basınız.");

            int a =scanner.nextInt();
            switch (a){
                case 1:
                    System.out.println("Para miktarı: ");
                    int b=scanner.nextInt();
                    i+=b;
                    System.out.print("Bakiyeniz "+i);break;
                case 2:
                    System.out.println("Çekme istediğiniz tutar: ");
                    int h=scanner.nextInt();
                    if(h>i){
                        System.out.println("Yetersiz bakiye");
                        break;}
                    else {
                        i -= h;
                        System.out.println("Bakiyeniz: " + i);
                    }break;

                case 3:
                    System.out.println("Mevcut Bakiyeniz: "+i);break;
                case 4:
                    System.out.println("İyi günler. Yine bekleriz...");break;
            }

        }
        else {
            q--;
            System.out.println("Hatalı kullanıcı veya şifre girdiniz tekrar deneyiniz.");
            if(q==0)
                System.out.println("Hesabınız bloke oldu. Bankayla iletişime geçiniz.");
        }
    }
}
