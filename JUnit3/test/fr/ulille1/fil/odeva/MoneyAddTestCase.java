package fr.ulille1.fil.odeva;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class MoneyAddTestCase
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public MoneyAddTestCase( String testName )
    {
        super( testName );
    }

    private Money f12EUR, f14EUR, f14DOL;
    private MoneyFactory mf;

    public void setUp() throws UnexistingCurrencyException
    {
      mf=MoneyFactory.getDefaultFactory();
      f12EUR=mf.createMoney(12, "EUR");
      f14EUR=mf.createMoney(14, "EUR");
      f14DOL=mf.createMoney(14, "DOL");
    }

    /**
     * simpleAdd
     *  On teste le equal et pas le SimpleAdd
     */
    public void testSimpleAdd() throws UnexistingCurrencyException
    {
        Money expected=mf.createMoney(26, "EUR");
        Money result=MoneyOps.simpleAdd(f12EUR,f14EUR);
        //assertEquals(expected,result);
        assertTrue(expected.equals(result));
    }
    
    /**
     * simpleAdd2
     * On teste le equal et pas le SimpleAdd
     */
    public void testSimpleAdd2() throws UnexistingCurrencyException
    {
        Money expected=mf.createMoney(25, "EUR");
        Money result = null;
        try {
        	result=MoneyOps.simpleAdd(f12EUR,f14DOL);
        	fail("Attention pas d'exception levée");
        } catch (Exception e) {
        	
        }
        assertFalse(expected.equals(result));
    }
  
    /* Tests pour devises differentes */
}
