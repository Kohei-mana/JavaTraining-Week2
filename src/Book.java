public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    } //書籍情報
    
//ゲッター
public String getTitle(){
    return title;
}
public String getAuthor(){
    return author;
}
public int getYear(){
    return year;
}

@Override
public String toString(){
    return "　タイトル:" + title + "　著者:" + author + "　出版年：" + year;
} //正しく表示させるため

}
