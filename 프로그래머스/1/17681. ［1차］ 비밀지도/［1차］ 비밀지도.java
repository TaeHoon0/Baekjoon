class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        String[] binary1 = new String[n];
        String[] binary2 = new String[n];
        
        for(int i = 0; i < n; i++) binary1[i] = Integer.toString(arr1[i], 2);
        for(int i = 0; i < n; i++) binary2[i] = Integer.toString(arr2[i], 2);
        
        for(int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
               
            // ex) 9 = 1001 이므로 앞에 빈 0 채워주기
            if(binary1[i].length() < n) binary1[i] = plusZero(binary1[i], n);
            if(binary2[i].length() < n) binary2[i] = plusZero(binary2[i], n);
            
            System.out.println(binary1[i]);
            
            
            for(int j = 0; j < n; j++) {
                if(binary1[i].charAt(j) == '1' || binary2[i].charAt(j) == '1') sb.append('#');
                else sb.append(' ');
            }

            answer[i] = sb.toString();
        }
        
        return answer;
    }
    
    public String plusZero(String binary, int n) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < n - binary.length(); i++) sb.append("0");
        sb.append(binary);
        
        return sb.toString();
    }
}