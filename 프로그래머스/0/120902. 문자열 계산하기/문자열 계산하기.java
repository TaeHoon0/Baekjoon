class Solution {
    public int solution(String my_string) {
        int answer = 0;
        boolean flag = true;
        
        String[] arr = my_string.split(" ");
        answer = Integer.parseInt(arr[0]);
        
        for(int i = 1; i < arr.length; i++) {
            if(arr[i].equals("+")) flag = true;
            else if(arr[i].equals("-")) flag = false;
            else {
                if(flag) answer += Integer.parseInt(arr[i]);
                else answer -= Integer.parseInt(arr[i]);
            }
        }
        
        return answer;
    }
}