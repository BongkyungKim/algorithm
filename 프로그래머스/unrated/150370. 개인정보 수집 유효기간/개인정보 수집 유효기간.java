import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
         
            Map<String, String> tMap = new HashMap<>();
            for (String term : terms) {
                
                String[] termsArr = term.split(" "); // [A, 6] [B, 12] [C, 3]
                String termText = termsArr[0];
                String termMonth = termsArr[1];
                tMap.put(termText, termMonth); // [A=6, B=12, C=3]
            }
            
            String[] todayArr = today.split("\\.");

            int year = Integer.parseInt(todayArr[0]);
            int month = Integer.parseInt(todayArr[1]);
            int day = Integer.parseInt(todayArr[2]);

            int currentDay = sumDay(year, month, day);

            List<Integer> deleteList = new ArrayList<>();
            int deleteNum = 1;
            for (String privacy : privacies) {
                String[] privaciesArr = privacy.split(" "); // [2021.05.02, A]
                String priDay = privaciesArr[0];
                String priText = privaciesArr[1];

                String[] priDayArr = priDay.split("\\.");
                int pYear = Integer.parseInt(priDayArr[0]);
                int pMonth = Integer.parseInt(priDayArr[1]);
                int pDay = Integer.parseInt(priDayArr[2]);

                int privaciesDay = sumDay(pYear, pMonth, pDay);

                int termMonth = 28 * Integer.parseInt(tMap.get(priText));

                if (currentDay >= privaciesDay + termMonth) {
                    deleteList.add(deleteNum);
                }
                deleteNum++;
            }

            int[] answer = new int[deleteList.size()];
            
            int j = 0;
            for (int i : deleteList) {
                answer[j] = i;
                j++;
            }
        
            return answer; // 1, 3
    }
    
    private int sumDay(int year, int month, int day) {
        int totalDay = (year * 336) + (month * 28) + day;
        return totalDay;
    }
}