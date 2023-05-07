import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int num = scan.nextInt();

        int rem=0,sum=0;
        int n=0;
        while( num > 0 ){
            rem = num % 10;
            num = num/10;
            n = (rem*10) + n;
            sum = sum + rem;
        }
        System.out.println("SUM OF DIGITS OF GIVEN NUMBER : " + sum);
    }   
}
