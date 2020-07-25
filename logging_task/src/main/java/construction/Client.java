package construction;
import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Client {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		final Logger LOGGER=LogManager.getLogger(Client.class);
		LOGGER.debug("Enter the type of the material(standard/above standard/high standard)?");
		String materialType=sc.next();
		LOGGER.debug("Enter the total area of the house to be constructed?");
		double totalArea=sc.nextDouble();
		LOGGER.debug("Enter the type of automation(not automated/fully automated)");
		String autoType=sc.next();
		MaterialsRequired materialsRequired=new MaterialsRequired();
		try {
			LOGGER.debug("Total House Construction Cost: "+materialsRequired.calculateHouseConstructionCost(materialType,totalArea,autoType));
		} 
		catch (Exception e) {
			LOGGER.error(e);
		}
		finally
		{
			sc.close();
		}
	}

}