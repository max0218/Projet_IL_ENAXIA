package unités;

import java.util.ArrayList;
import java.util.List;

import interfaces.*;

public class GestTechTree implements ITechTree {

	List<IUnit> l;

	public GestTechTree() {
	}


	@Override
	public int getBuildingTime(IUnit id) {
		int time=0;
		switch (id.getUnitName()) {
		case "Centre":
			time=200;
		case "Ferme":
			time=60;
		case "Caserne":
			time=100;
		case "Hall": 
			time=120;
		case "Ouvrier":
			time=30;
		case "Soldat":
			time=50;
		case "Boss": 
			time=100;
		default:
			time=0;
		}
		return time;
	}
/*
	@Override
	public int getquantite(Unit id) {
		return id.getQuant();
	}
*/
	@Override
	public int getGoldCost(IUnit id) {
		int coste=0;
		switch (id.getUnitName()) {
		case "Centre":
			coste=300;
		case "Ferme":
			coste=100;
		case "Caserne":
			coste=150;
		case "Hall": 
			coste=200;
		case "Ouvrier":
			coste=50;
		case "Soldat":
			coste=100;
		case "Boss": 
			coste=200;
		default:
			coste=0;
		}
		return coste;
	}

	@Override
	public List<IUnit> getRequirements(IUnit id) {
		l = new ArrayList<>();
		switch (id.getUnitName()) {
		case "Centre":
			l.add(new Unit("Ouvrier", 1));
			break;
		case "Ferme":
			l.add(Unit.Factory.createOuvrier(1));
			break;
		case "Caserne": {
			l.add(new Unit("Ouvrier", 1));
			l.add(new Unit("Ferme", 1));
			break;
		}
		case "Hall": {
			l.add(new Unit("Ouvrier", 1));
			l.add(new Unit("Caserne", 1));
			break;
		}
		case "Ouvrier":
			l.add(new Unit("Centre", 1));
			break;
		case "Soldat":
			l.add(new Unit("Caserne", 1));
			break;
		case "Boss": {
			l.add(new Unit("Hall", 1));
			l.add(new Unit("Caserne", 1));
			break;
		}
		default:
	
		}
		return l;
	}

	@Override
	public MobilisedUnits getMobilise(IUnit id) {
		MobilisedUnits mob;
		switch (id.getUnitName()) {
		case "Centre":
			mob=new MobilisedUnits(new Unit("Ouvrier",1),200);
		case "Ferme":
			mob=new MobilisedUnits(new Unit("Ouvrier",1),100);
		case "Caserne":
			mob=new MobilisedUnits(new Unit("Ouvrier",1),100);
		case "Hall": 
			mob=new MobilisedUnits(new Unit("Ouvrier",1),120);
		case "Ouvrier":
			mob=new MobilisedUnits(new Unit("Centre",1),30);
		case "Soldat":
			mob=new MobilisedUnits(new Unit("Caserne",1),50);
		case "Boss": 
			mob=new MobilisedUnits(new Unit("Caserne",1),100);
		default:
			mob=null;
		}
		return mob;
	}

	



}
