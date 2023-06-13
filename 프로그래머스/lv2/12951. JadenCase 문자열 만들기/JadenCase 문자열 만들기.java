class Solution {
    public String solution(String s) {
        String[] sArr = s.toLowerCase().split(" ");
        String answer = "";
        String wordChange = "";

        for (String word : sArr) {
            if (word.equals("")) {
                wordChange += " ";
            } else {
                wordChange += word.substring(0, 1).toUpperCase();
                wordChange += word.substring(1, word.length()) + " ";
            }
        }

        answer = wordChange;
        
        if (s.substring(s.length() - 1).equals(" ")) {
            return answer;
        }
        answer = wordChange.stripTrailing();
        return answer;
    }
}