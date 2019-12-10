package unités;
import java.util.ArrayList;
import java.util.List;

import interfaces.*;

public abstract class Unit implements IUnit{
	
	private static int cpt;
	private int unitID;
	private String name;
	private int goldCost;
	private int foodCost;
	private int buildingTime;
	protected static List<IUnit> requirements;
	
	Unit(int uID, String nom,int goldcost,int foodcost,int buildtime){
		this.unitID=cpt++;
		this.name=nom+uID;
		this.goldCost=goldcost;
		this.foodCost=foodcost;
		this.buildingTime=buildtime;
		requirements=new ArrayList<>();
	}
	
	public String getUnitName() {
		return this.name;
	}
	
	public int getUnitID() {
		return this.unitID;
	}
	public int getGoldCost() {
		return goldCost;
	}
	
	public int getFoodCost() {
		return this.foodCost;
	}
	
	public List<IUnit> getRequirements() {
		return requirements;
	}
	
	public int getBuildingTime() {
		return buildingTime;
	}
}
