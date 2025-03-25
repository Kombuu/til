import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String line = sc.nextLine();
        String[] words = line.split(",");
        
        for (String word : words){
            System.out.println(word);
        }
        

    }
}
