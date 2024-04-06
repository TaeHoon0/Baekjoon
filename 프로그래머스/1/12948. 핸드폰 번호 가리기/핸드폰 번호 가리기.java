class Solution {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        String secret = phone_number.substring(0, phone_number.length() - 4);
        String s = phone_number.substring(phone_number.length() - 4, phone_number.length());
        
        secret = secret.replaceAll("[0-9]", "*");
        sb.append(secret);
        sb.append(s); 
        
        return sb.toString();
    }
}

