package com.jcdevbot.datastruct.binarytree;

/**
 * Created by jcheung on 6/9/16.
 */
public class Node{
    private int data;
    private Node left;
    private Node right;
    private Node parent;
    public Node (int data){
        this.data = data;
    }

    public void setData(int data){
        this.data = data;
    }
    public int getData(){
        return data;
    }

    public void setRight(Node node){
        this.right = node;
    }

    public void setLeft(Node node){
        this.left = node;
    }

    public Node getLeft(){
        return this.left;
    }

    public Node getRight(){
        return this.right;
    }
}

