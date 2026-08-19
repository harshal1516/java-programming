import java.util.*;

public class Breaku{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do { 
            System.out.print("Enter your no ");
            int n = sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);
        } while (true);
    }
}