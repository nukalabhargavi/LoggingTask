package collections;

public class RemovePerform extends OperationPerform{
	public void performRemoveOperation()
	{
		Removing removeRecord=new Removing();
		logger.debug("Enter the Index of the Record to be Removed");
		int index=sc.nextInt();
		removeRecord.removeItem(index);
	}

}
