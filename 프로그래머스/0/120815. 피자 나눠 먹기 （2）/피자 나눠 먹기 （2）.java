class Solution {
    public int solution(int n) {
        int pizza = 0;
        
        do{
            pizza += 1;
        } while ((6 * pizza) % n != 0);
        
        return pizza;
    }
}