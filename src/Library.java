import java.util.ArrayList;
// 図書館クラス
public class Library {

    // 書籍リスト
    private ArrayList<Book> books;

    // コンストラクタ
    public Library() {
        this.books = new ArrayList<>();
    }

    // 本を追加
    public void addBook(Book book) {
        books.add(book);
        //ゲッターを使ってタイトル取得
        System.out.println("「" + book.getTitle() + "」を登録しました。");
    }

    // 一覧表示
    public void showBooks() {
        // 登録されている本がない場合の対応
        if (books.isEmpty()) {
            System.out.println("登録されている書籍はありません。");
            return;
        }
        // 登録されている本の表示
        System.out.println("登録されている書籍一覧:");
        //index付きで表示
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ": " + books.get(i));
        }
    }

    // リスト番号で削除
    public void removeBook(int number) {
        
        // インデックスに変換（ユーザへの表示は1始まり、中身は0始まりなので-1する）
        int index = number - 1;

        // 範囲チェック
        if (index < 0 || index >= books.size()) {
            System.out.println("その番号の書籍は存在しません。");
            return;
        }
        // 削除処理
        Book removed = books.remove(index);
        System.out.println("「" + removed.getTitle() + "」を削除しました。");
    }

    // 書籍検索
    // キーワードに部分一致する書籍を表示
    public void searchBook(String keyword) {
    boolean found = false;
    // 全書籍をチェック
    for (int i = 0; i < books.size(); i++) {
        Book book = books.get(i);

        // タイトルに keyword が含まれているか
        if (book.getTitle().contains(keyword)) {
            System.out.println((i + 1) + ": " + book);
            found = true;
        }
    }
    // 一致する書籍がなかった場合の対応
    if (!found) {
        System.out.println("キーワードに一致する書籍はありません。");
    }
}


    public int size() {
        return books.size();
    }

    public boolean isEmpty() {
        return books.isEmpty();
    }
}
