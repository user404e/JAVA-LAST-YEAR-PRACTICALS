public class CheckPrimeNum {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        boolean flag = true;

        for (int i = 2; i < a; i++){
            if (a % i == 0){
                flag = false;
            }
        }
        if(flag){
            System.out.println("GIVE NUMBER IS PRIME NUMBER");
        }
        else{
            System.out.println("GIVE NUMBER IS NOT PRIME NUMBER");
        }
    }
}
