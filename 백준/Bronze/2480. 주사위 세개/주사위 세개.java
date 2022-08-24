import java.util.Scanner;

class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = 0;
        int m = 0;
        
        if(a == b && b == c) m = 10000 + a * 1000;
        else if(a == b && b != c) m = 1000 + a * 100;
        else if(a != b && b == c) m = 1000 + b * 100;
        else if(a == c && b != c) m = 1000 + a * 100;
        else {
            if(a > b){
                if(a > c) max = a;
                else max = c;
            } else {
                if(b > c) max = b;
                else max = c;
            }
            m = max * 100;
        }
        
        System.out.println(m);
    }
}