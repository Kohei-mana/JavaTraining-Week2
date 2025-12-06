public class Book {

    //本の情報を保持するフィールド
    private String title;
    private String author;
    private int year;

    //本を作るときに呼び出すコンストラクタ
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    //本のタイトルだけを取り出すメソッド（privateにしており、外部からクラスに対応できないため）
    public String getTitle() {
        return title;
    }

    //本の情報を文字として表示する
    @Override
    public String toString() {
        return title + " / " + author + " / " + year;
    }
}
