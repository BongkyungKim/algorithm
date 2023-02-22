class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int a, b, c;
        
        // length : 5, 8, 4
        for (int i = 0; i < number.length - 2; i++) { // 0 1 2 3 4
            a = number[i]; // [0] -2 저장
            
            for (int j = i + 1; j < number.length - 1; j++) { // len(5) 1 2 3 4
                b = number[j]; // [1] 3 저장
                
                for (int k = j + 1; k < number.length; k++) { // len(5) 2 3 4
                    c = number[k]; // [2] 0 저장
                        
                        if ((a + b + c) == 0) {
                            answer++;
                        }
                    
                } // for3 end
            } // for2 end            
        } // for1 end
        
        return answer;
    }
}