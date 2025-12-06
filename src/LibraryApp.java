import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while(true){
            System.out.println("ー図書管理アプリー");
            System.out.println("1: 書籍登録");
            System.out.println("2: 登録済み書籍一覧を表示");
            System.out.println("3: 書籍削除");
            System.out.println("4: 終了");
            System.out.print("番号を選んでください：");  

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1:  
                    System.out.print("タイトルを入力：");
                    String title = scanner.nextLine();

                    System.out.print("著者を入力：");
                    String author = scanner.nextLine();

                    System.out.print("出版年を入力：");
                    int year = scanner.nextInt();

                    library.addBook(new Book(title, author, year)); //書籍登録
                    break;

                case 2:  
                    library.showBooks(); //書籍一覧を表示
                    break;
                
                case 3:
                    library.showBooks();
                    System.out.println("削除したい書籍の番号を入力：");
                    int removebooknumber = scanner.nextInt();
                    library.removeBook(removebooknumber); //書籍を削除
                    break;
                
                case 4:
                    System.out.println("終了します。");
                    scanner.close();
                    return;

                default:
                    System.out.println("無効な入力です"); 
                    
                    
            }
            




        }

        
    }
    
}
