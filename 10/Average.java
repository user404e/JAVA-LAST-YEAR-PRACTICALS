import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arr[] = new int[10];
        int sum = 0,avg;
        for(int i=0;i<10;i++){
            System.out.print("Enter Number : ");
            arr[i] = scan.nextInt();

            sum = sum + arr[i];
        }
        avg = sum/10;
        System.out.println("AVERAGE = " + avg);
    }
}
