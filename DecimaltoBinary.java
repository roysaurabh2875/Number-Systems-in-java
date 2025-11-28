// code to convert the 
import java.util.*;

public class DecimaltoBinary {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the decimal number :");
        double num = sc.nextDouble();

        int intergerPart = (int)num;
        double fractionalpart = num - intergerPart ;
        
        String binaryInt = "";
        while(intergerPart > 0){
            int remainder = intergerPart % 2;
            binaryInt = remainder + binaryInt ;
            intergerPart /= 2;
        }
        String binaryFrac = "";
        int precision = 10 ;

        while (fractionalpart > 0 && precision >0){
            fractionalpart *= 2;
            int bit = (int) fractionalpart ;
            binaryFrac += bit ;
            fractionalpart -= bit ;
            precision-- ;
        }
        String binary = binaryInt + "." + binaryFrac ;
        System.out.println("The binary number is :"+binary);
    }
}
