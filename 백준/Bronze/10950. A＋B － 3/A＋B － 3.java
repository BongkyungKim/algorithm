import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// A + B - 3
public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int no = Integer.parseInt(br.readLine());

    StringTokenizer st;
    StringBuffer sb = new StringBuffer();

    for (int i = 0; i < no; i++) {
      st = new StringTokenizer(br.readLine());
      sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
      sb.append("\n");
    }
    System.out.println(sb);
    br.close();
  }
}
