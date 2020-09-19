package hw1_0;

import java.util.ArrayList;

public class calculater {
	

private int t=0;


public ArrayList <settergetter> arr= new ArrayList<settergetter>();
public void addsg (settergetter sg) {
	arr.add(sg);
}

public void CalcPrices(Integer ItemCount, String ItemNname) {
	for (int i=0; i<arr.size();i++)
	{
		if (arr.get(i).name.equals(ItemNname)) {
			t+= ItemCount*(arr.get(i).price);
		}
	}
	
}
	public int total() {
		return t;
	}




}
