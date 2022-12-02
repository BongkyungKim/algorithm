import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 직각삼각형
public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    String input;
    StringTokenizer st;
    String result = "";

    while ((input = br.readLine()) != null) {
      st = new StringTokenizer(input, " ");

      int tri1 = (int) Math.pow(Integer.parseInt(st.nextToken()), 2);
      int tri2 = (int) Math.pow(Integer.parseInt(st.nextToken()), 2);
      int tri3 = (int) Math.pow(Integer.parseInt(st.nextToken()), 2);

      if ((tri1 + tri2) == tri3) {
        result = "right";
      } else if (tri1 == (tri2 + tri3)) {
        result = "right";
      } else if ((tri1 + tri3) == tri2) {
        result = "right";
      } else {
        result = "wrong";
      }

      if ((tri1 == 0) && (tri2 == 0) && (tri3 == 0)) {
        break;
      }
      sb.append(result).append("\n");
    }
    System.out.print(sb);
    br.close();
  }
}
