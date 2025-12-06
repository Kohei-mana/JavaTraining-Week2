import java.util.Scanner;

public class LibraryApp{
    public static void main(String[] args) {
    
        //本を管理するためのクラス
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);


        //無限ループでメニューを表示する
        while (true){
        System.out.println("図書管理システム");
        System.out.println("1: 書籍を登録する");
        System.out.println("2: 書籍一覧を表示する");
        System.out.println("3: 書籍を削除する");
        System.out.println("0: 終了");

        System.out.print("番号を入力してください: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice){
            //１（書籍を登録する）が選択された場合
            case 1:
                System.out.print("本のタイトルを入力してください");
                String title = scanner.nextLine();

                System.out.print("本の著者名を入力してください");
                String author = scanner.nextLine();

                System.out.print("本の出版年を入力してください");
                int year = scanner.nextInt();
                scanner.nextLine();
                
                library.addBook(new Book(title, author, year));
                System.out.println("本を登録しました");
                break;
            
            //２（書籍一覧を表示する）が選択された場合
            case 2:
                library.showBooks();
                break;

            //３（書籍を削除する）が選択された場合
            case 3:
                //本が登録されていない場合
                if (library.isEmpty()){
                    System.out.println("登録されている本はありません");
                    break;
                }
            
                //本の一覧を表示する
                library.showBooks();

                System.out.print("削除する本の番号を入力してください");
                int number = scanner.nextInt();
                scanner.nextLine();//改行を消す
                library.removeBook(number);
                break;

            //０（終了）が選択された場合
            case 0:
                System.out.println("終了します");
                return;

            //無効な番号が選択された場合
            default:
                System.out.println("無効な番号です");
        }

        }
    }

}
