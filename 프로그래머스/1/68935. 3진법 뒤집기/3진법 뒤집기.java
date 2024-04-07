class Solution {
    public int solution(int n) {
        String threeNum = Integer.toString(n, 3);
        StringBuilder sb = new StringBuilder(threeNum);

        return Integer.parseInt(sb.reverse().toString(), 3);
    }
}