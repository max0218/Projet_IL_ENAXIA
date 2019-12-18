package buildOrderBuilder;
import buildOrder.BuildOrder;
import interfaces.*;
import techTree.*;

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
		bo.add(Unit.Factory.createOuvrier(1),0);
		bo.add(Unit.Factory.createCentre(1),0);
		bo.add(Unit.Factory.createFerme(1),0);
		bo.add(Unit.Factory.createCaserne(1),0);
		bo.add(Unit.Factory.createSoldat(1),0);
		bo.add(Unit.Factory.createHall(1),0);
		bo.add(Unit.Factory.createBoss(1),0);
		
		return bo;
	}

}
