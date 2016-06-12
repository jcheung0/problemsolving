import com.jcdevbot.algorithms.MergeSort.MergeSort;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Arrays;
/**
 * Created by jcheung on 6/11/16.
 */
public class SortTest {

    @Test
    public void reverseInput(){
        int[] arr={22,21,19,18,15,14,9,7,5};
        MergeSort.sort(arr);
        assertEquals("[5, 7, 9, 14, 15, 18, 19, 21, 22]", Arrays.toString(arr));

    }
    @Test
    public void emptyInput(){
        int[] arr={};
        MergeSort.sort(arr);
        assertEquals("[]", Arrays.toString(arr));
    }

    @Test
    public void alreadySorted(){
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        MergeSort.sort(arr);
        assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]", Arrays.toString(arr));
    }
}
