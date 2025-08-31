import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num, rev = 0;
        while(temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        if(num == rev) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}
