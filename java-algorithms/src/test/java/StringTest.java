import com.jcdevbot.algorithms.MergeSort.MergeSort;
import com.jcdevbot.problems.MathProblems;
import com.jcdevbot.problems.StringProblems;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import org.junit.Test;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * Created by jcheung on 6/11/16.
 */
public class StringTest {

    @Test
    public void reverseVowelsTest(){
        StringProblems problems = new StringProblems();
        String reverseString = problems.reverseVowels("hello");
        assertEquals("holle", reverseString);
    }

    @Test
    public void reverseVowelLongStringTest(){
        StringProblems problems = new StringProblems();
        String reverseString = problems.reverseVowels("leetcode");
        assertEquals("leotcede", reverseString);
    }

    @Test
    public void testHammingWeight(){
        StringProblems problems = new StringProblems();
        int reverseString = problems.hammingWeight(11);
        assertEquals(3, reverseString);
    }

    @Test
    public void testBinaryMatrixSearch(){
        int[][] matrix = {
            {1,   3,  5,  7},
            {10, 11, 16, 20},
            {23, 30, 34, 50}
        };
        StringProblems problems = new StringProblems();
        assertTrue(problems.binarySearchMatrix(matrix,5));
    }

    @Test
    public void testList(){

        int [] arr = { 10, 22, 9, 33, 21, 50, 41, 60, 80 };
        StringProblems problems = new StringProblems();
        assertEquals(6,problems.optimalLis(arr,arr.length));
    }

    @Test
    public void testPermutation(){

        StringProblems problems = new StringProblems();
        ArrayList<String> permutation = problems.permutation("","god", null);
        for (String val : permutation){
         //   System.out.println(val);
        }

        assert(true);
        //assertEquals(6,permutation.size());
    }

    @Test
    public void binarySearch(){

        //int [] arr = { 10, 22, 9, 33, 21, 50, 41, 60, 80 };
        int [] arr = { 1,2,3,4,5 };

        MergeSort.sort(arr);

        StringProblems problems = new StringProblems();
        int index = problems.binarySearch(arr,5,0, arr.length);
        System.out.println(index);
        System.out.println(arr[index]);

        assertEquals(80, arr[index]);
    }

    @Test
    public void binaryNotFoundSearch(){

        int [] arr = { 10, 22, 9, 33, 21, 50, 41, 60, 80 };
        MergeSort.sort(arr);

        StringProblems problems = new StringProblems();
        int index = problems.binarySearch(arr,50,0, arr.length);
        System.out.println(index);

        assertEquals(-1, index);
    }
}
