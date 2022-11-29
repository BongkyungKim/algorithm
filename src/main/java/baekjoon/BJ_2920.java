package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2920 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // 12345678
    // 87654321
    // 81726354
//    String[] str = br.readLine().split(" ");
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] arr = new int[st.countTokens()];

    System.out.println("st.countTokens() = " + st.countTokens());

    for (int i = 0; i < arr.length; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
//      no = arr[i]; //  [0] = 1
//      no = no - arr[i + 1]; // 1 - 2 = -1
    }
int no = 0;
    String result = "";
    for (int i = 0; i < arr.length-1; i++) {
      no = arr[i];
      no = no - arr[i + 1];
      if (no == -1) {
//        System.out.println("ascending");
        result = "ascending";
      } else if (no == 1) {
//        System.out.println("descending");
        result = "descending";
      } else {
//        System.out.println("mixed");
        result = "mixed";
        break;
      }
    }
    System.out.println(result);
    br.close();
  }
}

