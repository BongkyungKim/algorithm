import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 블랙잭
public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    //  카드 개수 5 // 21합
    // 5 6 7 8 9

    int noA = Integer.parseInt(st.nextToken()); // 5
    int noB = Integer.parseInt(st.nextToken()); // 21
    int[] noC = new int[noA];

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < noC.length; i++) {
      noC[i] = Integer.parseInt(st.nextToken()); // 5 6 7 8 9
    }

    int result = sum(noA, noB, noC); // 5 21 [5 6 7 8 9]
    System.out.println(result);
  }

  private static int sum(int noA, int noB, int[] noC) { // noA = 5, noB = 21,  noC = [5 6 7 8 9]
    int result = 0;

    for (int i = 0; i < noA - 2; i++) { // 5 - 2 = 3장의 카드 선택 조건
      for (int j = i + 1; j < noA - 1; j++) {
        for (int k = j + 1; k < noA; k++) {
          int sum = noC[i] + noC[j] + noC[k];

          if (noB == sum) {
            return sum;
          }

          if (result < sum && sum < noB) {
            result = sum;
          }
        }
      }
    }
    return result;
  }
}



