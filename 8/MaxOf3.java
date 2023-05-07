public class MaxOf3{
    public static void main(int[] args) {
        int num1 = args[0];
        int num2 = args[1];
        int num3 = args[2];

        int max = (num1 > num2 && num1 > num3)?num1:(num2>num1 && num2>num3)?num3:num1;
        System.out.println("MAX = " + max);
    }
}