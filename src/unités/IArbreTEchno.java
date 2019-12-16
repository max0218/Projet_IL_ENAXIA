package CArbreTechno;

import java.util.ArrayList;
import java.util.List;

public interface IArbreTEchno {
	
	public int getOr();
	public String getNom(Unite id);
	public int getCout(Unite id);
	public ArrayList<Unite> getPrerequis(Unite id);
	public int getTemps(Unite id);
	public int getquantite(Unite id);
	public couplemobilise getMobilise(Unite id);
}
