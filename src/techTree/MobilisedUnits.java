package techTree;

public class MobilisedUnits {
	private Unit unite;
	private int qnt;
	
	MobilisedUnits (Unit unite,int qnt ){
		this.unite=unite;
		this.qnt=qnt;
		
	}

	public Unit getUnite() {
		return unite;
	}

	public void setUnite(Unit unite) {
		this.unite = unite;
	}

	public int getQnt() {
		return qnt;
	}

	public void setQnt(int qnt) {
		this.qnt = qnt;
	}

	
}
