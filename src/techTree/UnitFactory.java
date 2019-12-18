package techTree;

import interfaces.*;

public class UnitFactory {

	public UnitFactory() {
		// TODO Auto-generated constructor stub
	}

	public IUnit createOuvrier(int howMany) {
		return new Unit("Ouvrier",howMany);
	}
	
	public IUnit createSoldat(int howMany) {
		return new Unit("Soldat",howMany);
	}
	
	public IUnit createBoss(int howMany) {
		return new Unit("Boss",howMany);
	}
	
	public IUnit createCentre(int howMany) {
		return new Unit("Centre",howMany);
	}
	
	public IUnit createFerme(int howMany) {
		return new Unit("Ferme",howMany);
	}
	
	public IUnit createCaserne(int howMany) {
		return new Unit("Caserne",howMany);
	}
	
	public IUnit createHall(int howMany) {
		return new Unit("Hall",howMany);
	}
}
