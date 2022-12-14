import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

// 숫자 카드 2
public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int card = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    Map map = new HashMap();

    // 6 3 2 10 10 10 -10 -10 7 3
    int[] cardNo = new int[card];
    for (int i = 0; i < card; i++) {
      cardNo[i] = Integer.parseInt(st.nextToken()); // 맵에 저장
      if (map.containsKey(cardNo[i])) { // map에 cardNo가 있으면 value + 1
        int value = (int) map.get(cardNo[i]); // 기존 key의 값을 반환
        map.put(cardNo[i], value + 1);
      } else { // map에 cardNo가 없으면 저장
      map.put(cardNo[i], 1);
      }
    }

    StringBuilder sb = new StringBuilder();
    int cnt = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    int val = 0;
    for (int i = 0; i < cnt; i++) {
      cardNo[i] = Integer.parseInt(st.nextToken());
      if (map.containsKey(cardNo[i])) {
        val = (int) map.get(cardNo[i]);
      } else {
        val = 0;
      }
      sb.append(val).append(" ");
    }
    System.out.println(sb);

  }
}
