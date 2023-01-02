import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 덩치
public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int cnt = Integer.parseInt(br.readLine());

    // [55] [185]
    // [58] [183]
    // [88] [186]
    // [60] [175]
    // [46] [155]
    int[][] intArr = new int[cnt][2];
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < cnt; i++) {
      st = new StringTokenizer(br.readLine());
      intArr[i][0] = Integer.parseInt(st.nextToken()); // [0] [0] 키
      intArr[i][1] = Integer.parseInt(st.nextToken()); // [0] [1] 몸무게
    }

      int result = 0;
    for (int i = 0; i < cnt; i++) {
      result = 1;
      for (int j = 0; j < cnt; j++) {
        // 자신 포함 전체 비교 && 조건이므로 다 일치해야 result++
        if (intArr[i][0] < intArr[j][0] && intArr[i][1] < intArr[j][1]) {
          result++;
        }
      }
      sb.append(result).append(" ");
    }
    System.out.print(sb);
    br.close();
  }
}
