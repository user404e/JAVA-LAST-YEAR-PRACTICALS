import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1,number2,ans;

        while(true){
            System.out.println("1 - ADDITION");
            System.out.println("2 - SUBTRACTION");
            System.out.println("3 - MULTIPLICATION");
            System.out.println("4 - DIVISION");
            System.out.println("5 - MODULUS");
            System.out.println("0 - EXIT");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.print("\nEnter 1st Number : ");
                    number1 = scanner.nextInt();

                    System.out.print("Enter 2nd Number : ");
                    number2 = scanner.nextInt();

                    ans = number1 + number2;

                    System.out.println(ans);
                    break;
                case 2:
                    System.out.print("\nEnter 1st Number : ");
                    number1 = scanner.nextInt();

                    System.out.print("Enter 2nd Number : ");
                    number2 = scanner.nextInt();

                    ans = number1 - number2;

                    System.out.println(ans);
                    break;
                case 3:
                    System.out.print("\nEnter 1st Number : ");
                    number1 = scanner.nextInt();

                    System.out.print("Enter 2nd Number : ");
                    number2 = scanner.nextInt();

                    ans = number1 * number2;

                    System.out.println(ans);
                    break;
                case 4:
                    System.out.print("\nEnter 1st Number : ");
                    number1 = scanner.nextInt();

                    System.out.print("Enter 2nd Number : ");
                    number2 = scanner.nextInt();

                    ans = number1 / number2;

                    System.out.println(ans);
                    break;
                case 5:
                    System.out.print("\nEnter 1st Number : ");
                    number1 = scanner.nextInt();

                    System.out.print("Enter 2nd Number : ");
                    number2 = scanner.nextInt();

                    ans = number1 % number2;

                    System.out.println(ans);
                    break;
                case 0:
                    System.out.println("\nEXITED - ");
                    break;
                default:
                    System.out.println("\nINVALID INPUT -");
                    break;
            }
            if(choice == 0){
                break;
            }
        }
    }
}