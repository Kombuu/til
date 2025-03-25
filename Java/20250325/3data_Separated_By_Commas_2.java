import java.util.*;
import java.util.regex.*;

public class Main {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        //----------------------------------
        // 1. 区切り文字を指定
        sc.useDelimiter(",");
        for (int i = 0; i < 3; i++) {
            String s = sc.next();
            System.out.println(s);
        }
        //----------------------------------

        //----------------------------------
        // 2. split で分割
        // String line = sc.nextLine();
        // String[] words = line.split(",");
        // for (int i = 0; i < 3; i++) {
        //     String s = words[i];
        //     System.out.println(s);
        // }
        //----------------------------------
    }
}
