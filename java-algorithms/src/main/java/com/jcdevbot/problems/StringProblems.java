package com.jcdevbot.problems;

import java.util.ArrayList;
import java.math.BigInteger;
/**
 * Created by jcheung on 6/11/16.
 */
public class StringProblems {

    static int max_ref;
    private boolean isVowel(char character){
            char[] vowels = {'a','e','i','o','u'};
            System.out.println(character + "");
            for(int i = 0; i < vowels.length; i++){
                if(vowels[i] == character){
                    return true;
                }
            }
            return false;
        }

        public String reverseVowels(String s) {
            int size = s.length()/2;
            char[] schar = s.toCharArray();
            int aVowelIndex = -1;
            int bVowelIndex = -1;

            for(int i = 0; i < size; i++){
                //System.out.println(i);
                char a = schar[i];
                char b = schar[s.length() - i - 1];

                if(isVowel(a) && isVowel(b)){
                    schar[i] = b;
                    schar[s.length() - i - 1] = a;
                    aVowelIndex = -1;
                    bVowelIndex = -1;
                }

                if(isVowel(a)){
                    if(bVowelIndex >= 0){
                        char tmp = schar[bVowelIndex];
                        schar[i] = tmp;
                        schar[bVowelIndex] = a;
                        aVowelIndex = -1;
                    }else{
                        aVowelIndex = i;
                    }
                }


                if(isVowel(b)){
                    if(aVowelIndex >= 0){
                        char tmp = schar[aVowelIndex];
                        schar[i] = tmp;
                        schar[aVowelIndex] = b;
                        bVowelIndex = -1;
                    }else{
                        bVowelIndex = s.length() - i - 1;
                    }

                }

            }
            String newString = new String(schar);
            return newString;
        }

        String reverseVowelsOnce(String s){
            ArrayList<Character> vowList = new ArrayList<Character>();
            vowList.add('a');
            vowList.add('e');
            vowList.add('i');
            vowList.add('o');
            vowList.add('u');
            vowList.add('A');
            vowList.add('E');
            vowList.add('I');
            vowList.add('O');
            vowList.add('U');

            char[] arr = s.toCharArray();

            int i=0;
            int j=s.length()-1;

            while(i<j){
                if(!vowList.contains(arr[i])){
                    i++;
                    continue;
                }

                if(!vowList.contains(arr[j])){
                    j--;
                    continue;
                }

                char t = arr[i];
                arr[i]=arr[j];
                arr[j]=t;

                i++;
                j--;
            }

            return new String(arr);

        }


        // you need to treat n as an unsigned value
        public int hammingWeight(long n) {
            //String binaryRep = Integer.toString(n,2);
            BigInteger number = new BigInteger(String.valueOf(n));
            String binaryRep = number.toString(2);

            int counter = 0;
            /*for(int i = 0; i < binaryRep.length();i++){
                char c = binaryRep.charAt(i);
                if(c == '1'){
                    counter++;
                }
            }*/

            while(n != 0){
                n = n & (n - 1);
                System.out.println(n);
                counter++;
            }


            return counter;
        }

        //this will determine if a sudoku board is valid
        public boolean isValidSudoku(char [][] board){
            if(board == null || board.length != 9 || board[0].length != 9)
                return false;

            for(int i = 0 ; i < 9; i++){
                boolean[] columns = new boolean[9];
                boolean[] rows = new boolean[9];
                for(int j = 0; j < 9; j++){
                    if(board[i][j] != '.'){
                        if(columns[board[i][j] - 1]){
                            return false;
                        }
                        columns[board[i][j] - 1] = true;
                    }
                    if(board[j][i] != '.'){
                        if(rows[board[j][i] - 1]){
                            return false;
                        }
                        rows[board[j][i] - 1] = true;
                    }
                }
            }

            //check each 3*3 matrix
            for (int block = 0; block < 9; block++) {
                boolean[] m = new boolean[9];
                for (int i = block / 3 * 3; i < block / 3 * 3 + 3; i++) {
                    for (int j = block % 3 * 3; j < block % 3 * 3 + 3; j++) {
                        if (board[i][j] != '.') {
                            if (m[(int) (board[i][j] - '1')]) {
                                return false;
                            }
                            m[(int) (board[i][j] - '1')] = true;
                        }
                    }
                }
            }

            return true;
        }


