import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// 카드2
public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int cnt = Integer.parseInt(br.readLine());

    Queue q = new LinkedList();

    for (int i = 1; i <= cnt; i++) { // 1 2 3 4 5 6
      q.add(i);
    }

    while (q.size() != 1) {
      q.remove(); // 첫 번째 요소 제거 // X 2 3 4 5 6 -> 이제 2를 뒤로 보내기
    Object poll = q.poll(); // poll()로 첫 번째 요소를 반환과 동시에 제거하면서
    q.offer(poll); // 지정된 객체를 offer()로 끝에 추가 // 3 4 5 6 2
    }
    System.out.println(q.peek());
    br.close();
  }
}
