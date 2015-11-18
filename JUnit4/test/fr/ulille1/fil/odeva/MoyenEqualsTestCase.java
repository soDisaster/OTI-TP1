package fr.ulille1.fil.odeva;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MoyenEqualsTestCase {

	private MoneyFactory mf;
	 
	@Before
    public void init() throws UnexistingCurrencyException
    {
      mf = MoneyFactory.getDefaultFactory();
    }

	/**
	 * Test de equals()
	 */
	@Test
	public void testEquals() throws UnexistingCurrencyException {
		Money m1 = mf.createMoney(24,"DOL");
		Money m2 = mf.createMoney(24,"DOL");
		assertTrue(m1.equals(m2));
	}
	
	/**
	 * Test de equals()
	 * Avec des valeurs differentes
	 */
	@Test
	public void testEqualsValeursDifferentes() throws UnexistingCurrencyException {
		Money m1 = mf.createMoney(24,"DOL");
		Money m2 = mf.createMoney(25,"DOL");
		assertFalse(m1.equals(m2));
	}
	
	/**
	 * Test de equals()
	 * Avec des devises differentes
	 */
	@Test
	public void testEqualsDevisesDifferentes() throws UnexistingCurrencyException {
		Money m1 = mf.createMoney(24,"DOL");
		Money m2 = mf.createMoney(24,"EUR");
		assertFalse(m1.equals(m2));
	}
	
	/**
	 * Test de equals()
	 * Avec les devises et des valeurs differentes
	 */
	@Test
	public void testEqualsDevisesEtValeursDifferentes() throws UnexistingCurrencyException {
		Money m1 = mf.createMoney(24,"EUR");
		Money m2 = mf.createMoney(25,"DOL");
		assertFalse(m1.equals(m2));
	}
	
	/**
	 * Test de equals()
	 * Sans Money
	 */
	@Test
	public void testEqualsNoMoney() throws UnexistingCurrencyException {
		Money m1 = mf.createMoney(24,"EUR");
		assertFalse(m1.equals("24 (ARBRE)"));
	}

}
