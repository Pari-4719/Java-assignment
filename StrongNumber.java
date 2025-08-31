import java.util.Scanner;
public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num, sum = 0;
        while(temp != 0) {
            int d = temp % 10;
            int fact = 1;
            for(int i = 1; i <= d; i++) {
                fact *= i;
            }
            sum += fact;
            temp /= 10;
        }
        if(sum == num) System.out.println("Strong");
        else System.out.println("Not Strong");
    }
}

