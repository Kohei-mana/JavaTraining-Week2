// Book 書籍1冊を表すクラス。タイトル・著者・出版年などをフィールドに持つ。

public class Book {

    // フィールド(属性）の定義
    private String title;
    private String author;
    private int year;

    // コンストラクタの定義
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // ゲッターの定義
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    // 本の情報を文字列として返す
     @Override
    public String toString() {
        return this.title + " / " + this.author + " / " + this.year + "年";
    }
}
