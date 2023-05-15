import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Term : ");
        int term = scan.nextInt();

        double sum = 0;
        double j=1;

        while(j<=term){
            sum = sum + 1/j;
            j++;
        }

        System.out.println(sum);
    }
}
