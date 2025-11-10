import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int f1 = sc.nextInt();
            int f2 = sc.nextInt();
            if(f1<f2) {
                System.out.println(euclides(f1, f2));
            }else{
                System.out.println(euclides(f2,f1));
            }
        }
        sc.close();
    }

    private static int euclides(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}