# JavaTraining-Week2

タイトル：図書管理システム
目的：書籍の登録、一覧表示、削除を行う

1. 実行環境と手順
javac src/*.java
文字化けをしたため以下のコマンドを実行した
# 環境変数にエンコードを設定
$env:JAVA_TOOL_OPTIONS="-Dfile.encoding=UTF-8"
# コンソールをUTF-8に切り替え
chcp 65001
# 実行
java -classpath src LibraryApp

2. クラス設計
・Book.java（データクラス）
書籍のデータ（タイトル、著者、出版年）を保持する
特徴：すべてのフィールドはprivateであり、カプセル化されている。

・Library.java（処理クラス）
登録された書籍リスト（ArrayList<Book>）を管理し、リストに対する操作（登録、表示、削除）のロジックを提供する
特徴：データの操作ロジックはここに集中している

・LibraryApp.java（メインクラス）
プログラムの実行を開始、ユーザーからの入力を受け付け、適切なLibraryメソッドに処理を振り分ける（switch文）

3. 工夫点と学んだこと
・文字化けの解決
原因：Windows環境のターミナルとJavaのエンコードの不一致
解決：実行前にchcp 65001や$env:JAVA_TOOL_OPTIONS でエンコードを統一し、環境依存の問題を克服した。

・ユーザーインターフェイス
LibraryApp.javaでdo-whileループとswitch文を組み合わせて、メニュー操作の継続性と、選択肢に応じた処理の振り分けを実装した。