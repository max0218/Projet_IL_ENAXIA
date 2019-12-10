package unités;

public class Hall extends Batiment {

	private static int cpt=0;
	
	public Hall() {
		super(cpt++, "Hall", 200, 120);
		// TODO Auto-generated constructor stub
		requirements.add(new Ouvrier());
	}

}
