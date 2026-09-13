
public class Inheritt    {
    public static void main(String[] args) {

        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(10, 20);
        int r2 = obj.sub(20, 10);
        int r3 = obj.multi(10, 20);
        int r4 = obj.div(20, 10);        
        double r5 = obj.power(6, 2);



        System.out.println(r1 + " -- " + r2 + " -- " + r3 + " -- " + r4 + "" + r5 );
 
    }
}
