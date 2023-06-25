import java.util.Arrays;

class Solution {
    public int solution(int[][] targets) {
      int answer = 0;
      int end = 0;

      Arrays.sort(targets,(o1,o2)->(o1[1]-o2[1]));


      for (int[] target : targets) {
        int target_start = target[0];
        int target_end = target[1];

        if (target_start >= end) {
          end = target_end;
          answer++;
        }
      }

      return answer;
    }
}