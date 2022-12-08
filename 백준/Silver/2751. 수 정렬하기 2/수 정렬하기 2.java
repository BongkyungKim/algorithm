import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 수 정렬하기 2
public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int cnt = Integer.parseInt(br.readLine());
    List<Integer> list = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < cnt; i++) { // 0 1 2 3 4
      list.add(Integer.parseInt(br.readLine()));
    }
      Collections.sort(list);
    for (Integer no : list) {
      sb.append(no).append("\n");
    }
    System.out.println(sb);
    br.close();
  }
}
