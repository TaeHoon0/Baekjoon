import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for (char c : str.toCharArray()) {
            System.out.println(c);
        }
    }
}