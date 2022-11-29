package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2739 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
      for (int j = 1; j <= 9; j++) {
        System.out.printf("%d * %d = %d%n", N, j, N * j);
      }
      br.close();
  }
}
