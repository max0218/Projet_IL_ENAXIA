package buildOrder;

import java.util.ArrayList;
import java.util.List;

import interfaces.*;

public class BuildOrder implements IBuildOrder {

	private List<Action> bo;
	
	public BuildOrder() {
		bo=new ArrayList<>();
	}

	@Override
	public boolean add(IUnit u, int time) {
		// TODO Auto-generated method stub
		bo.add(new Action(u,time));
		return true;
	}

	@Override
	public List<Action> getBO() {
		// TODO Auto-generated method stub
		return bo;
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder();
		for(Action a : bo) {
			str.append(a.toString()+"\n");
		}
		return str.toString();
	}


}
