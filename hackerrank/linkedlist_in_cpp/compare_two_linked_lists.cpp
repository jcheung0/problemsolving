#include <iostream>
#include<cstdio>
#include<cstdlib>
using namespace std;
struct Node
{
	int data;
	Node *next;
};
/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/
int CompareLists(Node *headA, Node* headB)
{
    Node *ptrA = headA;
    Node *ptrB = headB;
    while(ptrA != NULL && ptrB != NULL){
        if(ptrA->data != ptrB->data){
            return 0;
        }else{
            ptrA = ptrA->next;
            ptrB = ptrB->next;
            
            if(ptrA == NULL){
                if(ptrB == NULL){
                    break;
                }else{
                    return 0;
                }
            }
        }
    }
    
    return 1;
}

Node* Insert(Node *head,int x)
{
   Node *temp = new Node();
   temp->data = x;
   temp->next = NULL;
   if(head == NULL) 
   {
       return temp;
   }
   Node *temp1;
   for(temp1 = head;temp1->next!=NULL;temp1= temp1->next);
   temp1->next = temp;return head;
}
int main()
{
	int t;
	cin>>t;
	while(t-- >0)
	{
		Node *A = NULL;
		Node *B = NULL;
		int m;cin>>m;
		while(m--){
			int x; cin>>x;
			A = Insert(A,x);}
		int n; cin>>n;
        while(n--){
			int y;cin>>y;
			B = Insert(B,y);
		}
		cout<<CompareLists(A,B)<<"\n";
	}
}