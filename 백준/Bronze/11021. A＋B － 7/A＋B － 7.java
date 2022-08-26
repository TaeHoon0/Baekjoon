import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++){
            String str = br.readLine();
            int target = str.indexOf(" ");
            int result = Integer.parseInt(str.substring(0, target)) + Integer.parseInt(str.substring(target+1));
            sb.append("Case #" + (i+1) + ": " + result + "\n");
        }
        
        br.close();
        System.out.print(sb);
    }
}