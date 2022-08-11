package GenericLibrary;

import java.util.Random;


/**
 * this class contain all java specific genearic methods 
 * @author cristan
 *
 */
public class JavaLibrary {
	
	/**
	 * this method will generate the random number 
	 * @return
	 */
	public int getRandom() {
		Random r=new Random();
		int random = r.nextInt(200);
		return random;
		
	}

}
