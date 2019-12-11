package unités;

public class Boss extends MovingUnit {

	private static int cpt=0;
	
	public Boss() {
		super(cpt++,"Boss",200, 3,100);
		// TODO Auto-generated constructor stub
		requirements.add("Caserne");
		requirements.add("Hall");
		
	}

}
