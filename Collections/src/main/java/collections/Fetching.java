package collections;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Fetching{
	final Logger logger=LogManager.getLogger(OperationPerform.class);
	public void fetchItem(int index)
	{
		logger.debug("IdNumber: {}.",CustomArray.customList.get(index).idno);
		logger.debug("SectionNumber: {}.",CustomArray.customList.get(index).section);
		logger.debug("Name: {}",CustomArray.customList.get(index).name);
		logger.debug("Branch: {}",CustomArray.customList.get(index).branch);
	}
}
