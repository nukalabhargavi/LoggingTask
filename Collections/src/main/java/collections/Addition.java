package collections;

public class Addition
{
	int[] idnum= {1,2,3,4,5,6,7,8,9,10};
	int[] sectionNumbers= {1,1,1,1,2,2,2,3,3,3};
	String[] names= {"Bhargavi","Swetha","Raveena","Sadhana","Bonu","Jyosthana","Yogitha","Sreya","Vaishnavi","Roshini"};
	String[] branches= {"CSE","EEE","CSE","EEE","CSE","CSE","EEE","ECE","CSE","CSE"};
 	public void addInitialElements()
	{
		for(int items=0;items<10;items++)
		{
		  CustomArray.customList.add(new CustomArray(idnum[items],sectionNumbers[items],names[items],branches[items]));
		}
	}
	public void addItem(int idNumber,int sectionNumber,String name,String branch)
	{
		 CustomArray.customList.add(new  CustomArray(idNumber,sectionNumber,name,branch));
	}

}