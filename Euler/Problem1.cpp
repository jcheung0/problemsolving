#include <iostream> 
using namespace std;

int main(){
	cout << "hello world" << endl;
	int sum = 0;
	int i = 1;


	for(i = 1;i< 1000;i++){
		if (i % 3 == 0 or i % 5 == 0){
			sum = sum + i;
		}
	}
	cout << sum << endl;
	
}