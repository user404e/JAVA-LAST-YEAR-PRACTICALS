public class WrapperClass {
    public static void main(String[] args) {
        Integer i1 = new Integer(args[0]);
        Integer i2 = new Integer(args[1]);
        Integer i3 = new Integer(args[2]);

        int max = (i1>i2 && i1>i3)?i1:(i2>i3 && i2>i1)?i2:i3;

        System.out.println("Max = " + max);
    }
}
