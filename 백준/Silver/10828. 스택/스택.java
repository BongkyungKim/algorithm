import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

// 스택
public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st;

    int cnt = Integer.parseInt(br.readLine()); // 14 ...

    Stack<Integer> stack = new Stack<>();

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < cnt; i++) {
      st = new StringTokenizer(br.readLine()); // push 1 / push 2 / top ...
      String str = st.nextToken();

      if (str.equals("push")) { // push 들어오면
        stack.push(Integer.parseInt(st.nextToken())); // nextToken으로 숫자로 변형시켜 stack에 push
      } // push

      if (str.equals("top")) { // stack 가장 위에 있는 정수 출력, 비어있으면 -1을 출력
        if (stack.isEmpty()) { // 비어있으면 -1 출력
          sb.append(-1).append("\n");
        } else {
          sb.append(stack.peek()).append("\n"); // 확인만 하기 때문에 pop으로 꺼내지 않고 peek으로 확인
        }
      } // top

      if (str.equals("size")) { // stack의 size확인
        sb.append(stack.size()).append("\n");
      } // size

      if (str.equals("empty")) { // stack이 비어있으면 1, 아니면 0을 출력
        if (stack.isEmpty()) {
          sb.append(1).append("\n");
        } else {
          sb.append(0).append("\n");
        }
      } // empty

      if (str.equals("pop")) { // stack 가장 위에 있는 정수를 꺼내서 출력, stack에 정수가 없으면 -1을 출력
        if (stack.isEmpty()) {
          sb.append(-1).append("\n");
        } else {
          sb.append(stack.pop()).append("\n");
        }
      }
    }
    System.out.println(sb);
    br.close();
  }
}
