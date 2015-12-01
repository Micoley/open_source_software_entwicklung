package Der_Butter;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class UtilTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public UtilTest(String testName) {
		super(testName);
	}

	public void testistErstesHalbjahr() {
		final int eingabe1 = 1;
		final int eingabe2 = 12;
		final int eingabe3 = 0;
		final int eingabe4 = 6;
		final int eingabe5 = 7;
		final boolean sollWert1 = true;
		final boolean sollWert2 = false;
		// final boolean sollWert3 = false;
		final boolean sollWert4 = true;
		final boolean sollWert5 = false;

		assertEquals(sollWert1, Util.istErstesHalbjahr(eingabe1));
		assertEquals(sollWert2, Util.istErstesHalbjahr(eingabe2));

		try {
			Util.istErstesHalbjahr(eingabe3); // triviale Anwendungsklasse,
												// dividiert a/b
			fail("Erwartete Ausnahme wurde nicht geworfen");
		} catch (IllegalArgumentException e) 
		{}

		assertEquals(sollWert4, Util.istErstesHalbjahr(eingabe4));
		assertEquals(sollWert5, Util.istErstesHalbjahr(eingabe5));

	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(UtilTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testUtil() {
		assertTrue(true);
	}
}
