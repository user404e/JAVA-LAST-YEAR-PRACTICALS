import java.util.Arrays;

public class SortDescending {
    public static void main(String[] args) {
         int[] a1 = {1,2,4,43,4,234,23};

         Arrays.sort(a1);

         int[] a2 = new int[a1.length];
         int length = a1.length-1;

         for(int i=0;i<a1.length;i++){
             a2[i] = a1[length];
             length--;
         }

         for(int i=0;i<a2.length;i++){
            System.out.println(a2[i]);
         }    
    }
}
