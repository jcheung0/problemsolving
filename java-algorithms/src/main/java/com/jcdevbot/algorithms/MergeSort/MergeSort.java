package com.jcdevbot.algorithms.MergeSort;

/**
 * Created by jcheung on 6/11/16.
 */
public class MergeSort {


    //public static int[] copyELementsOver(int size, )

    public static void sort(int [] arr){
        int size = arr.length;

        if(size > 2){

            int middle = size / 2;
            int [] left = new int[middle];
            int [] right = new int [size - middle];

            for(int i = 0; i < middle; i++){
                left[i] = arr[i];
            }
            for(int j = middle; j < size; j++){
                right[j - middle] = arr[j];
            }

            sort(left);
            sort(right);

            int i = 0,j = 0,k = 0;
            while(i < left.length && j < right.length){
                if(left[i] < right[j]){
                    arr[k] = left[i];
                    i++;
                }else{
                    arr[k] = right[j];
                    j++;
                }

                k++;
            }

            while(i < left.length){
                arr[k] = left[i];
                k++;
                i++;
            }

            while(j < right.length){
                arr[k] = right[j];
                k++;
                j++;
            }


        }
    }

}
