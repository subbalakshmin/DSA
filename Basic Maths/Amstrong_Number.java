import java.util.Scanner;

public class Amstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dup = n;
        int pow = 0;
        while (n > 0) {
            int ld = n % 10;
            n = n / 10;
            pow = ld * ld * ld + pow;
        }
        if (pow == dup) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}