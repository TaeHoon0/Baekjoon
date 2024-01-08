import java.util.Scanner;

public class Main{
    // 거리가 제곱의 수 1, 4, 9일 때, 1, 121, 12321 식으로 진행됩니다.
    // 즉 최대 이동거리는, 소숫점 버린, 루트 행선간 거리입니다.
    // 이동 횟수는 최대이동 횟수의 max * 2 - 1, max * 2, max * 2 + 1인데
    // max * 2 - 1는 루트 거리 = max
    // max * 2 는  거리 <= max*max + max
    // max * 2 + 1는 그 외입니다.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();	//테스트 케이스

        for(int i=0;i<T;i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int dist = y - x;	//행성간 거리
            int cnt = 0;		//이동 횟수

            int max = (int)Math.sqrt(dist);	//최대 이동 거리

            if(max == Math.sqrt(dist)) {
                System.out.println(max * 2 - 1);
            }
            else if(dist <= max * max + max) {
                System.out.println(max * 2);
            }
            else {
                System.out.println(max * 2 + 1);
            }
        }
    }
}