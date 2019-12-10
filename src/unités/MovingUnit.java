package unités;

public abstract class MovingUnit extends Unit {

	private static int cpt;
	MovingUnit(int uID, String nom, int goldcost, int foodcost, int buildtime) {
		super(cpt++, nom, goldcost, foodcost, buildtime);
		// TODO Auto-generated constructor stub
	}

}
