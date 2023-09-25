import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LonelyInteger {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int result = 0;
        
        System.out.println("Please input the size of the array: ");
        int range = obj.nextInt();

        List<Integer> arr = new ArrayList<Integer>(range);
        //inputting numbers from users
        System.out.println("Please input the numbers: ");
        for (int i=0; i<range; i++) {
            arr.add(i, obj.nextInt());
        }

        if (arr.size()>1) {
            for (int num:arr) {
                result ^= num;
            }
            System.out.println("Lonely Integer is " + result);
        } else
        System.out.println(arr.get(0));
    }
}
