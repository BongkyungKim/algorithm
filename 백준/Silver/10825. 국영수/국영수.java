import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// 국영수
public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int cnt = Integer.parseInt(br.readLine());
    String[][] name = new String[cnt][4]; // [이름] [국어] [영어] [수학] * 12
    StringTokenizer st;
    for (int i = 0; i < cnt; i++) {
      st = new StringTokenizer(br.readLine());
      name[i][0] = st.nextToken(); // 이름
      name[i][1] = st.nextToken(); // 국어
      name[i][2] = st.nextToken(); // 영어
      name[i][3] = st.nextToken(); // 수학
    }

    Arrays.sort(name, new Comparator<String[]>(){

      @Override
      public int compare(String[] o1, String[] o2) {
        // 국어
        if (Integer.parseInt(o1[1]) == Integer.parseInt(o2[1])) {
          // 영어
          if (Integer.parseInt(o1[2]) == Integer.parseInt(o2[2])) {
            // 수학
            if (Integer.parseInt(o1[3]) == Integer.parseInt(o2[3])) {
              // 국 == 영 == 수 : 이름으로 오름차
              return o1[0].compareTo(o2[0]);
            }
            // 국어 == 영어, 수학 내림
            return Integer.compare(Integer.parseInt(o2[3]), Integer.parseInt(o1[3]));
          }
          // 국어 == 국어, 영어 오름차순
          return Integer.compare(Integer.parseInt(o1[2]), Integer.parseInt(o2[2]));
        }
        // 국어 내림차순
        return Integer.compare(Integer.parseInt(o2[1]), Integer.parseInt(o1[1]));
      }
    });
    for (int i = 0; i < cnt; i++) {
      System.out.println(name[i][0]);
    }
    br.close();
  }
}
