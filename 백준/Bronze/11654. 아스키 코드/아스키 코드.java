import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 아스키 코드
public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int a = br.read();
    System.out.println(a);
  }

}
