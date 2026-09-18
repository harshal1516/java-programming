
// fianl - means const in java u cant change the values ie they are fixed

class Calc
{
    public final  void show()//mehtod
    {
        System.out.println("By Harsh");


    }
public void add(int a,int b){
    System.out.println(a+b);

}
}
class AdvCalc extends Calc
{
    // public void show()
    {
    System.out.println("by Divya");
    }

}
public class PolyM {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();//object
        obj.show();
        obj.add(4,5);
        ;
    }
}
