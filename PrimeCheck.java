import java.util.Scanner;
public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag = true;
        if(num < 2) flag = false;
        for(int i = 2; i <= num / 2; i++) {
            if(num % i == 0) {
                flag = false;
                break;
            }
        }
        if(flag) System.out.println("Prime");
        else System.out.println("Not Prime");
    }
}

