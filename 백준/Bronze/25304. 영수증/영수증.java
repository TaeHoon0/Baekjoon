import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int total = sc.nextInt();
        int type = sc.nextInt();
        int price = 0;
        int num = 0;
            
        for(int i = 0; i < type; i++){
            price = sc.nextInt();
            num = sc.nextInt();
            total -= num * price;
        }
        
        if(total == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}
