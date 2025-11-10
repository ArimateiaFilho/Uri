import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        BigInteger base = BigInteger.valueOf(2);
        BigInteger divisor = BigInteger.valueOf(12000); 
        
        while (n > 0) {
            n--;
            int x = sc.nextInt();
            BigInteger grains = base.pow(x).subtract(BigInteger.ONE);
            BigInteger kgs = grains.divide(divisor);
            System.out.println(kgs + " kg");
        }
        sc.close();
    }
}