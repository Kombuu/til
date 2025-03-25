//Javaのユーティリティパッケージをインポート
//この中にはScannerクラスが含まれている
import java.util.*;

//Maintという名前のクラスを定義。Javaプログラムのエントリーポイント。
public class Main {
//mainメソッド
//プログラムが実行される際に最初に呼び出されるメソッド
    public static void main(String[] args) {
        //Scannerの初期化
        //データを読み込むためのScannerオブジェクトを作成。ユーザからの入力を取得
        Scanner sc = new Scanner(System.in);
        //整数の読み込み
        //sc.nextLine()を使って一行の入力を文字列として読み込み、Nに変換
        int N = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < N; i++) {
            //入力から次の一行を読み込み、その内容をそのままコンソールに出力
            System.out.println(sc.nextLine());
        }
    }
}
