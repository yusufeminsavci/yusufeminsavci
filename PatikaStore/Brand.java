import java.util.*;
public class Brand {
    Scanner inp = new Scanner(System.in);
    static TreeSet<Brand> brandList = new TreeSet<>(
            new Comparator<Brand>() {
                @Override
                public int compare(Brand n1, Brand n2){

                    return 1;
                }
            }
    );
    private String name;
    private int id;

    static{
        createBrands();
    }

    public Brand(int id,String name){
        this.id = id ;
        this.name = name ;

    }

    public Brand(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public static void createBrands(){
        brandList.add(new Brand(1,"Samsung"));
        brandList.add(new Brand(2,"Lenovo"));
        brandList.add(new Brand(3,"Apple"));
        brandList.add(new Brand(4,"Huawei"));
        brandList.add(new Brand(5,"Casper"));
        brandList.add(new Brand(6,"Asus"));
        brandList.add(new Brand(7,"HP"));
        brandList.add(new Brand(8,"Xiaomi"));
        brandList.add(new Brand(9,"Monster"));
    }


    public void printBrands(){
        for (Brand brand : brandList) {
            System.out.println(brand.name + " - " + brand.id);
        }
        menu();
    }

    public static Brand getBrand(int id){
        for(Brand b:brandList){
            if(id==b.getId()){
                return b;
            }
        }
        return null;
    }

    public void menu(){
        System.out.println("\n------Marka Menüsü------ ");
        System.out.println("1)Markaları listele");
        System.out.println("2)Marka ekle");
        System.out.println("3)Çıkış");


        switch (inp.nextInt()) {
            case 1:
                printBrands();
                break;
            case 2:
                System.out.print("Eklemek istediğiniz markanın adını giriniz :");
                String name = inp.next();
                addBrand(name);
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Hatalı giriş !");
                break;
        }
    }


    public void addBrand(String name){
        int newID = brandList.size()+1;
        brandList.add(new Brand(newID, name));
        System.out.println("Eklenen marka :"+name+"\tid :"+newID);
        menu();
    }
}
