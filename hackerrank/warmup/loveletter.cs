using System;

public class loveletter{
    
    public static bool isPalindrome(String value){
        bool isPalin = true;
    
        for(int i = 0; i < value.Length/2;i++){
            if(value[i] != value[value.Length-i-1]){
                isPalin = false;
            }
        }

        return isPalin;
    }
    
    public static void Main(){
        String val = Console.ReadLine();
        Console.WriteLine(isPalindrome(val));
    }
}
