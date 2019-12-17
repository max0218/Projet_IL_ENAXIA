package interfaces;

import java.util.ArrayList;
import java.util.List;

import unités.Unit;
import unités.MobilisedUnits;

public interface ITechTree {

	
	public int getGoldCost(IUnit id);
	public List<IUnit> getRequirements(IUnit id);
	public int getBuildingTime(IUnit id);
	//public int getquantite(Unit id);
	public MobilisedUnits getMobilise(IUnit id);
}
