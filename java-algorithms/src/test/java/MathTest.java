import com.jcdevbot.problems.MathProblems;
import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigInteger;
/**
 * Created by jcheung on 6/11/16.
 */
public class MathTest{

    @Test
    public void FactorialTest(){
        MathProblems problems = new MathProblems();
        BigInteger number = problems.calculateFactrial(4);
        assertEquals(new BigInteger("24"), number);

    }

    @Test
    public void factorialBigNumberTest(){
        MathProblems problems = new MathProblems();
        BigInteger number = problems.calculateFactrial(25);
        assertEquals(new BigInteger("15511210043330985984000000"), number);

    }

    @Test
    public void testDivision(){
        MathProblems prob = new MathProblems();
        int number = prob.divide(36,6);
        System.out.println(number);
        assertEquals(6,6);
    }

    @Test
    public void testGCD(){
        MathProblems prob = new MathProblems();
        int number = prob.gcdEuclide(1,5);
        System.out.println(number);
        assertEquals(1,number);
    }

    @Test
    public void testCandyDistirbution(){
        int [] arr = {1,2,2};
        MathProblems prob = new MathProblems();
        int result  = prob.candy(arr);

        assertEquals(4,result);
    }
}
