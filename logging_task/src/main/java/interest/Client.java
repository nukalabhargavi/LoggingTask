package interest;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Client {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		final Logger LOGGER=LogManager.getLogger(Client.class);
		LOGGER.debug("Enter the Principal Amount?");
		double principal=sc.nextDouble();
		LOGGER.debug("Enter Rate of Interest?");
		double rateOfInterest=sc.nextDouble();
		LOGGER.debug("Enter the Number of Years?");
		double noOfYears=sc.nextDouble();
		InterestCalculate interestCalculation=new InterestCalculate();
		try {
			LOGGER.debug("Simple Interest: "+interestCalculation.getSimpleInterest(principal,rateOfInterest,noOfYears));
			LOGGER.debug("Compound Interest: "+interestCalculation.getCompoundInterest(principal,rateOfInterest,noOfYears));
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