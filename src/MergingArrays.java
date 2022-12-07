import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MergingArrays {

	public String mergingArray(int arr1[] ,int arr2[]) {
		
		
		int arr3[] = new int[arr1.length+arr2.length];
		int arr4[] = new int[2];
		int j=0;
		System.out.println("Elements in array 1 are ");
		for(int i=0;i<arr1.length;i++)
		{
			
				arr3[j]=arr1[i];
				j++;
		}
		
		for(int i=0;i<arr2.length;i++)
		{
				arr3[j]=arr2[i];
				j++;

		}
		System.out.println("\nElements in new array are :");
		for(int i=0;i<2;i++)
		{
			arr4[i] = arr3[i];
		}
		
		return Arrays.toString(arr4);
	}
	@Test
	public void mergingTwoArrays()
	{
		int a1[] = {};
		int a2[] = {6,7,10};
		Assert.assertEquals("[6,7]",mergingArray(a1, a2));
	}

}

