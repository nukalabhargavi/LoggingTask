package collections;

public class AdditionPerform extends OperationPerform{

	public void performAddOperation()
	{
	  Addition addRecord=new Addition();
	  logger.debug("Enter the Id Number of the Student");
	  int idno=sc.nextInt();
	  logger.debug("Enter the Section Number of the Student");
	  int section=sc.nextInt();
	  logger.debug("Enter the Name of the Student");
	  String name=sc.next();
	  logger.debug("Enter the Branch in which the Student Enrolled");
	  String branch=sc.next();
	  addRecord.addItem(idno,section,name,branch);
	}
}
