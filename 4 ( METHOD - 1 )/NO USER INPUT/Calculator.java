public class Calculator {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 30;
        String op = "-";

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
