import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int cnt = Integer.parseInt(br.readLine());

    int sum = 0;

    for (int i = 0; i < cnt; i++) {
      sum += br.read() - '0';
    }
    System.out.println(sum);
    br.close();
  }
}
