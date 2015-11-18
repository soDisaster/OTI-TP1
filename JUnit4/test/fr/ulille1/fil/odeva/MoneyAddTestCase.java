package fr.ulille1.fil.odeva;

import static org.junit.Assert.*;

import org.junit.*;

/*
 * Unit test for simple App.
 */
public class MoneyAddTestCase
{
    private Money f12EUR, f14EUR, f15DOL;
    private MoneyFactory mf;
    
    @Before
    public void init() throws UnexistingCurrencyException
    {
      mf=MoneyFactory.getDefaultFactory();
      f12EUR = mf.createMoney(12, "EUR");
      f14EUR = mf.createMoney(14, "EUR");;
      f15DOL = mf.createMoney(14, "DOL");
    }

    /**
     * simpleAdd
     */
    @Test
    public void testSimpleAdd() throws UnexistingCurrencyException
    {
        Money expected = mf.createMoney(26, "EUR");
        Money result = MoneyOps.simpleAdd(f12EUR,f14EUR);
        //assertEquals(expected,result);
        assertTrue(expected.equals(result));
    }
    
    /*
    @Test
    public void testSimpleAdd2() throws UnexistingCurrencyException
    {
        Money expected = mf.createMoney(25, "EUR");
        Money result = null;
        try {
        	result=MoneyOps.simpleAdd(f12EUR,f15DOL);
        	fail("Attention pas d'exception levée");
        } catch (Exception e) {
        	
        }
        assertFalse(expected.equals(result));
    }
    */
    
    /**
     * simpleAdd3
     */
    @Test
    public void testSimpleAdd3() throws UnexistingCurrencyException
    {
        Money m1 = mf.createMoney(2, "EUR");
        Money m2 = mf.createMoney(4, "EUR");
        assertEquals(MoneyOps.simpleAdd(m1, m2), mf.createMoney(6, "EUR"));
    }
}
