

//I know there is another way easier than this way that I did, but I did it by me to exercise my logic


import java.util.Scanner;

public class Main {

    static String baseHex = "abcdef";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0 ; i < n ; i++) {
            String value = sc.next();
            String type = sc.next();

            System.out.println("Case "+(i+1)+":");
            if(type.equals("dec")){
                System.out.println(toHex(Integer.valueOf(value))+" hex");
                System.out.println(toBin(Integer.valueOf(value))+" bin\n");
            }else if(type.equals("bin")){
                int dec = toDec(value, type);
                System.out.println(dec + " dec");
                System.out.println(toHex(dec) + " hex\n");
            }else{
                int dec = toDec(value, type);
                System.out.println(dec + " dec");
                System.out.println(toBin(dec) + " bin\n");
            }
        }

        sc.close();
    }

    //always receive a decimal
    static String toBin(int value){
        String result = "";
        while(value > 0){
            result = value%2 + result;
            value = value/2;
        }
        return result;
    }

    //always receive a decimal
    static String toHex(int value){
        String result = "";
        while(value > 0){
            int hexNumberInDec = value%16;
            if (hexNumberInDec-9 > 0) {
                result = baseHex.charAt(hexNumberInDec-10) + result;
            }else {
                result = value%16 + result;
            }
            value = value/16;
        }
        return result;
    }

    static int toDec(String value, String type){
        int result = 0;
        int pow = 0;
        if(type.equals("hex")){
            for(int i = value.length()-1; i >= 0;i--){
                String numberString = String.valueOf(value.charAt(i));
                int number;
                int j;
                for (j = 0; j < baseHex.length(); j++) {
                    if(numberString.equals(String.valueOf(baseHex.charAt(j)))){
                        break;
                    }
                }
                if(j<6){
                    number = 10 + j;
                }else{
                    number = Integer.parseInt(String.valueOf(value.charAt(i)));
                }
                result+= number * Math.pow(16,pow);
                pow++;
            }
        }else{
            for(int i = value.length()-1; i >= 0;i--){
                int number = Integer.parseInt(String.valueOf(value.charAt(i)));
                result+= number * Math.pow(2,pow);
                pow++;
            }
        }
        return result;
    }
}