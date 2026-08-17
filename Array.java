public class Array {
    public static void main(String[] args) {
        int [] numbers = {5, 10, 15, 20, 25 };
        // sum of an array
        int sum = 0;
      for (int i = 0; i < numbers.length; i++) {
       sum = sum + numbers [i];

      }
      System.out.println("Sum of the numbers is "+(sum));
    }
    
}
