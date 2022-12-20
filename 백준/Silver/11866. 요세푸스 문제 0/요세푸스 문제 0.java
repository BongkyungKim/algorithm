import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 요세푸스 문제 0
public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Queue<Integer> queue = new LinkedList<>();

    StringTokenizer st = new StringTokenizer(br.readLine());

    int cnt = Integer.parseInt(st.nextToken());
    int no = Integer.parseInt(st.nextToken());

    StringBuilder sb = new StringBuilder();


    for (int i = 1; i <= cnt; i++) {
      queue.offer(i); // 1 2 3 4 5 6 7
    }

    while (!queue.isEmpty()) {
      for (int i = 0; i < no-1; i++) { // 0 1 돌면서 queue앞 1, 2를 뒤로 보냄
        queue.offer(queue.poll()); // 1, 2번째는 반환해서 끝에 저장하면서 삭제
      }
      if (queue.size() > 1) {
        sb.append(queue.poll() + ", ");
      } else {
        sb.append(queue.poll());
      }
    }
    System.out.println("<" + sb + ">");
    br.close();
  }
}
