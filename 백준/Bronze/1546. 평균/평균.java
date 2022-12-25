import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 평균
public class Main {

  // 모든 점수 = 점수 / M(점수 중 최댓값) * 100
  // 모든 점수 평균 = (점수 / M(점수 중 최댓값) * 100) / cnt
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int cnt = Integer.parseInt(br.readLine()); // 3

    double result = 0;

    int M = 0;

    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 0; i < cnt; i++) {
      int val = Integer.parseInt(st.nextToken()); // 40 80 60

      if (val > M) {
        M = val;
      }
      result = result + val;
    }
    System.out.println(((result / M) * 100.0) / cnt);
    br.close();
    }
  }
