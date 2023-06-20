import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int solution(int k, int m, int[] score) {
      int answer = 0;
      int boxCount = score.length / m;
      int[] totalBox = new int[boxCount];
      List<Integer> appleScoreList = new ArrayList<>();
      int add = 0;
      
      for (int appleScore : score) {
        appleScoreList.add(appleScore);
      }
      
      Collections.sort(appleScoreList, Collections.reverseOrder());

      for (int i = m - 1; i < score.length; i += m) {
        if (add < boxCount)
          totalBox[add++] = (int) appleScoreList.get(i);
      }
      
      for (int box : totalBox) {
        answer += box * m;
      }

      return answer;
    }
}