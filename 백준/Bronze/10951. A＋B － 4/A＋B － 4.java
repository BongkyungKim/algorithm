import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// A + B - 4
public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringBuilder sb = new StringBuilder();

    StringTokenizer st;

    String storage;


    while ((storage = br.readLine()) != null) {
      st = new StringTokenizer(storage, " ");

      int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
      sb.append(sum);
      sb.append("\n");
    }
    System.out.println(sb);
    br.close();
  }
}
