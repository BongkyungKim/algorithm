import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 최대공약수와 최소공배수
public class Main {

  public static void main(String[] args) throws IOException {

    // 24 18 // 6 72
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int noA = Integer.parseInt(st.nextToken());
    int noB = Integer.parseInt(st.nextToken());

    // 최대공약수
    int result = gcd(noA, noB);

    System.out.println(result);
    
    // 최소공배수
    System.out.println(noA * noB / result);
    br.close();
  }
    private static int gcd(int noA, int noB) { // 18 6 

      if (noA % noB == 0) { // 18 6 0
        return noB;
      }

      return gcd(noB, noA % noB); // 18 6
    }
}
