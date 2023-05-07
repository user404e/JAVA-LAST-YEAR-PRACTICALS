import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter 1st Number : ");
        double num1 = scan.nextDouble();

        System.out.print("Enter Operator : ");
        String op = scan.next();

        System.out.print("Enter 2nd Number : ");
        double num2 = scan.nextDouble();

        switch(op){
            case "+":
                System.out.println(num1+num2);
                break;
            case "-":
                System.out.println(num1-num2);
                break;
            case "*":
                System.out.println(num1*num2);
                break;
            case "/":
                System.out.println(num1/num2);
                break;
            case "%":
                System.out.println(num1%num2);
                break;
            default:
                System.out.println("INALID INPUT - ");
                break;
        }
    }
}
