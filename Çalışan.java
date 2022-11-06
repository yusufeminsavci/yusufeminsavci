public class Çalışan {
    dize  adı ;
    çift  ​​maaş ;
    int  çalışma saatleri ;
    int  kiralamaYıl ;

    Çalışan ( String  name , double  maaş , int  worHours , int  kiralamaYıl ) {
        bu . isim = isim ;
        bu . maaş = maaş ;
        bu . kiralamaYıl = kiralamaYıl ;
        bu . workHours = workHours ;
    }
    kamu   çifte  vergi () {


        if ( bu . maaş < 1000 ) {
            dönüş   maaşı ;
        } başka {
            çifte  vergi = maaş * 0.03 ;
            iade   vergisi ;
        }
    }
    genel  int  bonusu () {
        if ( workHours > 40 ) {
            int  bonus =( çalışma Saati - 40 )* 30 ;
            iade   bonusu ;
        }
        0 döndür ;
    }
    genel  çift  zamMaaş () {
        if ( kiralamaYıl <= 0 || kiralamaYıl > 2021 ) {
            Sistem . dışarı . println ( "Geçersiz bir çalışma yılı girdiniz!Tekrar bir çalışma yılı giriniz." );
        } başka {
            int  farkYil = 2021 - kiralamaYıl ;
            çift  ​​zam ;
            if ( farkYil > 0 && farkYil < 10 ) {
                zam = maaş * 0.05 ;
                dönüş   zammı ;
            } else  if ( farkYil > 9 && farkYil < 20 ){
                zam = maaş * 0.1 ;
                dönüş  zammı ;
            } else  if ( farkYil > 19 ){
                zam = maaş * 0.15 ;
                dönüş   zammı ;
            } else  if ( farkYil == 0 ){
                0 döndür ;
            }
        }

        0 döndür ;
    }


    public  String  toString (){

        çift  ​​toplam = maaş - vergi () + ikramiye () + zamMaaş ();
        çift  ​​toplam = maaş + ikramiye () - vergi ();
        Sistem . dışarı . println ( "Adı:" + isim );
        Sistem . dışarı . println ( "Maaşı:" + maaş );
        Sistem . dışarı . println ( "Çalışma Saati : " + Çalışma Saatleri );
        Sistem . dışarı . println ( "Başlangıç ​​Yılı : " + kiralamaYıl );
        Sistem . dışarı . println ( "Vergi : " + vergi ());
        Sistem . dışarı . println ( "Bonus :" + bonus ());
        Sistem . dışarı . println ( "Maaş durumu: " + zamSalary ());
        Sistem . dışarı . println ( "Vergi ve Bonuslar ile maaş : " + tot );
        Sistem . dışarı . println ( "Toplam Maaş:" + toplam );


        null döndür ;
    }
}
}
