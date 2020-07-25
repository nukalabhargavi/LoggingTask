package collections;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OperationPerform{
	Scanner sc=new Scanner(System.in);
	final Logger logger=LogManager.getLogger(OperationPerform.class);
	public void performAddInitialElements()
	{
		Addition addRecord=new Addition();	
		addRecord.addInitialElements();	
	}
	public void performAllOperations() throws Exception
	{
		String choice="";
	 do{
		logger.debug("Enter number of Operation You Want to Perform:");
		logger.debug("1.AddItem");
		logger.debug("2.RemoveItem");
		logger.debug("3.FetchItem");
		int option=sc.nextInt();
		if(option==1)
		{
			AdditionPerform performAdditionOperation=new AdditionPerform();
			performAdditionOperation.performAddOperation();
		}
		else if(option==2)
		{
			RemovePerform performRemovingOperation=new RemovePerform();	
			performRemovingOperation.performRemoveOperation();
		}
		else if(option==3)
		{
			FetchPerform performFetchingOperation=new FetchPerform();
			performFetchingOperation.performFetchOperation();
		}
		else
		{
			throw new InputMismatchException();
		}
		logger.debug("Do You want to Continue?(yes/no)");
	    choice=sc.next();
	 }while(choice.equals("yes"));
	}
	public static void main(String[] args) throws Exception {
		OperationPerform performOperations=new OperationPerform();
		performOperations.performAddInitialElements();
		performOperations.performAllOperations();
		
	}
}