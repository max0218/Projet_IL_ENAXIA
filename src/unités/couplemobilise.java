package CArbreTechno;

public class couplemobilise {
	private Unite unite;
	private int qnt;
	
	couplemobilise (Unite unite,int qnt ){
		this.unite=unite;
		this.qnt=qnt;
		
	}

	public couplemobilise() {
	}

	public Unite getUnite() {
		return unite;
	}

	public void setUnite(Unite unite) {
		this.unite = unite;
	}

	public int getQnt() {
		return qnt;
	}

	public void setQnt(int qnt) {
		this.qnt = qnt;
	}

	
}
