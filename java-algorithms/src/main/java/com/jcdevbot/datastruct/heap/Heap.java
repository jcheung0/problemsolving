package com.jcdevbot.datastruct.heap;

/**
 * Created by jcheung on 6/10/16.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Heap{
    //private ArrayList<Integer> arr;
    private int[] heap;
    private int size = 0;
    private int maxSize;
    public Heap(int maxSize, int root){
        this.maxSize = maxSize;
        heap = new int[maxSize + 1];
        Arrays.fill(heap, -1);
        heap[0] = root;
    }

    public Integer getParent(int index){
        if(index == 0){
            return -1;
        }else{
            if(index % 2 == 0){
                return (index/2);
            }else{
                return (index - 1)/2;
            }
        }
    }

    public Integer getLeft(int index){
        return 2*index;
    }
    public Integer getRight(int index){
        return 2*index + 1;
    }

    public void insert(int value){
        //Heap[++size]
    }

    private void swap(int fpos , int spos){
        int tmp;
        tmp = heap[fpos];
        heap[fpos] = heap[spos];
        heap[spos] = tmp;
    }



    private void maxHeapify(int pos){

    }

    public void printHeap(){
        for(int i = 0; i < size; i++)
            System.out.print(heap[i] + " ");
        System.out.println();
    }
}
