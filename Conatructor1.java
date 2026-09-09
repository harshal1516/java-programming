class A
{
    public A()
    {
        System.out.println("object created");//constructor will be called automatically when object is created
    }
    public void show()
    {
        System.out.println("in A show");
    }

}




public class Conatructor1 {
    public static void main(String[] args) {
        // A obj = new A();//creating object of class A and constructor will be called automatically
        // obj.show();//calling method show of class A

        new A().show();//new anonymous object of class A is created and constructor will be called automatically
// cant be reused also this is called anonymous object because we are not storing the object in any reference variable
    }
}

   