import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long hashmat;
        long enemy;
        while(sc.hasNext()) {
            hashmat = sc.nextLong();
            enemy = sc.nextLong();
            long result = hashmat - enemy;
            if(result < 0){
                System.out.println(-1*result);
            }else{
                System.out.println(result);
            }
        }

        sc.close();
    }
}