import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //対戦回数入力
        int N = sc.nextInt();
        //自分のレベル入力
        int L = sc.nextInt();
        
        for (int i = 0; i < N; i++){
            //対戦相手のレベル入力
            int x_N = sc.nextInt();

          //戦闘結果計算
            if( L > x_N ){
                L += x_N / 2;
                x_N /= 2;
            }else if( L < x_N ){
                x_N += L / 2;
                L /= 2;
            }
        }
        //戦闘後の自分のレベル出力
        System.out.println(L);
    }
}
