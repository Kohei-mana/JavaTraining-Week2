
import java.util.Scanner;

// 図書管理アプリケーション
public class LibraryApp {

    private Library library;
    private Scanner scanner;

    // コンストラクタ
    public LibraryApp() {
        // LibraryとScannerの初期化
        this.library = new Library();
        this.scanner = new Scanner(System.in, "UTF-8");
    }

    // メインループ
    public void run() {
        // 無限ループでメニュー表示と選択処理
        while (true) {
            showMenu();
            int choice = readInt("番号を選んでください > ");

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    library.showBooks();
                    break;
                case 3:
                    removeBook();
                    break;
                case 0:
                    System.out.println("終了します。");
                    scanner.close();
                    return;
                //書籍検索
                case 4:
                    searchBook();
                    break;
                default:
                    System.out.println("0〜3の数字を入力してください。");
            }
        }
    }

    // メニュー表示
    private void showMenu() {
        System.out.println();
        System.out.println("図書管理システム");
        System.out.println("1: 書籍を登録する");
        System.out.println("2: 登録済みの書籍を一覧表示する");
        System.out.println("3: 書籍を削除する");
        System.out.println("4: 書籍を検索する");
        System.out.println("0: 終了");
    }

    // 数値入力を安全に行うメソッド
    private int readInt(String message) {
        while (true) {
            System.out.print(message);
            String line = scanner.nextLine();

            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("数字を入力してください。");
            }
        }
    }

    // 書籍登録
    private void addBook() {
        System.out.print("タイトル: ");
        String title = scanner.nextLine();

        System.out.print("著者: ");
        String author = scanner.nextLine();

        int year = readInt("出版年: ");

        // Bookオブジェクトを作成してLibraryに追加
        Book book = new Book(title, author, year);
        library.addBook(book);
    }

    // 書籍削除
    private void removeBook() {
        // 登録されている書籍がない場合の対応
        if (library.isEmpty()) {
            System.out.println("削除できる書籍がありません。");
            return;
        }
        // 登録されている書籍一覧を表示
        library.showBooks();
        // 削除する書籍の番号を入力
        int number = readInt("削除する書籍の番号を入力してください: ");
        library.removeBook(number);
    }

    //書籍検索
    private void searchBook() {
        System.out.print("検索キーワードを入力してください: ");
        String keyword = scanner.nextLine();
        library.searchBook(keyword);
    }
    
    //mainメソッド    
    public static void main(String[] args) {
        //インスタンス化して実行
        LibraryApp app = new LibraryApp();
        app.run();
    }
}
