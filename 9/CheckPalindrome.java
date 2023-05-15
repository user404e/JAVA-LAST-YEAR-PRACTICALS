import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter String : ");
        String s1 = scan.nextLine();

        String s2 = "";

        int length = s1.length()-1;
        int i=0;
        while(length>=0){
            s2 = s2 + s1.charAt(length);
            length--;
        }

        if(s1.equals(s2)){
            System.out.println("PALINDROME");
        }
        else{
            System.out.println("NOT PALINDROME");
        }
    }
}
