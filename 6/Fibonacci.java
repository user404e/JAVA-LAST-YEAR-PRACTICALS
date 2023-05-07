public class Fibonacci {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int count = 1;
        int num3 = 0;
        int num1=0;
        int num2=1;
        while(count<=num){
            System.out.println(num3);
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            count ++;
        }
    }
}
