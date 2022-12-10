import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

// 괄호
public class Main {

  // ( ) ( x ) ( xy ) (()) == VPS  ||  (()( , (() != VPS
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int cnt = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < cnt; i++) { // 0 1 2 3 4 5
      sb.append(st(br.readLine())).append("\n");
    }
    System.out.println(sb);
    br.close();
  }

  private static String st(String str) {
    Stack stack = new Stack();

    try {
      for (int j = 0; j < str.length(); j++) {
        char ch = str.charAt(j); // 하나씩 뽑아서

        if (ch == '(') { // '(" 이 들어오면 stack 에 저장
          stack.push(ch);
        } else if (ch == ')') { // ')'이 들어오면 stack 값 꺼내기
          stack.pop();
        } else { // ')' 이 들어오면서 값 꺼내지 못해도 NO
          return "NO";
        }
      }

      if (stack.isEmpty()) { // stack에 값이 비었다면 YES
        return "YES";
      } else { // stack에 값이 남았다면 NO
        return "NO";
      }
    } catch (EmptyStackException e) {
      return "NO";
    }
  }
}
