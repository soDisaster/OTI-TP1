package fr.ulille1.fil.odeva;

import junit.framework.TestCase;

public class MoneyGetTestCase extends TestCase {

	public MoneyGetTestCase(String name) {
		super(name);
	}
    //private Money f12EUR,  f14EUR;
    private MoneyFactory mf;

    public void setUp() throws UnexistingCurrencyException
    {
      mf=MoneyFactory.getDefaultFactory();
      //f12EUR=mf.createMoney(12, "EUR");
      //f14EUR=mf.createMoney(14, "EUR");;
    }
	
	/**
     * getValue
     */
    public void testGetValue() throws UnexistingCurrencyException
    {
        Money m = mf.createMoney(25, "EUR");
        assertEquals(m.getValue(), 25);
    }
    
    /**
     * getValue
     */
    public void testGetCurrency() throws UnexistingCurrencyException
    {
        Money m = mf.createMoney(26, "EUR");
        assertEquals(m.getCurrency(), "EUR");
    }

}
