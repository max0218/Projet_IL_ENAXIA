package unités;

public class Centre extends Batiment {

	private static int cpt=0;
	public Centre() {
		super(cpt++, "Centre",300, 200);
		requirements.add("Ouvrier");
		// TODO Auto-generated constructor stub
	}

}
