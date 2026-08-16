public class Array {
    public static void main(String[] args) {
        int [] numbers = {5, 10, 15, 20, 25 };
        //for even numbers
      for (int i = 0; i < numbers.length; i++) {
        if (numbers[i]%2==0){
        System.out.println(numbers[i]);
      }
    }
    
}
}