        public String reverseString(String s) {
            char []cstring = s.toCharArray();
            int size = (cstring.length/2);
            for(int i = 0; i < size; i++){
                char tmp = cstring[i];
                cstring[i] = cstring[cstring.length - i - 1];
                cstring[cstring.length - i - 1] = tmp;
            }

            return new String(cstring);
        }


        public boolean searchIneffiecientMatrix(int[][] matrix, int target) {
            int columnSize = matrix.length;
            int rowSize = matrix[0].length;

            for(int i = 0; i < columnSize; i++){
                for(int j = 0; j < rowSize; j++){
                    if(matrix[i][j] == target){
                        return true;
                    }
                }
            }

            return false;
        }

    public boolean binarySearchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0){
            return false;
        }
        int columnSize = matrix.length;
        int rowSize = matrix[0].length;

        int start = 0;
        int end = columnSize*rowSize - 1;


        while(start <= end){
            int middle = (start + end)/2;
            int midX = middle/rowSize;
            int midY = middle%rowSize;

            System.out.println("X" + midX + " " + "Y: " + midY);
            if(matrix[midX][midY] == target){
                return true;
            }

            if(matrix[midX][midY] < target){
                start = middle++;
            }else{
                end = middle--;
            }
        }

        return false;
    }

    public boolean selfCrossing(int [] x) {
        return false;
    }

    public int lis(int[] arr){
        ArrayList cache = new ArrayList();
        if(arr.length == 0 || arr.length == 1){
            return 0;
        }

        //int max_value = 1;
        int counter =  0;
        int pastValue =  arr[0];
        cache.add(pastValue);
        for(int i =1; i < arr.length; i++){
            if(arr[i] > pastValue){
               cache.add(arr[i]);
               pastValue = arr[i];
           }
        }
        System.out.println(cache);
        return cache.size();

    }

    public int optimalLis(int[] arr, int n){
        // base case
        if (n == 1)
            return 1;

        // 'max_ending_here' is length of LIS ending with arr[n-1]
        int res, max_ending_here = 1;

        /* Recursively get all LIS ending with arr[0], arr[1] ...
           arr[n-2]. If   arr[i-1] is smaller than arr[n-1], and
           max ending with arr[n-1] needs to be updated, then
           update it */
        for (int i = 1; i < n; i++)
        {
            System.out.println("##########RECURSIVE ###########");
            res = optimalLis(arr, i);
            System.out.println("n = " + i);
            System.out.println(arr[i - 1] + " "  + arr[n-1]);
            System.out.println("RESULT " + res);

            if (arr[i-1] < arr[n-1] && res + 1 > max_ending_here)
                max_ending_here = res + 1;
        }


        // Return length of LIS ending with arr[n-1]
        return max_ending_here;
    }

    public ArrayList<String> permutation(String perm, String word, ArrayList<String> wordCache){
        if(wordCache == null){
            wordCache = new ArrayList<String>();
        }
        if(word.isEmpty()){
            wordCache.add(perm + word);
        }else{
            System.out.println("#############RECURSIVE STEP#########");
            for (int i = 0; i < word.length();i++){
                String nextPerm = perm + word.charAt(i);
                String nextWord = word.substring(0,i) + word.substring(i + 1, word.length());
                System.out.println("Prefix:" + nextPerm + " Word: " + nextWord);

                permutation(nextPerm, nextWord,wordCache);
            }
        }
        return wordCache;
    }

    public int binarySearch(int []arr, int searchValue, int start, int end){
        if(arr == null || arr.length == 0 || start > end || end > arr.length)
            return -1;

        int middle = start + (end - start)/2;
        System.out.println("#######################RECURSIVE STEP###################");
        System.out.println("middle value " + middle);
        System.out.println("start value " + start);
        System.out.println("end value " + end);

        if(middle >= arr.length){
            return -1;
        }

        if(searchValue  < arr[middle] ){
            return binarySearch(arr,searchValue,start,middle);

        }else if(searchValue > arr[middle] ){
            return binarySearch(arr,searchValue,middle+1,end);

        }else if(arr[middle] == searchValue){
            return middle;
        }

        return -1;

    }



}
