package interest;

public class CompoundInterestCalculate extends InterestCalculate {

	CompoundInterestCalculate(double principal, double rateOfInterest, double noOfYears) {
		super(principal, rateOfInterest, noOfYears);
	}
	public double computeCompoundInterest()
	{
		double Amount=(principal)*(Math.pow((1+((rateOfInterest)/100)), noOfYears));
		return Amount-principal;
	}
}
