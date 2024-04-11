class Solution {
    public int solution(String s) {
        String[] numbers = {"zero", "one", "two", "three", "four", "five"
                            , "six", "seven", "eight", "nine"};
        int answer = 0;
        for(int i = 0; i < numbers.length; i++) {
            s = s.replace(numbers[i], i + "");
        }
        
        return Integer.parseInt(s);
    }
}