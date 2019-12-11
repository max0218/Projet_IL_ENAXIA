package buildOrder;

import interfaces.*;

public class Action {

	
	private IUnit unit;
	private int time;
	
	Action(IUnit u,int t){
		unit=u;
		time=t;
	}
	
	public IUnit getUnit() {
		return this.unit;
	}
	
	public int getTime() {
		return this.time;
	}
	
	public String toString() {
		return "The unit "+unit.getUnitName()+" is built at "+time;
	}
}
