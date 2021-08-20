package evenOrOdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class EvenOrOddTests {
    @Test
    public void test1(){
      assertEquals("odd", EvenorOdd.isEvenOrOdd(3));
    }
    @Test
    public void test2(){
      assertEquals("even", EvenorOdd.isEvenOrOdd(0));
    }
    @Test
    public void test3(){
      assertEquals("odd", EvenorOdd.isEvenOrOdd(7));
    }
    @Test
    public void test4(){
      assertEquals("even", EvenorOdd.isEvenOrOdd(12));
    }
    @Test
    public void test5(){
      assertEquals("even", EvenorOdd.isEvenOrOdd(6474));
    }
    @Test
    public void test6(){
      assertEquals("odd", EvenorOdd.isEvenOrOdd(563));
    }
    @Test
    public void test7(){
      assertEquals("odd", EvenorOdd.isEvenOrOdd(3));
    }
    @Test
    public void test8(){
      assertEquals("odd", EvenorOdd.isEvenOrOdd(-3));
    }
    @Test
    public void test9(){
      assertEquals("even", EvenorOdd.isEvenOrOdd(-6));
    }
    @Test
    public void test10(){
      assertEquals("even", EvenorOdd.isEvenOrOdd(11111000));
    }
    @Test
    public void test11(){
      assertEquals("even", EvenorOdd.isEvenOrOdd(-0));
    }
    @Test
    public void test12(){
      assertEquals("odd", EvenorOdd.isEvenOrOdd(-301));
    }
}