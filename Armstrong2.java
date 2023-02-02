import java.util.Scanner;

public class Armstrong2 {

    public static void main(String[] args) {
        int a, b, c, r, f, sum = 0, n = 0, i;

        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        a = c;
        b = c;

        while (c > 0) {
            c = c / 10;
            n++;
        }

        while (a > 0) {
            f = 1;
            r = a % 10;
            for (i = 1; i <= n; i++) {
                f = f * r;
            }
            sum = sum + f;
            a = a / 10;
        }
        if (b == sum) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
