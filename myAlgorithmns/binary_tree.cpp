#include <iostream> 
using namespace std;

struct Node{

	int data;
	Node *left;
	Node *right;

} node;


void printTree(Node *root){

	cout << root->data << endl;

	if(root->left != NULL){
		printTree(root->left);
	}

	if(root->right != NULL){
		printTree(root->right);
	}
}

class btree
{
	public:
		btree();
		~btree();
		void insert(int key);
		Node *search(int key);
		void destroy_tree();
		void print_tree();
	private:
		void insert(int key, Node *leaf);
		Node *search(int key, Node *leaf);
		Node *root;

};

btree::btree(){
	root = NULL;
}

void btree::insert(int key, Node *leaf){
	if(key < leaf->data){
		if(leaf->left != NULL)
			insert(key, leaf->left);
		else{
			leaf->left = new Node;
			leaf->left->data = key;
			leaf->left->left = NULL;
			leaf->left->right = NULL;
		}
	}else if(key >= leaf->data){
		if(leaf->right != NULL)
			insert(key, leaf->right);
		else{
			leaf->right = new Node;
			leaf->right->data = key;
			leaf->right->left = NULL;
			leaf->right->right = NULL;
		}
	}
}

Node *btree::search(int key,Node *leaf){
	if(leaf != NULL){
		if(key==leaf->data){
			return leaf;
		}else if(key < leaf->data){
			return search(key,leaf->left);
		}else{
			return search(key,leaf->right);
		}
	}

}

void btree::insert(int key){
	if(root == NULL){
		root = new Node;
		root->data = key;
		root->left = NULL;
		root->right = NULL;
	}else{
		insert(key,root);
	}
}

void btree::print_tree(){

}

btree::~btree(){

}


int main(){

	btree tree;
	tree.insert(1);
	tree.insert(2);
	tree.insert(3);
}
