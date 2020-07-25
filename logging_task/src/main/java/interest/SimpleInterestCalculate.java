package interest;
public class SimpleInterestCalculate extends InterestCalculate {
	SimpleInterestCalculate(double principal, double rateOfInterest, double noOfYears) {
		super(principal, rateOfInterest, noOfYears);
	}

	public double computeSimpleInterest()
	{
	  return (principal*noOfYears*rateOfInterest)/100;
	}

}