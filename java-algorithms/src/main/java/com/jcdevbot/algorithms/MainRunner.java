package com.jcdevbot.algorithms;

import com.jcdevbot.datastruct.binarytree.Node;
import com.jcdevbot.datastruct.binarytree.BinaryTree;
import com.jcdevbot.datastruct.heap.*;
/**
 * Created by jcheung on 6/9/16.
 */
public class MainRunner {
    public static void main(String args[]){
        Node node = new Node(3);
        BinaryTree tree = new BinaryTree(node);
        Node node1 = new Node(2);
        Node node2 = new Node(4);
        tree.insert(node1);
        tree.insert(node2);

        int randomNumber = 10;

		/*for(int i = 0; i < 10; i ++){
			tree.insert(randomNode());
		}

		tree.printTree();
		tree.getBinaryTreeAsArray();*/

        int [] arr = {1,2,3,4,5,6,7,8,9};
        //Heap heap = new Heap(arr);
        //int index = heap.getLeft(3);

        //System.out.println(index);
    }

    public static Node randomNode(){
        int data = (int)((Math.random() * 100) + 1);
        return new Node(data);
    }
}
