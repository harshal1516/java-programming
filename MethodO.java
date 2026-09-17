class A
{
    public void show(){ // method inside a class
        System.out.println("in A  show");
    }

    public void config(){
        System.out.println("in A Config");
    }
}
class B extends A

{
 public void show(){ // this method will overide the first method 
        System.out.println("in B show");
    }
}

public class MethodO{
    public static void main(String[] args) {
        B obj = new B();// created an obj and called it
        obj.show(); 
        obj.config();
        
    }
}