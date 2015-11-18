package fr.ulille1.fil.odeva;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MoneyTestCase {

    private MoneyFactory mf;
    
    @Before
    public void init() throws UnexistingCurrencyException
    {
      mf = MoneyFactory.getDefaultFactory();
    }
    
    /**
     * Test de getValue()
     */
    @Test
    public void testGetValue() throws UnexistingCurrencyException
    {
        Money m = mf.createMoney(25, "EUR");
        assertEquals(m.getValue(), 25);
    }
    
    /**
     * Test de getCurrency()
     */
    @Test
    public void testGetCurrency() throws UnexistingCurrencyException
    {
        Money m = mf.createMoney(26, "EUR");
        assertEquals(m.getCurrency(), "EUR");
    }
    
    /**
     * Test de toString()
     */
    @Test
    public void testToString() throws UnexistingCurrencyException
    {
        Money m = mf.createMoney(26, "EUR");
        assertEquals(m.toString(), "26 (EUR)");
    }

}
