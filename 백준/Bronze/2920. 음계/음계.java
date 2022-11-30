import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // 12345678
    // 87654321
    // 81726354
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] arr = new int[st.countTokens()];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
      
    int no = 0;
    String result = "";
    for (int i = 0; i < arr.length-1; i++) {
      no = arr[i];
      no = no - arr[i + 1];
      if (no == -1) {
        result = "ascending";
      } else if (no == 1) {
        result = "descending";
      } else {
        result = "mixed";
        break;
      }
    }
    System.out.println(result);
    br.close();
  }
}

