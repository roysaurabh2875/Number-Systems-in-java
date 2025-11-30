// convert the decimal to binary and hexa decimal 
import java.util.*;

public class TobinaryandHexadecimal {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number you want to convert to binary and hexa decimal:");
        int number = sc.nextInt();
        
        int remainder = 0;
        String binary="";

        int temp = number ;

        while(number > 0){
          remainder = number % 2;
          binary = remainder + binary ;
          number/=2;
        }
        char[] hex = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        String Hexadecimal ="";

        while(temp > 0){
            remainder=temp % 16 ;
            Hexadecimal = hex[remainder] + Hexadecimal  ;
            temp/=16;
        }

        System.out.println("Decimal number to binary is :"+binary);
        System.out.println("Decimal to HexaDecimal is :" + Hexadecimal);
        sc.close();
    }
}