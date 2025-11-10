import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            int s = 2 * v * t;
            System.out.println(s);
        }

        sc.close();
    }
}