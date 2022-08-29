import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 1;
        String num = "";
        while(true){
            int n = Integer.parseInt(br.readLine());
           
            if(n == 0) break;
            else if((3*n)%2 == 0) {
                num = "even";
                n = (3 * n) / 2; 
            } else {
                num = "odd";
                n = ((3 * n)+1) / 2;
            }
            n = n / 3;
            System.out.println(cnt + ". " + num + " " + n);
            cnt++;
        }
    }
}