import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// 단어 정렬
public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int cnt = Integer.parseInt(br.readLine()); // 13 입력

    String[] str = new String[cnt];
    List<String> list = new ArrayList<>();
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < cnt; i++) {
      str[i] = br.readLine();
    }

    Arrays.sort(str, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분없이 정렬
      Arrays.sort(str, new Comparator<String>() { // 문자열 길이 정렬
        @Override
        public int compare(String o1, String o2) {
          return o1.length() - o2.length();
        }
      });

      for (String result : str) { // 향상된 for문으로 문자열 넣으면서
      if (!list.contains(result)) { // list에 result값이 있나~~? 없으면 추가
        list.add(result);
      }
    }

    for (int i = 0; i < list.size(); i++) {
      sb.append(list.get(i)).append("\n");
    }
    System.out.print(sb);
    br.close();
  }
}
