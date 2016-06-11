import java.lang.Character;
import java.util.Scanner;
public class loveletter{
    public static void main(String args[]){
        char i = 'c';
        System.out.println(((char)(i-1)));
        Scanner input = new Scanner(System.in);
        String value = input.nextLine();
        System.out.println(isPalindrome(value));
    }


    public static boolean isPalindrome(String value){
        boolean isPalindrome = true;
        for(int i = 0; i < value.length()/2; i++){
           char first = value.charAt(i);
           char second = value.charAt(value.length()-i-1);
           if(first != second){
            isPalindrome = false;
           }
        }

        return isPalindrome;
    }
}
