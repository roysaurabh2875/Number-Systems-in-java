import java.util.*;

public class Tohexadecimalanddecimal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the binary number you want to convert to hexa decimal and decimal :");
        String binary = sc.next();

        int decimal = 0;
        
        for(int i = 0 ; i<binary.length();i++){
            char bit = binary.charAt(i);
            decimal = decimal*2+(bit - '0');
        }
        System.out.println("Decimal number is:"+decimal);

        char [] Hexadecimal = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        int remainder = 0;
        String hex = "";

        while(decimal > 0){
            remainder = decimal % 16 ;
            hex = Hexadecimal[remainder] + hex ;
            decimal /= 16 ;
        }
        System.out.println("Hexadecimal number is :"+hex);
    }
}
