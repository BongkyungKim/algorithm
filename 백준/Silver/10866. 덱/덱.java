import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

// 덱
public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int cnt = Integer.parseInt(br.readLine());
    Deque<Integer> deque = new LinkedList<>();
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < cnt; i++) {
      st = new StringTokenizer(br.readLine());
      String str = st.nextToken();

      if (str.equals("push_back")) {
        deque.offerLast(Integer.parseInt(st.nextToken()));
      } else if (str.equals("push_front")) {
        deque.offerFirst(Integer.parseInt(st.nextToken()));
      } // push

      if (str.equals("front")) { // deque 가장 앞에 있는 정수를 출력, 비어있으면 -1 출력
        if (deque.isEmpty()) {
          sb.append(-1).append("\n");
        } else {
          sb.append(deque.peekFirst()).append("\n");
        }
      } // front

      if (str.equals("back")) { // deque 가장 뒤에 있는 정수를 출력, 비어있으면 -1 출력
        if (deque.isEmpty()) {
          sb.append(-1).append("\n");
        } else {
          sb.append(deque.peekLast()).append("\n");
        } 
      } // back

      if (str.equals("size")) {
        sb.append(deque.size()).append("\n");
      } // size

      if (str.equals("empty")) { // 비어있으면 1, 아니면 0
        if (deque.isEmpty()) {
          sb.append(1).append("\n");
        } else {
          sb.append(0).append("\n");
        }
      } // empty

      if (str.equals("pop_front")) { // 가장 앞에 수를 출력과 동시에 제거, 비어있으면 -1
        if (deque.isEmpty()) {
          sb.append(-1).append("\n");
        } else {
          sb.append(deque.pollFirst()).append("\n");
        }
      } // pop_front

      if (str.equals("pop_back")) { // 가장 뒤에 수를 출력과 동시에 제거, 비어있으면 -1
        if (deque.isEmpty()) {
          sb.append(-1).append("\n");
        } else {
          sb.append(deque.pollLast()).append("\n");
        }
      } // pop_back
    }
    System.out.println(sb);
    br.close();
  }

}
