import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// 좌표 정렬하기
public class Main {

  // 3 4    1 -1
  // 1 1    1 1
  // 1 -1   2 2
  // 2 2    3 3
  // 3 3    4 4
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // 점의 개수 N
    int cnt = Integer.parseInt(br.readLine());
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();
    // [0][0] [0][1]
    int[][] intArr = new int[cnt][2];

    for (int i = 0; i < cnt; i++) {
      // 3 4, 1 1 ... 입력을 받는다.
      st = new StringTokenizer(br.readLine());
      intArr[i][0] = Integer.parseInt(st.nextToken()); // 3 , 1 ...
      intArr[i][1] = Integer.parseInt(st.nextToken()); // 4 , 1 ...
    }

    Arrays.sort(intArr, new Comparator<int[]>() {
      @Override
      public int compare(int[] o1, int[] o2) {
        // int[x][y]
        // x좌표 [0], y좌표 [1]
        if (o1[0] == o2[0]) { // x좌표가 같으면
          return o1[1] - o2[1]; // y좌표가 증가하는 순서로 정렬
        } else {
          return o1[0] - o2[0];
        }
      }
    });

    for (int i = 0; i < cnt; i++) {
      sb.append(intArr[i][0]).append(" ").append(intArr[i][1]).append("\n");
    }
    System.out.println(sb);
    br.close();
  }

}
