import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int x, int y, int n) {
      int answer = 0;
      Set<Integer> xSet = new HashSet<>(), compare = null;
      xSet.add(x);

      while (!xSet.isEmpty()) {
        if (xSet.contains(y)) {
          System.out.println("answer = " + answer);
          return answer;
        }
       
        compare = new HashSet<>();
        for (int xNum : xSet) {
          int xn = xNum + n;
          int x2 = xNum * 2;
          int x3 = xNum * 3;
          if (xn <= y) {
            compare.add(xn);
          }
          if (x2 <= y) {
            compare.add(x2);
          }
          if (x3 <= y) {
            compare.add(x3);
          }
        }
        
          xSet = compare;
        answer++;
      }
      
        answer = -1; 
      return answer;
    }
}