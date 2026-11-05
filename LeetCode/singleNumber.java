import java.util.Scanner;

public class Solution {
    public int singleNumber(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            index = index ^ nums[i];
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution sol = new Solution();

        // 1. Get the size of the array
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        int[] nums = new int[size];

        // 2. Populate the array with user inputs
        System.out.println("Enter " + size + " integers (separated by spaces or lines):");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        // 3. Process and display the output
        int result = sol.singleNumber(nums);
        System.out.println("The single number is: " + result);

        // Close the scanner resource
        scanner.close();
    }
}
