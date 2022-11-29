package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2438 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int no = Integer.parseInt(br.readLine());

    for (int i = 0; i < no; i++) {
      for (int j = 0; j < i+1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    br.close();
  }
}
