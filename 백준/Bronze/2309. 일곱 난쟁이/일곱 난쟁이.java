import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 일곱 난쟁이
// 7 8 10 13 19 20 23
public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] no = new int[9]; // 아홉 난쟁이

    int result = 0;

    int a = 0, b = 0;

    for (int i = 0; i < no.length; i++) {
      no[i] = Integer.parseInt(br.readLine());
      result = result + no[i]; // 키 합
    }
    Arrays.sort(no); // 키 오름차순 정렬

    for (int i = 0; i < no.length; i++) { // 0 ~ 8
      for (int j = i + 1; j < no.length; j++) {
        // i + 1 = i번째 + (i + 1)번째 = 0 + 1, 1 + 2, 2 + 3, 3 + 4, 5 + 6, 7 + 8
        // 브루트포스: 모든 경우의 수
        if (100 == result - no[i] - no[j]) {
          a = no[i];
          b = no[j];
        }
      }
    }

    for (int k = 0; k < no.length; k++) {
      if (no[k] == a || no[k] == b) { // || 이기 때문에 하나만 일치해도 true
        continue; // continue 를 만나면 continue-1로 이동
      }
      System.out.println(no[k]); // 일곱 난쟁이 출력
    } // continue-1 : no[k]에 저장되지 않고 for문 증감식으로 이동
    br.close();
  }
}

