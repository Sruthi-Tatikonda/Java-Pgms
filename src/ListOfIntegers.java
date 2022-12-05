import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;


public class ListOfIntegers {

	@Test
	public void listOfInt()
	{
		ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1); 
        list1.add(2); 
        list1.add(6); 
        ArrayList<Integer> expected = new ArrayList<Integer>();
		 expected .add(4);
		 //expected.add(6);
		Assert.assertEquals(expected,two2(list1)); 
	}

	public List<Integer> two2(ArrayList<Integer> list2) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for(int i=0;i<list2.size();i++)
		{
			
			int num = list2.get(i)*2;
			if(num%10 == 2)
			{
				list2.remove(i);
				i--;
			}
			else 
				result.add(num);
		}
		
		return result;
	}

}
