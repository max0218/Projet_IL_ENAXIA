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
	ITechTree t;
	public NaiveBuilder() {
		t= new GestTechTree();
		bo=new BuildOrder();
		bo.add(Unit.Factory.createCentre(1),0);
		bo.add(Unit.Factory.createOuvrier(1),0);
	}
	@Override
	public IBuildOrder getBO(IObjectif o) {
		// TODO Auto-generated method stub
		for(IUnit u : o.getObj()) {
			
			addRequirements(u);
			int timeToAdd=bo.getBO().get(bo.getBO().size()-1).getTime()+1;
			bo.add(u,timeToAdd);
		}

		return bo;
	}
	
	private void addRequirements(IUnit u) {
		
		System.err.println("Adding requirements of : "+u.getUnitName());
		boolean found;
		for(IUnit req : t.getRequirements(u)) { // On parcourt les prérequis !
			found=false;
			for(Action ac : bo.getBO()) {  // On parcours les unités déjà présentes dans le BO
				
				
				if(ac.getUnit().getUnitName()==req.getUnitName()) { // ce prérequis est déjà dans le BO ! 
					found=true;
				}
			}
			if(!found) { // ce prérequis n'est pas dans le bo ! 
				int timeToAdd=bo.getBO().get(bo.getBO().size()-1).getTime()+1;
				switch(req.getUnitName()) {
				case "Centre": bo.add(Unit.Factory.createCentre(1),timeToAdd);
				break;
				case "Ferme": bo.add(Unit.Factory.createFerme(1),timeToAdd);
				break;
				case "Hall": bo.add(Unit.Factory.createHall(1),timeToAdd);
				break;
				case "Caserne": bo.add(Unit.Factory.createCaserne(1),timeToAdd);
				break;
				case "Ouvrier": bo.add(Unit.Factory.createOuvrier(1),timeToAdd);
				break;
				case "Soldat": bo.add(Unit.Factory.createSoldat(1),timeToAdd);
				break;
				case "Boss": bo.add(Unit.Factory.createBoss(1),timeToAdd);
				break;
				}

				
			System.err.println(req.getUnitName()+ " is added in the BO");
			addRequirements(req); // On ajoute recursivement, les prérequis des prérequis.. 
			}else {
				//System.err.println(req.getUnitName()+ " is already in the BO");
			}
		}
	}

}
