import java.util.*;
public class Computer extends Product {
    Scanner inp = new Scanner(System.in);
    Brand b1 = new Brand();
    ArrayList<Computer> pc = new ArrayList<>();

    public Computer(int id, String name, int price, double discount, int stock, Brand brand, int ram, int storage,
                    double screenSize) {
        super(id, name, price, discount, stock, brand, ram, storage, screenSize);
    }

    public Computer() {
    }

    @Override
    public void menu() {
        System.out.println("\n------Bilgisayar Menüsü------ ");
        System.out.println("1)Bilgisayar Ekle");
        System.out.println("2)Bilgisayarları Listele");
        System.out.println("3)Bilgisayar Sil");
        System.out.println("4)Çıkış");

        switch (inp.nextInt()) {
            case 1:
                addItem();
                break;
            case 2:
                getProduct();
                break;
            case 3:
                deleteItem();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Hatalı giriş");
                break;
        }
    }

    @Override
    public void addItem() {
        System.out.println("\nÜrünün markasını seçin");
        System.out.println();
        System.out.println(" ---Markalar--- ");
        b1.printBrands();
        System.out.print("Marka Id seç : ");
        Brand brand=Brand.getBrand(inp.nextInt());

        System.out.print("Ürün ismini girin :");
        String name = inp.next();
        System.out.print("Fiyatını girin :");
        int price = inp.nextInt();
        System.out.print("İndirim oranı :");
        double discount = inp.nextDouble();
        System.out.print("Stok adedi :");
        int stock = inp.nextInt();
        System.out.print("Ram miktarı :");
        int ram = inp.nextInt();
        System.out.print("Hafızasını girin :");
        int storage = inp.nextInt();
        System.out.print("Ekran boyutunu girin :");
        double screenSize = inp.nextDouble();


        Computer m1 = new Computer(idGenerator(), name, price, discount, stock, brand , ram, storage, screenSize);

        this.pc.add(m1);

        System.out.println("Telefon eklendi !");
        System.out.println("Adı :"+m1.getName()+"\tId :"+m1.getId());

        menu();
    }

    @Override
    public void getProduct() {
        System.out.println("\n|ID------|Ürün Adı-----|Fiyatı-----|Markası-----|Stoğu-----|İndirim Oranı-----|RAM------|Ekran Boyutu-----|Hafızası-----|Renk-----|Batarya");
        for (Computer computer : pc) {
            System.out.println(computer.getId()+"       "+computer.getName()+"        "+computer.getPrice()+"         "+computer.getBrand().getName()+"        "+computer.getStock()+"           "+computer.getDiscount()+"             "+computer.getRam()+"           "+computer.getScreenSize()+"            "+computer.getStorage());
        }

        menu();

    }

    @Override
    public void deleteItem() {
        System.out.print("\nSilmek istenen ürünün id sini gir :");
        int inpId = inp.nextInt();

        for (Computer computer : pc) {
            if(computer.getId()==inpId){
                System.out.println("Ürün başarıyla silindi !");
                System.out.println("Menüye dönmek için 0 a basın !");
                computer.deleteItem();

                break;
            }else{
                System.out.println("\nÜrün bulunamadı !");

            }
        }

        menu();

    }

    private int idGenerator(){
        int id  = (int)(Math.random()*10000);

        for (Computer computer : pc) {
            while(id == computer.getId()){
                id  = (int)(Math.random()*10000);
            }
        }
        return id;
    }
}
