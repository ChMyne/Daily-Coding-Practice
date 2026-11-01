import java.util.*;
class Solution {
    public void reverseString(char[] s) {
        StringBuilder rev=new StringBuilder();
        for(int i=s.length-1;i>=0;i--){
            rev.append(s[i]);
        }
         for (int i = 0; i < s.length; i++) {
            s[i] = rev.charAt(i);
        }
    }
public static void main(String[] args) {
 Solution solution = new Solution();
 Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String userInput = scanner.nextLine();
      
        char[] userCharArray = userInput.toCharArray();
        
        solution.reverseString(userCharArray);
        
        System.out.print("Reversed output as string: ");
        System.out.println(new String(userCharArray));
        
        scanner.close();
    }
}
