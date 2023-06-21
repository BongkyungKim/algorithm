import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int solution(int[] topping) {
      int answer = 0;
      // 형
      Map<Integer, Integer> brother1 = new HashMap<>();
      // 동생
      Set<Integer> brother2 = new HashSet<>();

      for (int toppingIdx : topping) {
        brother1.put(toppingIdx, brother1.getOrDefault(toppingIdx, 0) + 1);
      }

      for (int toppingIdx : topping) {
        brother2.add(toppingIdx);
        brother1.put(toppingIdx, brother1.get(toppingIdx) - 1);

        if (brother1.get(toppingIdx) == 0) {
          brother1.remove(toppingIdx);
        }
          
        if (brother1.size() == brother2.size()) {
          answer++;
        }
      }
        
      return answer; // 2
    }
}