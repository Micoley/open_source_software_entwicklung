package Der_Butter;

import static org.junit.Assert.*;
import java.util.Date;
import java.util.List;

import junit.framework.TestSuite;
import org.junit.Test;


public class ResidentServiceTest
{
	Resident sollwert1;
	int sollwert2 = 4;
	Resident result;
	
	Resident Horstmann;
	Resident Weber;
	Resident Straetz;
	
	ResidentRepositoryStub testRepository;
	BaseResidentService testUnique;
	
	
	public ResidentServiceTest()
	{		
		
		testRepository = new ResidentRepositoryStub();
		testUnique = new BaseResidentService();
		testUnique.setResidentRepository(testRepository);
		

		Horstmann = new Resident("Jonas", "Horstmann", "Plebstreet", "Trossingen", new Date());
		Weber = new Resident("Michael", "Weber", "Teststreet", "Trossingen", new Date());
		Straetz = new Resident("Tim", "Straetz", "Plebstreet", "Furtwangen", new Date());

		sollwert1 = Weber;
	}
	
	@Test
	public void testgetUniqueResident()
	{
		
		try
		{
			result = testUnique.getUniqueResident(Weber);
			assertEquals(sollwert1.getGivenName(), result.getGivenName());
			assertEquals(sollwert1.getFamilyName(), result.getFamilyName());
			assertEquals(sollwert1.getStreet(), result.getStreet());
			assertEquals(sollwert1.getCity(), result.getCity());
		}
		catch (ResidentServiceException e) 
		{
			e.printStackTrace();
		}
		
		try
		{
			testUnique.getUniqueResident(Horstmann);
			fail("Erwartete Ausnahme wurde nicht geworfen");
		}
		catch (ResidentServiceException e)
		{
			e.printStackTrace();
		}
		
		try
		{
			testUnique.getUniqueResident(new Resident("Donald", "Duck", "Duckstreet", "Entenhausen", new Date()));
			fail("Erwartete Ausnahme wurde nicht geworfen");
		}
		catch (IllegalStateException e)
		{}
		catch (ResidentServiceException e)
		{
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testgetFilteredResidentsList()
	{
		boolean testing = false;
		assertEquals(sollwert2, testUnique.getFilteredResidentsList(new Resident("*", "*", "*", "*", new Date())).size());
		List<Resident> ergebnis = testUnique.getFilteredResidentsList(new Resident("*", "*", "*", "*", new Date()));
		Object[] dank = ergebnis.toArray();
		if ((((Resident) dank[0]).getGivenName() == "Jonas"))
			testing = true;
		assertTrue(testing);
	}
}
