package interfaces;

import java.util.List;

public interface IUnit {

	public int getGoldCost();
	public String getUnitName();
	public int getFoodCost();
	public List<IUnit> getRequirements();
	public int getBuildingTime();
}
