package Der_Butter;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class QueueTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	
	Queue dank;
	public QueueTest(String testName) {
		super(testName);
		dank = new Queue(3);
	}

	public void testistErstesHalbjahr() {
		final int eingabe1 = 0;
		final int eingabe2 = -1;
		final int eingabe3 = 1;
		final int eingabe4 = 999;
		
		final int sollWert1 = 0;
		final int sollWert2 = -1;
		final int sollWert3 = 999;
		
		dank.enqueue(eingabe1);
		dank.enqueue(eingabe2);
		dank.enqueue(eingabe3);
		dank.enqueue(eingabe4);
		
		assertEquals(sollWert1, dank.dequeue());
		assertEquals(sollWert2, dank.dequeue());
		assertEquals(sollWert3, dank.dequeue());
		
		try
		{
			dank.dequeue();
			fail("Erwartete Ausnahme wurde nicht geworfen");
		}
		catch (IllegalStateException e)
		{}
		
		
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(QueueTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testQueue() {
		assertTrue(true);
	}
}
