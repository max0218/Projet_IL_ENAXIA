package interfaces;

import java.util.List;

public interface IObjectif {

	public void addUnit(IUnit u);
	public void addUnit(List<IUnit> u);
	public void setGold(int g);
	public int getGoldToReach();
	public List<IUnit> getObj();
}
