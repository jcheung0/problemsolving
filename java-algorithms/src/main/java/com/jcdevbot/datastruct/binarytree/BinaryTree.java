package com.jcdevbot.datastruct.binarytree;

import java.util.ArrayList;

/**
 * Created by jcheung on 6/10/16.
 */
public class BinaryTree{
    private Node root;

    public BinaryTree(Node root){
        this.root = root;
    }

    public void insert(Node  node){
        if(root == null){
            root = node;
        }else{
            insertNode(root,node);
        }

    }

    private void insertNode(Node node, Node newNode){
        Node left = node.getLeft();
        Node right = node.getRight();

        if(node.getData() > newNode.getData()){
            if(left != null){
                insertNode(left,newNode);
            }else{
                node.setLeft(newNode);
            }
        }else{
            if(right != null){
                insertNode(right,newNode);
            }else{
                node.setRight(newNode);
            }
        }
    }

    public void printTree(){
        inOrderTraversal(root);
    }

    private void postOrderTraversal(Node node){
        System.out.println(node.getData());
    }

    private void preOrderTraversal(Node node){
        System.out.println(node.getData());

    }
    private void inOrderTraversal(Node node){
        if(node.getLeft() != null){
            inOrderTraversal(node.getLeft());
        }
        System.out.println(node.getData());
        if(node.getRight() != null){
            inOrderTraversal(node.getRight());
        }
    }

    private void convertTreeToArray(Node node, ArrayList list){
        if(node.getLeft() != null){
            convertTreeToArray(node.getLeft(),list);
        }
        list.add(node);
        if(node.getRight() != null){
            convertTreeToArray(node.getRight(),list);
        }
    }

    public ArrayList getBinaryTreeAsArray(){
        ArrayList<Node> list = new ArrayList<Node>();
        convertTreeToArray(root,list);

        for(Node node : list){
            System.out.print(node.getData() + " ");
        }
        return list;
    }

    public int getMaxDepth(){
        return getMaxDepth(root);
    }

    private int getMaxDepth(Node node){
        if(node == null) return 0;
        int left_height = getMaxDepth(node.getLeft());
        int right_height = getMaxDepth(node.getRight());
        return (left_height > right_height) ? left_height + 1 : right_height + 1;
    }

}