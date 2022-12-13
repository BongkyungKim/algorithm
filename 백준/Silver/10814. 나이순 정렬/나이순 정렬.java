import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// 나이순 정렬
public class Main {

  // [21] [Junkyu] ---> [20] [Sunyoung]
  // [21] [Dohyun] ---> [21] [Junkyu]
  // [20] [Sunyoung] ---> [21] [Dohyun]
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int cnt = Integer.parseInt(br.readLine());
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();
    String[][] strArr = new String[cnt][2];

    for (int i = 0; i < cnt; i++) { // 0 1 2
      st = new StringTokenizer(br.readLine());
      strArr[i][0] = st.nextToken(); // 0 + i(0) - 0 + i(1) - 0 + i(2)
      strArr[i][1] = st.nextToken(); // 0 + i(0) - 0 + i(1) - 0 + i(2)
    }

    Arrays.sort(strArr, new Comparator<String[]>() {
      @Override
      public int compare(String[] o1, String[] o2) {
        return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]); // 나이
//        return Integer.parseInt(o1[1]) - Integer.parseInt(o2[1]); // 이름
      }
    });

    for (int i = 0; i < cnt; i++) {
      sb.append(strArr[i][0]).append(" ").append(strArr[i][1]).append("\n");
    }
    System.out.println(sb);
    br.close();
  }
}

