package Der_Butter;

import java.util.*;

public class ResidentRepositoryStub implements ResidentRepository{

	public List<Resident> getResidents()
	{
		Resident Horstmann = new Resident("Jonas", "Horstmann", "Plebstreet", "Trossingen", new Date());
		Resident Weber = new Resident("Michael", "Weber", "Teststreet", "Trossingen", new Date());
		Resident Straetz = new Resident("Tim", "Straetz", "Plebstreet", "Furtwangen", new Date());
		List<Resident> einwohner = new ArrayList<Resident>();
		einwohner.add(Horstmann);
		einwohner.add(Weber);
		einwohner.add(Straetz);
		einwohner.add(Horstmann);
		
		return einwohner;
	}

}
