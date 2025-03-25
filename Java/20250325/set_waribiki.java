import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scannner = new Scanner(System.in);
        
        int p =scannner.nextInt();
        int q =scannner.nextInt();

        int sum = p + q;
        
        if(sum >= 1000){
            sum -= 100;
        }

        System.out.println(sum);
    }
}
