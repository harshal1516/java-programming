public class Calculator {
    public static void main(String[]args){
        int a = 10;
        int b = 5;
         int choice= 5;

         switch(choice) {
            case 1 : 
            System.out.println("Addition "+(a+b));
            break;
            case 2 :
                System.out.println("Substraction "+(a-b));
                break;
            case 3 :
                System.out.println("Multiplication "+(a*b));
                break;
            case 4:
                System.out.println("Division "+(a/b));
                break;
                default:
                System.out.println("Invalid choice");
         }
    }
}
