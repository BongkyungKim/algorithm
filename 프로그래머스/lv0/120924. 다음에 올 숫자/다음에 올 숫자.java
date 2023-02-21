class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int a = 0;
        int b = 0;

        if (common[1] - common[0] == common[2] - common[1]) { // 2 - 1 == 3 - 2
            for (int i = 0; i < common.length - 1; i++) { // i < 4: 0 1 2 3 
            b = common[i+1] - common[i]; // 공차 저장
            answer = common[i+1] + b;
            }
        } else {
            for (int i = 0; i < common.length; i ++) {
            // 등비수열
            a = common[1] / common[0]; // 공비 저장
            answer = common[i] * a;
             }
        }
                
        return answer;
    }
}

