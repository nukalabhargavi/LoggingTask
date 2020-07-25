package collections;

public class FetchPerform extends OperationPerform{
	
	public void performFetchOperation()
	{
		Fetching fetchRecord=new Fetching();
		logger.debug("Enter the Index of the Record to be Fetched");
		int index=sc.nextInt();
		fetchRecord.fetchItem(index);
	}
}