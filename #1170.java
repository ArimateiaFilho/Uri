import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0 ; i < n ; i++) {
            float food = sc.nextFloat();
            int days = 0;
            while(food > 1){
                days++;
                food = food/2;
            }
            System.out.println(days+" dias");
        }

        sc.close();
    }
}