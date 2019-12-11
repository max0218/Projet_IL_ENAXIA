package unités;

public class Caserne extends Batiment {

	private static int cpt=0;
	public Caserne() {
		super(cpt++, "Caserne",150,100);
		requirements.add("Ouvrier");
		requirements.add("Ferme");
		// TODO Auto-generated constructor stub
	}

}
