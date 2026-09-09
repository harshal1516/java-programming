class Mobile{
    String brand;//instance variable
    int price;
   static  String name; //common for all the objectss and should be called with the same class name

public void show(){ //inside a method we call it local variable
    System.out.println(brand + ":" + price + " :" + name);

}

}


public class StaticV {
    public static void main(String[] args) {

        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        obj1.price= 2000;
        Mobile.name = "Galaxy";

        Mobile obj2 = new Mobile();        
        obj2.brand = "Apple";
        obj2.price = 3000;
        Mobile.name = "iPhone";


        obj1.show();
        obj2.show();

        
    }
}
