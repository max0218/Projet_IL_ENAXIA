package buildOrder;
import interfaces.*;
public class BOFactory {

	public static IBuildOrder createBO() {
		return new BuildOrder();
	}
}
