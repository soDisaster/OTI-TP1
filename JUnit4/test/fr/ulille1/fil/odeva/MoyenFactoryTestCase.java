package fr.ulille1.fil.odeva;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MoyenFactoryTestCase {

	private MoneyFactory mf;
	 
	@Before
    public void init() throws UnexistingCurrencyException
    {
      mf = MoneyFactory.getDefaultFactory();
    }

	/**
	 * Test de defaultFactory()
	 */
	@Test
	public void testDefaultFactory() throws UnexistingCurrencyException {
		assertEquals(mf, MoneyFactory.getDefaultFactory());
	}
	
	/**
	 * Test de CreateMoney()
	 */
	@Test
	public void testCreateMoney() throws UnexistingCurrencyException {
		Money m = mf.createMoney(24,"DOL");
		assertEquals(m, new Money(24, "DOL"));
	}

}
