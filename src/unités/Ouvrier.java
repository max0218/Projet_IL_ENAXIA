package unités;

public class Ouvrier extends MovingUnit {

	private static int cpt;
	public Ouvrier() {
		super(cpt++,"Ouvrier",50,1,30);
		// TODO Auto-generated constructor stub
		requirements.add("Centre");
	}

}
