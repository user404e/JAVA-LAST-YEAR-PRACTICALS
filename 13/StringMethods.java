class StringMethods {
    public static void main(String[] args) {
        String s1 = "Hello World ";
        String s2 = "HELLO";
        String s3 = "Alex,Harry,Brian,Zex";
        String[] names;
        System.out.println("LENGTH = " + s1.length()); // length method
        System.out.println(s1.equals(s2)); // equals method

        names = s3.split(","); // split method
        for(String name:names){
            System.out.print(name + " ");
        }

        System.out.println(s1.compareTo(s2)); // comapreTo method
        System.out.println(s1.concat(s3)); // concat method

        System.out.println(s2.toLowerCase()); // tolowerCase method
        System.out.println(s1.toUpperCase()); // toUpperCase method

        System.out.println(s3.substring(5,10)); // substring method

    }
}
