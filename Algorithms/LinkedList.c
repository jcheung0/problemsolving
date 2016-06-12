#include <stdlib.h> 

typedef struct node{
    int val;
    struct node *next;
} node_t;

void print_list(node_t *head){
    node_t current = head;
    while(current != null){
        printf("%d\n", current->val);
        current = current->next;
    }
}

int pop(node_t ** head){
    node_t * next_node = NULL;
    if(*head == NULL){
        return -1;
    }
    next_node = (*head)->next;
    retval = (*head)->val;
    free(*head);
    *
}




int main(){
    struct node *root;
    root = (struct node *)malloc(sizeof(struct node));

    root->next = 0;
    root->x = 5;
}
