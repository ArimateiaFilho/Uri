import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            double a = sc.nextInt();
            double b = sc.nextInt();
            double c = sc.nextInt();

            double semiperimeter = (a + b + c) / 2.0;
            double areaTriangle = Math.sqrt(semiperimeter * (semiperimeter - a) * (semiperimeter - b) * (semiperimeter - c));

            double R = (a * b * c) / (4.0 * areaTriangle);


            double r = areaTriangle/semiperimeter;

            double areaBigestCircle = Math.PI * R * R;
            double areaSmallestCircle = Math.PI * r * r;

            double areaS = areaBigestCircle - areaTriangle;     // Sunflowers
            double areaR = areaSmallestCircle;                 // Roses
            double areaV = areaTriangle - areaSmallestCircle; // Violets

            System.out.printf("%.4f %.4f %.4f%n", areaS,  areaV, areaR);
        }

        sc.close();
    }

}