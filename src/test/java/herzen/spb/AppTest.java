package herzen.spb;


import junit.framework.TestCase;

public class AppTest 
    extends TestCase
{
    Math math;
    public void setUp(){
        math = new Math();
    }

    public void testSum(){
        assertEquals(35,math.sum(20,15));
        assertEquals(35,math.sum(1,10));
        assertEquals("Java",math.sum("Ja","va"));
        assertEquals("JUnit",math.sum("J","nit"));
    }
    public void testMul(){
        assertEquals(100,math.mul(50,2));
        assertEquals(0.20f,math.mul(0.5f,0.4f));
    }
    public void testFunc(){
        assertEquals(math.func(2),0.01);
        assertEquals(math.func(9.1f),2.1f);
    }
}
