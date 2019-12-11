package buildOrderBuilder;
import buildOrder.BuildOrder;
import interfaces.*;
import unités.*;

public class MockBuilder implements IOptimizer {

	private IBuildOrder bo;
	
	public MockBuilder() {
		bo=new BuildOrder();
	}
	
	@Override
	public IBuildOrder getBO(IObjectif o) {
		
		
		/**
		 *  VOILA TON BO :-)
		 */
		bo.add(new Ouvrier(),0);
		bo.add(new Centre(), 0);
		bo.add(new Ferme(), 1);
		bo.add(new Caserne(),2);
		bo.add(new Soldat(),3);
		bo.add(new Hall(),4);
		bo.add(new Boss(),5);
		
		
		return bo;
	}

}
