class Solution {
    int solution(int[][] land) {
      int answer = 0;
      int row = 1;
      int score = 0;

      int[][] repo = new int[land.length][land[0].length];
      for (int i = 0; i < land[0].length; i++) {
        repo[0][i] = land[0][i];
      }

      for (int rows = row; rows < land.length; rows++) {
        for (int j = 0; j < land[0].length; j++) {
          for (int k = 0; k < land[0].length; k++) {
            if (j != k) {
              repo[rows][j] = Math.max(repo[rows][j], repo[rows - 1][k] + land[rows][j]);
            }
          }
        }
      }

      for (int i = 0; i < land[0].length; i++) {
        if (repo[repo.length - 1][i] > score) {
          score = repo[repo.length - 1][i];
          answer = score;
        }
      }

      return answer;
    }
}