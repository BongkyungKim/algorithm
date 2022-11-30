import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] arr = new int[9];
    int max = 0;
    int idx = 0;
    int cnt = 0;

    for (int i = 0; i < 9; i++) {
      arr[i] = Integer.parseInt(br.readLine());
        cnt++;
      if (arr[i] > max) {
        max = arr[i];
      idx = cnt;
      }
    }
    System.out.println(max);
    System.out.println(idx);
  }
}
