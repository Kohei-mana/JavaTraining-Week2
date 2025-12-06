import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library(){
        books = new ArrayList<>();
    }

    //本を追加
    public void addBook(Book book){
        books.add(book);  //ArrayList　booksにユーザーが指定した書籍情報を追加
        System.out.println("書籍を追加しました"); 
    }
    //書籍一覧の表示
    public void showBooks(){
        if(books.isEmpty()){
            System.out.println("まだ何も登録されていません"); 
        } //空のとき
        else{
            System.out.println("登録済みの書籍一覧"); 
            for(int i =0; i < books.size(); i++){
                System.out.println((i+1) + "." + books.get(i)); 
            } //全ての書籍情報を表示
        }
    }
    //本を削除
    public void removeBook(int BookNumber){
        if(BookNumber < 1 || BookNumber > books.size()){
            System.out.println("無効な番号です"); 
        } //無効な値が入力されたときの処理
        else{
            Book removed = books.remove(BookNumber-1);
            System.out.println(removed.getTitle() + "を削除しました。"); 
        } //書籍情報の削除
    }
  
}
