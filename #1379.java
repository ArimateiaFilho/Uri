import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c;
            if (a == 0 && b == 0){
                break;
            }

            c = 2 * a - b;

            if (c <= a) {
            } else if ((a + b) % 2 == 0) {
                c = (a + b) / 2;
            } else {
                c = 2 * b - a;
            }
            System.out.println(c);
        }

        sc.close();
    }

}