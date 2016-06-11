package main
import "fmt"


func isPalindrome(val string) bool{
   
    for i := 0;i < len(val);i++ {
        if val[i] != val[len(val)-i-1]{
            return false;
        }
    }
    return true; 
}

func main(){
    fmt.Printf("%t",isPalindrome("poop"))
}
