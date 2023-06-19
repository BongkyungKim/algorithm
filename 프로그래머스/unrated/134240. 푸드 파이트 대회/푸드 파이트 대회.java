class Solution {
    public String solution(int[] food) {
      String answer = "";
      StringBuilder sb = new StringBuilder();
      sb.append("0");
      for (int i = food.length - 1; i >= 1; i--) {
        if (food[i] % 2 == 0) {
          int result = food[i];
          for (int j = 0; j < result; j++) {
            sb.append(i).reverse();
          }
        } else if (food[i] % 2 == 1){
          int modify = food[i];
          food[i] = modify - 1;
          int result = food[i];
          for (int j = 0; j < result; j++) {
            sb.append(i).reverse();
          }
        }
      }
      answer = sb.toString();
      return answer;
    }
}