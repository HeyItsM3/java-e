package sumElementsArray;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumarElementosArrayTest {

    @Test
    public void test1(){
        assertEquals(13, SumarElementosArray.arraySum(new int[]{2, 7, 4}));
    }
    @Test
    public void test2(){
        assertEquals(48, SumarElementosArray.arraySum(new int[]{45, 3, 0}));
    }
    @Test
    public void test3(){
        assertEquals(105, SumarElementosArray.arraySum(new int[]{-2, 84, 23}));
    }
}