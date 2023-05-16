import java.lang.Math;

public class MathClass {
    public static void main(String[] args) {
       int num1 = -23,num2 = 8;
       double num3= 4.1;
       System.out.println("ABSOLUTE = " + Math.abs(num1));
       System.out.println("CUBE ROOT OF " + num2 + " = " + Math.cbrt(num2));
       System.out.println(Math.pow(num2,2));
       System.out.println(Math.max(num1,num2));
       System.out.println(Math.min(num1, num2));
       System.out.println(Math.ceil(num3));
       System.out.println(Math.floor(num3));
    }
}
