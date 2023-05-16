public class WrapperClass {
    public static void main(String[] args) {
        String s1 = "20";
        Integer i1 = new Integer(s1);
        int i2 = Integer.valueOf(s1);
        System.out.println(i1);
        System.out.println(i2);
        
    }
}
