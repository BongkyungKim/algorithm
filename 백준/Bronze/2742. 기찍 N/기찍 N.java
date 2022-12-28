import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 기찍 N
public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int cnt = Integer.parseInt(br.readLine());
    int no = cnt;
    for (int i = cnt; i > 0; i--) {
      System.out.println(no);
      no--;
    }
    br.close();
  }

}
