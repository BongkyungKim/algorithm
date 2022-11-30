import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 최소, 최대
public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] cnt = new int[Integer.parseInt(br.readLine())];

    StringTokenizer st = new StringTokenizer(br.readLine());

    int max = 0;
    int min = 0;

    for (int i = 0; i < cnt.length; i++) {
      cnt[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(cnt);

    min = cnt[0];
    max = cnt[cnt.length - 1];

    System.out.print(min + " " + max);
    br.close();
  }
}