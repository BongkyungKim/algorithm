import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 한수
// an = a1 + (n - 1)d
// a1 : 첫번째 항
// n : n번째 항
// d : 공차
// abc (135)
// a - b == b - c
public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int no = Integer.parseInt(br.readLine());

    System.out.println(result(no));
    br.close();
  }

  static int a, b, c;
  static int count = 99;
  private static int result(int no) {
    if (no < 100) { // 1~99 들어오면 그 수 그대로 리턴
      return no;
    }

    for (int i = 100; i <= no; i++) {

      a = i / 100; // 첫번째 자리
      b = (i / 10) % 10; // 두번째 라리
      c = i % 10; // 세번째 자리

      if ((a - b) == (b - c)) {
        count++;
      }
    }
    return count;
  }
}