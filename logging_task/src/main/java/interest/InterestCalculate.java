package interest;
public class InterestCalculate{
	double principal;
	double rateOfInterest;
	double noOfYears;
	InterestCalculate(){}
	InterestCalculate(double principal,double rateOfInterest,double noOfYears)
	{
		this.principal=principal;
		this.rateOfInterest=rateOfInterest;
		this.noOfYears=noOfYears;
	}
	public String getSimpleInterest(double principal, double rateOfInterest, double noOfYears)
	{
	  SimpleInterestCalculate simpleInterest=new SimpleInterestCalculate(principal, rateOfInterest, noOfYears);
	  return String.valueOf(simpleInterest.computeSimpleInterest())+"Rs/-";
	}
	public String getCompoundInterest(double principal, double rateOfInterest, double noOfYears)
	{
	  CompoundInterestCalculate compoundInterest=new CompoundInterestCalculate(principal, rateOfInterest, noOfYears);
	  return String.valueOf(compoundInterest.computeCompoundInterest())+"Rs/-";
	}
	
}