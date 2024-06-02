class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean capitalizeNext = true;

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                sb.append(c);
                capitalizeNext = true;
            } else {
                if (capitalizeNext && Character.isLetter(c)) {
                    sb.append(Character.toUpperCase(c));
                } else {
                    sb.append(Character.toLowerCase(c));
                }
                capitalizeNext = false;
            }
        }
        
        return sb.toString();
    }
}
