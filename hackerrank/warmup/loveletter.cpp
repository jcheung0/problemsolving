#include <iostream> 
#include <string.h> 
using namespace std;


bool isPalindrome(string value){
   int i = 0;
   bool isPalindrome = true;
   for(i; i < value.length()/2; i++){
       if(value.at(i) != value.at(value.length()-i-1)){
        isPalindrome = false;
       }
   }

   printf(isPalindrome ? "true": "false");
   return isPalindrome;
}

int main(){
    char i = 'b';
    string input;
    cin >> input;

    cout << isPalindrome(input);
    return 0;
}
