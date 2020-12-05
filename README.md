# Library_System
以下の問題を再現


■問題

図書館システムを管理するシステムを作る

■ルール
* データベースは使わない
* CUIで動作し、対話形式で以下の操作ができること

・利用者登録
・利用者の登録抹消
・本の登録（本棚に所蔵）
・本の削除（本棚から抹消）
・本棚にある本を一覧
・本の貸出
・本の返却

■最低限実装するクラスたち（足りないクラス・フィールド・メソッドは任意で追加してよい）
【読み方】
「☆」はクラス名
「-----」の上はフィールド、下はメソッド
「-」で始まるものはプライベート
「+」で始まるものはパブリック

☆利用者
-登録番号

-氏名
-----
+本を借りる

+本を返却する

☆利用者名簿
-----
+利用者を登録する

+利用者を削除する

☆本
-タイトル

-著者
-----

☆本棚
-所蔵一覧
-----
+本を追加する

+本を抹消する

+所蔵本を一覧する

☆貸出・返却機
-----
+本を貸出

+本を返却


■追加

* 利用者クラスは人クラスを継承すること（人クラスは作る）
* 本にジャンルを用意する
　=> 本クラスを継承した「雑誌」「単行本」「文庫本」クラスを作成し一つの本棚に格納できるようにすること
* プログラムを終了させてからもう一度起動しても、その時点で登録していた名簿や本棚のデータは維持されること
　=> シリアライズで賄うこと
* 貸出・返却機をシングルトンで実装する
* 本棚の本の並び替えに対応する

