#include <stdio.h>



struct Node{
    int data;
    struct Node *node;
};
int main(){
    struct Node *node;
    struct Node *next;
    next->data = 1;
    node->node = next;
    //malloc(sizeof(node));
    printf("%i",next->data);
}
