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
        ArrayList<Integer> expected1 = new ArrayList<Integer>();
		 expected1 .add(4);
		 //expected.add(6);
		Assert.assertEquals(expected1,two2(list1)); 
		ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(1); 
        list2.add(100); 
        list2.add(202); 
        ArrayList<Integer> expected2 = new ArrayList<Integer>();
		 expected2 .add(200);
		 expected2.add(404);
		Assert.assertEquals(expected2,two2(list2)); 
		//1,100,202
	}

	public List<Integer> two2(ArrayList<Integer> arr) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for(int i=0;i<arr.size();i++)
		{
			
			int num = arr.get(i)*2;
			if(num%10 == 2 || num%100 == 2)
			{
				arr.remove(i);
				i--;
			}
			else 
				result.add(num);
		}
		
		return result;
	}

}
