import java.util.*;

public class Tobinaryanddecimal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the hexadecimal number :");
        String hex = sc.nextLine().toUpperCase();

        int decimal  = 0;
        for (int i = 0 ; i<hex.length();i++){
            char ch = hex.charAt(i);
            int value ;

            if(ch >= '0' && ch <= '9'){
                value = ch - '0';
            } else if(ch >= 'A' && ch <= 'F'){
                value = ch - 'A' + 10;
            }else {
                System.out.println("Enter valid input!!");
                return ;
            }
            decimal = decimal * 16 + value ;
        }
        System.out.println("Decimal number is :"+decimal);

        String binary="";
        int remainder = 0;
        
        while(decimal > 0){
            remainder = decimal % 2;
            binary = remainder + binary ;
            decimal /= 2 ;
        }
        System.out.println("binary number is :"+binary);
        sc.close();
    }
}
