class StringMethods {
    public static void main(String[] args) {
        String s1 = "Hello World ";
        String s2 = "HELLO";
        String s3 = "Alex,Harry,Brian,Zex";
        String[] names;
        System.out.println("LENGTH = " + s1.length());
        System.out.println(s1.equals(s2));

        names = s3.split(",");
        for(String name:names){
            System.out.print(name + " ");
        }

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.concat(s3));

        System.out.println(s2.toLowerCase());
        System.out.println(s1.toUpperCase());

        System.out.println(s3.substring(5,10));

    }
}
