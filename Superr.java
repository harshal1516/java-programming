class A //superclass
{
    public A()//constructor
    {
        super();// super means call the  default constructor of a super class 
        System.out.println("in A");
    }
    public A(int n)//parametirized constructor
    {
        super();
        System.out.println("in A int");
    }

}


class B //subclass
extends A
{
    public B()//constructor
    {
        super(5);
        System.out.println("in B");
    }

    public B(int n)//parametirized constructor
    {
        super(n);
        System.out.println("in B int");
    }

}



public class Superr {
    public static void main(String[] args) {
        B obj = new B();//object and it will call the constructor of a both class

    }
    
}
