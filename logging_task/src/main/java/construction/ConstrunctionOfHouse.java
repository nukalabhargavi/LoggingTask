package construction;

import java.util.InputMismatchException;

public class ConstrunctionOfHouse extends MaterialsRequired
{

      ConstrunctionOfHouse(String materialType, double totalArea, String autoType) {
		super(materialType, totalArea, autoType);
	}

	public double computeCostOfHouseConstruction() throws InputMismatchException
	{
	  if(materialType.equals("standard"))
	  {
		  return totalArea*1200.00;
	  }
	  else if(materialType.equals("above standard"))
	  {
		  return totalArea*1500.00;  
	  }
	  else if(materialType.equals("high standard") && autoType.equals("fully automated"))
	  {
		  return totalArea*2500.00;    
	  }
	  else if(materialType.equals("high standard"))
	  {
		  return totalArea*1800.00;  
	  }
	  else
	  {
		throw new InputMismatchException("Materials Required are not Available in the Market");  
	  }
	}
}
