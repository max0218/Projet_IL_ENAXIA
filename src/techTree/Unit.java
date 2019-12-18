package techTree;

import interfaces.*;

public class Unit  implements IUnit {


	private String nom;
	private int quant;
	public static final UnitFactory Factory=new UnitFactory();
	
	Unit(String nom, int quant) {
	
		this.nom=nom;
		this.quant=quant;
	}


	@Override
	public String getUnitName() {
		// TODO Auto-generated method stub
		return nom;
	}

	@Override
	public int getQuantity() {
		// TODO Auto-generated method stub
		return quant;
	}
}