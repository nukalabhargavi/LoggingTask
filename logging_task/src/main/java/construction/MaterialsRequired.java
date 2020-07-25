package construction;

public class MaterialsRequired {
   String materialType;
   double totalArea;
   String autoType;
   MaterialsRequired(){}
   MaterialsRequired(String materialType,double totalArea,String autoType)
   {
	   this.materialType=materialType;
	   this.totalArea=totalArea;
	   this.autoType=autoType;
   }
   public String calculateHouseConstructionCost(String materialType, double totalArea, String autoType) throws Exception
   {
	   ConstrunctionOfHouse constructionCost=new  ConstrunctionOfHouse(materialType, totalArea, autoType);
	   return String.valueOf(constructionCost.computeCostOfHouseConstruction())+"INR";
   }
}

