class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        for(int i = 0; i < nums.length - 2; i++) {
            for(int j = i + 1; j < nums.length - 1; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    int n = nums[i] + nums[j] + nums[k];
                    boolean flag = true;
                    
                    for(int l = 3; l < n; l++) {
                        if(n % l == 0) {
                            flag = false;
                            break;
                        }
                    }
                    
                    if(flag) answer++;
                }
            }
        }

        return answer;
    }
}