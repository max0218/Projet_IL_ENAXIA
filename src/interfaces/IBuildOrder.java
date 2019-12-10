package interfaces;

import java.util.List;

import buildOrder.Action;

public interface IBuildOrder {

	public boolean add(IUnit u,int time);
	public List<Action> getBO();
}
