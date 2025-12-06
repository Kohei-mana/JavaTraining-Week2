import java.util.ArrayList;

public class Library {

    //本の情報を保持するための可変長配列
    private ArrayList<Book> books;

    //コンストラクタ
    public Library(){
        books = new ArrayList<>();
    }

    //本を追加するメソッド
    public void addBook(Book book){
        books.add(book);
    }

    //登録している本の一覧を表示するメソッド
    public void showBooks(){

        //本が登録されていない場合の処理
        if(books.isEmpty()){
            System.out.println("登録されている書籍はありません。");
            return;
        }

        //本が登録されている場合の処理
            for(int i = 0; i < books.size(); i++){
                System.out.println((i + 1) + ": " + books.get(i));
            }
        }
    
    //削除する本があるかどうかを確認するメソッド
    public boolean isEmpty(){
        return books.isEmpty();
    }

    //本を削除するメソッド
    public void removeBook(int number){
        int index = number -1;
        //存在している番号かの確認
        if(index >= 0 && index < books.size()){
            Book removedBook = books.remove(index);
            System.out.println(removedBook.getTitle() + "を削除しました");
        } else {
            System.out.println("その番号の本はありません");
        
        }
    }

}
