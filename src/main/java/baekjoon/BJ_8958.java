package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_8958 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int no = Integer.parseInt(br.readLine());

    for (int i = 0; i < no; i++) {
      int cnt = 0;
      int total = 0;

      String ox = br.readLine();
      char[] oxCnt = new char[ox.length()];

      for (int j = 0; j < ox.length(); j++) {

        oxCnt[j] = ox.charAt(j);

        if (oxCnt[j] == 'O') {
          cnt++;
        } else {
          cnt = 0;
        }
        total = total + cnt;
      }
      System.out.println(total);
    }
    br.close();
  }
}
