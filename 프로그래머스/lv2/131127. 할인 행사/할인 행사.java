import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
      int answer = 0;
      int membershipLength = 10;
      Map<String, Integer> wantMap = new HashMap<>();
      Map<String, Integer> discountMap = new HashMap<>();

      for (int i = 0; i <= discount.length - membershipLength; i++) {
        for (int j = 0; j < want.length; j++) {
          wantMap.put(want[j], number[j]); // banana = 3 ...
        }
        for (int j = i; j < i + membershipLength; j++) {
          discountMap.put(discount[j], discountMap.getOrDefault(discount[j], 0) + 1);
        }

        for (String discountKey : discountMap.keySet()) {
          if (wantMap.containsKey(discountKey)) {
            wantMap.put(discountKey, wantMap.get(discountKey) - discountMap.get(discountKey));
            if (wantMap.get(discountKey) <= 0) {
              wantMap.remove(discountKey);
            }
          }
        }
        if (wantMap.isEmpty()) {
          answer++;
        }
        wantMap.clear();
        discountMap.clear();
      }
      
      return answer;
    }
}