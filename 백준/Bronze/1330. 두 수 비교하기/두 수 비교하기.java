import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str = br.readLine().split(" ");

    int noA = Integer.parseInt(str[0]);
    int noB = Integer.parseInt(str[1]);

    if (noA > noB) {
      System.out.println(">");
    } else if (noA < noB) {
      System.out.println("<");
    } else {
      System.out.println("==");
    }
    br.close();
  }
}
