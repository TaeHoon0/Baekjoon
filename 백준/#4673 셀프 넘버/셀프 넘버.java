class Main{		
	public static void main(String[] args) throws Exception{
		boolean[] check = new boolean[10001]; // 1 ~ 10000
		
		for(int i = 1; i < 10001; i++) {
			if(d(i) < 10001) {				
				check[d(i)] = true;
			}
		}
		
		for(int i = 1; i < 10001; i++) {
			if(check[i] == false ) System.out.println(i);
		}
    }
 
	public static int d(int n) {
		int sum = n;
		
		while(n != 0) {
			sum = sum + (n % 10);
			n = n / 10;
		}
		
		return sum;
	}
	
}