import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 별 찍기 - 2
public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int cnt = Integer.parseInt(br.readLine());

    for (int i = 0; i < cnt; i++) {
      for (int j = 0; j < cnt - i - 1; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < i + 1; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
    br.close();
  }
}
