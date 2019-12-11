package buildOrderBuilder;

import java.util.ArrayList;
import java.util.List;

import buildOrder.Action;
import buildOrder.BuildOrder;
import interfaces.IBuildOrder;
import interfaces.IObjectif;
import interfaces.IOptimizer;
import unités.*;
import interfaces.*;
public class NaiveBuilder implements IOptimizer {


	private IBuildOrder bo;

	public NaiveBuilder() {
		bo=new BuildOrder();
		bo.add(new Centre(),0);
		bo.add(new Ouvrier(),0);
	}
	@Override
	public IBuildOrder getBO(IObjectif o) {
		// TODO Auto-generated method stub
		/**
		 * A FAIRE RECURSIVEMENT PCQ LA CA NE FONCTIONNE PAS
		 */
		List<Action> toAdd;
		for(IUnit u : o.getObj()) {
			
			for(String req : u.getRequirements()) {
				toAdd = new ArrayList<>();
				boolean found=false;

				for(Action ac : bo.getBO()) {

					if(ac.getUnit().getUnitName()==req) {
						found=true;
					}
				}

				if(!found) {
					int timeToAdd=bo.getBO().get(bo.getBO().size()-1).getTime()+1;
					switch(req) {
					case "Centre": bo.add(new Centre(),timeToAdd);
					break;
					case "Ferme": bo.add(new Ferme(),timeToAdd);
					break;
					case "Hall": bo.add(new Hall(),timeToAdd);
					break;
					case "Caserne": bo.add(new Caserne(),timeToAdd);
					break;
					case "Ouvrier": bo.add(new Ouvrier(),timeToAdd);
					break;
					case "Soldat": bo.add(new Soldat(),timeToAdd);
					break;
					case "Boss": bo.add(new Boss(),timeToAdd);
					break;
					}
				}
			}
			int timeToAdd=bo.getBO().get(bo.getBO().size()-1).getTime()+1;
			bo.add(u,timeToAdd);
		}
		return bo;
	}

}
