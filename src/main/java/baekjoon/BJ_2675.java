package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2675 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int no = Integer.parseInt(br.readLine());

    for (int i = 0; i < no; i++) {

      String[] strArr = br.readLine().split(" ");
      int R = Integer.parseInt(strArr[0]);
      String S = strArr[1];

      for (int j = 0; j < S.length(); j++) { // 0 1 2 / 0 1 2 3
        for (int k = 0; k < R; k++) { // 0 1 2 / 0 1 2 3 4
          System.out.print(S.charAt(j));
        }
      }
      System.out.println();
    }
    br.close();
  }
}

