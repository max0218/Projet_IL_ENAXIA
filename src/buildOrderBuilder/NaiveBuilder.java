package buildOrderBuilder;
import buildOrder.BuildOrder;
import interfaces.*;

public class NaiveBuilder implements IOptimizer {

	private IBuildOrder bo;
	
	public NaiveBuilder() {
		bo=new BuildOrder();
	}
	@Override
	public IBuildOrder getBO(IObjectif o) {
		// TODO Auto-generated method stub
		return bo;
	}

}
