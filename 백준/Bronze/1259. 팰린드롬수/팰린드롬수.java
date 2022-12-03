import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringBuilder sb = new StringBuilder();

    StringTokenizer st;

    String input;

    String result = "";

    while ((input = br.readLine()) != null) {
      st = new StringTokenizer(input);
      String str = st.nextToken();
      String re = new StringBuilder(str).reverse().toString();

      int noA = Integer.parseInt(str);
      int noB = Integer.parseInt(re);


      if (noA == noB) {
        result = "yes";
      } else {
        result = "no";
      }

      if (noA == 0) {
        break;
      }
      sb.append(result).append("\n");
    }
    System.out.print(sb);
    br.close();
  }
}
