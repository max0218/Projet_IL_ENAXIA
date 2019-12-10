package objectif;
import java.util.ArrayList;
import java.util.List;

import interfaces.*;

public class Objectif implements IObjectif {

	private int goldToReach;
	private List<IUnit> units;
	
	Objectif(){
		units=new ArrayList<>();
		goldToReach=0;
	}
	@Override
	public void addUnit(IUnit u) {
		// TODO Auto-generated method stub
		units.add(u);
	}

	@Override
	public void setGold(int g) {
		// TODO Auto-generated method stub
		goldToReach=g;
	}

	@Override
	public int getGoldToReach() {
		// TODO Auto-generated method stub
		return goldToReach;
	}
	public List<IUnit> getObj(){
		return this.units;
	}
	@Override
	public void addUnit(List<IUnit> l) {
		// TODO Auto-generated method stub
		units.addAll(l);
	}

}
