package buildOrder;

import interfaces.*;

public class Action {

	
	private IUnit unit;
	private int time;
	
	Action(IUnit u,int t){
		unit=u;
		time=t;
	}
	
	IUnit getUnit() {
		return this.unit;
	}
	
	int getTime() {
		return this.time;
	}
}
