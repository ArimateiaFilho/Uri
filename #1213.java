import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int value = sc.nextInt();
            if (value == 0) break;
            // you can put n combinations of numbers -> 111's , 123's , 34244's ...
            // for this case I'll put number "1" to solve the question
            String pattern = "1";
            System.out.println(countPatternRepeats(pattern, value));
        }

        sc.close();
    }

    static int countPatternRepeats(String pattern, int value) {
        int digits=pattern.length();
        int patternValue = Integer.parseInt(pattern);
        int base = (int) Math.pow(10,digits);

        int remainder = patternValue%value;
        int count = 1;

        while (remainder != 0) {
            remainder = (remainder * base + patternValue) % value;
            count++;
        }

        return count;
    }
}