import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 큐
public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int cnt = Integer.parseInt(br.readLine());

    StringTokenizer st;

    Queue<Integer> queue = new LinkedList<>();

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < cnt; i++) {
      st = new StringTokenizer(br.readLine());
      String str = st.nextToken();

      if (str.equals("push")) {
        queue.offer(Integer.parseInt(st.nextToken()));
      } // push

      if (str.equals("front")) { // queue 가장 앞에 있는 정수를 출력
        if (queue.isEmpty()) { // queue가 비어있다면 -1을 출력
          sb.append(-1).append("\n");
        } else {
          sb.append(queue.peek()).append("\n"); // peek으로 삭제없이 요소만 읽기
        }
      } // front

      if (str.equals("back")) {
        if (queue.isEmpty()) { // queue가 비어있다면 -1을 출력
          sb.append(-1).append("\n");
        } else {
          sb.append(((LinkedList<Integer>) queue).peekLast()).append("\n");
        }
      } // back

      if (str.equals("size")) {
        sb.append(queue.size()).append("\n");
      } // size

      if (str.equals("empty")) { // queue가 비어있으면 1 , 아니면 0
        if (queue.isEmpty()) {
          sb.append(1).append("\n");
        } else {
          sb.append(0).append("\n");
        }
      } // empty

      if (str.equals("pop")) { // queue에서 가장 앞에 있는 정수를 빼고, 정수가 없으면 -1을 출력
        if (queue.isEmpty()) {
          sb.append(-1).append("\n");
        } else {
          sb.append(queue.poll()).append("\n");
        }
      } // pop

    }
    System.out.println(sb);
    br.close();
  }

}
