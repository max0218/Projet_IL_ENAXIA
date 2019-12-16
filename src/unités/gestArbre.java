package CArbreTechno;

import java.util.ArrayList;

public class gestArbre implements IArbreTEchno {

	private int or;

	public gestArbre(int or) {

		this.or = or;
	}

	@Override
	public int getOr() {
		return this.or;
	}

	@Override
	public String getNom(Unite id) {
		return id.getNom();

	}

	@Override
	public int getTemps(Unite id) {
		int time=0;
		switch (id.getNom()) {
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

	@Override
	public int getquantite(Unite id) {
		return id.getQuant();
	}

	@Override
	public int getCout(Unite id) {
		int coste=0;
		switch (id.getNom()) {
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
	public ArrayList<Unite> getPrerequis(Unite id) {
		ArrayList<Unite> l = new ArrayList<>();
		switch (id.getNom()) {
		case "Centre":
			l.add(new Unite("Ouvrier", 1));
		case "Ferme":
			l.add(null);
		case "Caserne": {
			l.add(new Unite("Ouvrier", 1));
			l.add(new Unite("Ferme", 1));
		}
		case "Hall": {
			l.add(new Unite("Ouvrier", 1));
			l.add(new Unite("Caserne", 1));
		}
		case "Ouvrier":
			l.add(new Unite("Centre", 1));
		case "Soldat":
			l.add(new Unite("Caserne", 1));
		case "Boss": {
			l.add(new Unite("Hall", 1));
			l.add(new Unite("Caserne", 1));
		}
		default:
			l.add(null);
		}
		return l;
	}

	@Override
	public couplemobilise getMobilise(Unite id) {
		couplemobilise mob;
		switch (id.getNom()) {
		case "Centre":
			mob=new couplemobilise(new Unite("Ouvrier",1),200);
		case "Ferme":
			mob=new couplemobilise(new Unite("Ouvrier",1),100);
		case "Caserne":
			mob=new couplemobilise(new Unite("Ouvrier",1),100);
		case "Hall": 
			mob=new couplemobilise(new Unite("Ouvrier",1),120);
		case "Ouvrier":
			mob=new couplemobilise(new Unite("Centre",1),30);
		case "Soldat":
			mob=new couplemobilise(new Unite("Caserne",1),50);
		case "Boss": 
			mob=new couplemobilise(new Unite("Caserne",1),100);
		default:
			mob=new couplemobilise();
		}
		return mob;
	}

	



}
