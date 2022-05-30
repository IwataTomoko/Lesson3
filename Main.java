import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

//        映画のタイトルリストを作成
        List<String> movieList = new ArrayList<>();
        movieList.add("名探偵コナン ハロウィンの花嫁");
        movieList.add("シン・ウルトラマン");
        movieList.add("五等分の花嫁");
        movieList.add("バブル");

//        リストの内容を出力
        System.out.println(movieList.size());
        System.out.println(movieList.get(0));
        System.out.println(movieList.get(1));
        System.out.println(movieList.get(2));
        System.out.println(movieList.get(3));
//　　　　　"コナン"が含まれるリストの内容を出力
        for (int i = 0; i < movieList.size(); i++) {
            if (movieList.get(i).contains("コナン")) {
                System.out.println(movieList.get(i));
            }
        }

//     　　劇場版名探偵コナンのマップを作成
        Map<Integer, String> conanmovieMap = new HashMap<>();
        conanmovieMap.put(1, "時計じかけの摩天楼");
        conanmovieMap.put(2, "14番目の標的");
        conanmovieMap.put(3, "世紀末の魔術師");
        conanmovieMap.put(4, "瞳の中の暗殺者");
        conanmovieMap.put(5, "天国へのカウントダウン");
        conanmovieMap.put(6, "ベイカー街の亡霊");
        conanmovieMap.put(7, "迷宮の十字路");

//        マップの内容を出力
        System.out.println(conanmovieMap.get(1));
        System.out.println(conanmovieMap.get(2));
        System.out.println(conanmovieMap.get(3));

//        例外を発生させる
        try {
            for (int i = 1; i < 10; i++) {
                if (i > 7) {
                    throw new NullPointerException();
                }
                System.out.println(conanmovieMap.get(i));
            }
        } catch (NullPointerException e) {
            System.out.println("データがありません");
        }


    }
}
