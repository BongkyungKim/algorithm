import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// ACM 호텔
public class Main {

  // H (행), W (열), N - 6 12 10 402|| 30 50 72 1203
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int cnt = Integer.parseInt(br.readLine());
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < cnt; i++) {
      st = new StringTokenizer(br.readLine());
      int H = Integer.parseInt(st.nextToken());
      int W = Integer.parseInt(st.nextToken());
      int N = Integer.parseInt(st.nextToken());
      int result = 0;
      int[][] hotel = new int[H][W]; // 6 12 // 30 50
      outer:
      for (int k = 0; k < W; k++) { // 0 1 2 3 4 5 6 7 8 9 10 11
        for (int j = hotel.length - 1; j >= 0; j--) { // 6 - 1 = 5; 5 >= 0
          // [5][0] [4][0] ... [5][1] [4][1] ...
          hotel[j][k] = (H * 100 - j * 100) + (k + 1); // 600 - 500 + 1 // 600 - 400 + 1 ...
          result++;

          if (result == N) { // 10 // 72
            sb.append(hotel[j][k]).append("\n");
            break outer;
          }
        }
      } // outer:로 벗어남
    }
    System.out.println(sb);
    br.close();
  }
}

