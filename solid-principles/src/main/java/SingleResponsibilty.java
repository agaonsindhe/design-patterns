import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SingleResponsibilty {

    public static final int THRESHOLD = 5;

    public static void main(String[] args) {

        System.out.println("Welcome to the Application!");

        List<Integer> nums = getInput();

        sort(nums);
        print(nums);
    }

    private static void print(List<Integer> nums) {
        for(int num : nums)
            System.out.print(num+" ");
    }

    public static List<Integer> sort(List<Integer> nums){
        Collections.sort(nums);
        return nums;
    }


    public static List<Integer> getInput(){
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = new ArrayList<Integer>();

        System.out.println("Enter 5 valid integers in the range [0, 10]");

        while(nums.size() < THRESHOLD) {

            String s = scanner.nextLine();

            if(!isValid(s)){
                continue;
            }

            Integer num = Integer.parseInt(s) ;

            if (num == null) continue;

            nums.add(num);
        }

        scanner.close();

        return nums;
    }

    private static boolean isValid(String s) {

        try {
            Integer.parseInt(s);
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid! Try again!");
            return false;
        }

        int num = Integer.parseInt(s);

        if(num<0 || num > 10) {
            System.out.println("Invalid range! Try again!");
            return false;
        }
        return true;
    }

}
