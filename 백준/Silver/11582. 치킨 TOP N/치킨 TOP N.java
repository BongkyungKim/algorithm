import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

// 치킨 TOP N
public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 치킨집
    int chicken = Integer.parseInt(br.readLine());
    // 치킨집 점수
    StringTokenizer st = new StringTokenizer(br.readLine());
    // 회원
    int person = Integer.parseInt(br.readLine());
    List<Integer> list = new ArrayList<>(chicken);
    for (int i = 0; i < chicken; i++) {
      list.add(Integer.parseInt(st.nextToken()));
    }
    int index = chicken / person; // 8 / 2 = 4

    List<Integer> result = new ArrayList<>();
    int index2 = index;
    for (int i = 0; i < chicken; i+=index) {
      List<Integer> repo = new ArrayList<>(list.subList(i, index2));
      Collections.sort(repo);
      result.addAll(repo);
      index2 = index2 + index;
    }

    for (int result2 : result) {
      System.out.print(result2 + " ");
    }
    br.close();

  }

}
