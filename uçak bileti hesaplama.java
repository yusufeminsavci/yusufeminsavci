import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int distance, age, type;

        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi km türünden giriniz : ");
        distance = input.nextInt();

        System.out.println("Yaşınızı giriniz : ");
        age = input.nextInt();

        System.out.println("Yolculuk tipini giriniz : ");
        type = input.nextInt();

        double total = (distance*0.10);
        double discountType = 2*(total - (total*0.20));
        double discountAgeOne = ((total) - (total*0.50));
        double discountAgeTwo = ((total) - (total*0.10));
        double discountAgeThree = ((total) - (total*0.30));
        double discountTypeTwoAgeOne = 2*(total - (total*0.20) - (total*0.50));
        double discountTypeTwoAgeTwo = 2*(total - (total*0.20) - (total*0.10));
        double discountTypeTwoAgeThree = 2*(total - (total*0.20) - (total*0.30));



        if ((distance > 0) && (age > 0)) {
            if ((type > 0) && (type < 3)) {
                switch (type) {
                    case 1:
                        if (age < 12) {
                            System.out.println("Toplam tutar : " + discountAgeOne);

                        }
                        else if ((age >= 12) && (age <= 24)) {
                            System.out.println("Toplam tutar : " + discountAgeTwo);
                        }

                        else if (age > 65) {
                            System.out.println("Toplam tutar : " + discountAgeThree);

                        } else {
                            System.out.println("Toplam tutar : " + total);
                        }

                        break;



                    case 2:
                        if (age < 12) {
                            System.out.println("Toplam tutar : " + discountTypeTwoAgeOne);
                        }

                        else if ((age >= 12) && (age <=24)) {
                            System.out.println("Toplam tutar : " + discountTypeTwoAgeTwo);
                        }

                        else if (age > 65) {
                            System.out.println("Toplam tutar : " + discountTypeTwoAgeThree);
                        } else {
                            System.out.println("Toplam tutar : " + discountType);
                        }

                        break;
                }

            } else {
                System.out.println("Hatalı veri girdiniz. Yolculuk tipi 1 veya 2 olmalı.");

            }

        } else {
            System.out.println("Hatalı veri girdiniz. Tekrar deneyin.");

        }
    }
}


