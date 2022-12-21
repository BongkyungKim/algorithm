import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 이항 계수 1
public class Main {

  // n == N , r == K
  // N! / K!(N-K)!
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());

    System.out.print(f(N) / (f(K) * f(N - K)));

  }

  private static int f(int N) {
    if (N == 0) {
      return 1;
    }
    return N * f(N - 1);
  }
}
