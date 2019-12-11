package unités;

public class Soldat extends MovingUnit {

	private static int cpt=0;
	
	public Soldat() {
		super(cpt++,"Soldat",100,1,100);
		// TODO Auto-generated constructor stub
		requirements.add("Caserne");
	}



}
