class Mobile{
    String brand;//instance variable
    int price;
   static  String name; //common for all the objectss and should be called with the same class name //static variable

   public void show()
{
    System.out.println(brand +":" + price+":" + name);
}
public static void show1(Mobile obj){
    System.out.println(obj.brand + " : " + obj.price +" : " + name);
    


}
}



public class StaticM {
    public static void main(String[] args) {
         Mobile obj1 = new Mobile();//creating object of class Mobile
        obj1.brand = "Samsung";//instance variable
        obj1.price= 2000;//instance variable
        Mobile.name = "Galaxy";//static variable

        Mobile obj2 = new Mobile();        
        obj2.brand = "Apple";
        obj2.price = 3000;
        Mobile.name = "iPhone";

        Mobile.name="phone";

        obj1.show();
        obj2.show();    

        Mobile.show1(obj1);

        
    }
}
