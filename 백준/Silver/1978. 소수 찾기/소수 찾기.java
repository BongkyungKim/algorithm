import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 소수 찾기
public class Main {

  // 4 입력
  //1 3 5 7 // 소수 3

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] cnt = new int[Integer.parseInt(br.readLine())];
    int result = 0; // 돌면서 소수 적립

    StringTokenizer st = new StringTokenizer(br.readLine()," ");
    for (int i = 0; i < cnt.length; i++) {
      cnt[i] = Integer.parseInt(st.nextToken());

      if (check(cnt[i])) {
        result++;
      }

    }
    System.out.println(result);
    br.close();
    }

  private static boolean check(int no) { // cnt[i] = 1 3 5 7
    if (no < 2) { // 1 소수가 아니므로 미리 차단
      return false;
    }
    for (int i = 2; i < no; i++) { // 소수는 1, 자기자신을 약수로 가지므로 나머지0이 발생하면 false
      if (no % i == 0) {
        return false;
      }
    }
    return true;
  }
}



