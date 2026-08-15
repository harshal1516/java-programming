public class Operators {
    
    public static void main(String[]args) {
         
        int a = 20;

        int b = 6;

        boolean isGreater = a > b;
        boolean isEqual = a==b;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Remainder: " + (a % b));
        System.out.println("Is " + a + " greater than " + b + " ? " + isGreater);
        System.out.println("Are " + a + " equal to " + b + " ? " + isEqual);

        
    }
}
