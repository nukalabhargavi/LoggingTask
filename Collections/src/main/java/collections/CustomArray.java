package collections;

import java.util.ArrayList;

public class CustomArray {
	int idno;
	int section;
	String name;
	String branch;
	CustomArray(int idno,int section,String name,String branch)
	{
		this.idno=idno;
		this.section=section;
		this.name=name;
		this.branch=branch;
	}
    static ArrayList<CustomArray> customList=new ArrayList<CustomArray>();
}