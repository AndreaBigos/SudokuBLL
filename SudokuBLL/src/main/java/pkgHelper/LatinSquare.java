package pkgHelper;

import java.util.Arrays;

public class LatinSquare {
	
	private int[][] LatinSquare;
	
	public LatinSquare()
	{
	}
	
	public LatinSquare(int[][] latinSquare) {
		super();
		LatinSquare = latinSquare;
	}
	
	
	public int[][] getLatinSquare() {
		return LatinSquare;
	}


	public void setLatinSquare(int[][] latinSquare) {
		LatinSquare = latinSquare;
	}

	public boolean hasDuplicates(int[] arr)
	{
		boolean hasDuplicates=false;
		Arrays.sort(arr);
		if(arr==null)
			return false;
		for(int i =0; i<arr.length-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				hasDuplicates= true;
				break;
			}
		}
		return hasDuplicates;
	}
	
	public boolean doesElementExist(int[] arr, int iValue)
	{
		
		boolean doesElementExist=false;
		if(arr==null)
			return false;
		for(int i:arr)
		{
			if(i==iValue)
			{
				doesElementExist=true;
				break;
			}
		}
		return doesElementExist;
	}
	
	public boolean containsZero()
	{
		for(int iCol = 0; iCol < LatinSquare.length; iCol++)
		{
			for(int iRow = 0; iRow < LatinSquare.length; iRow++)
			{
				if(LatinSquare[iCol][iRow] == 0)
					return true;
			}
		}
		
		return false;
	}

	public int[] getColumn(int iCol)
	{
		int[] intColumn = new int[LatinSquare.length];
		for(int iColumn = 0; iColumn<LatinSquare.length; iColumn++)
		{
			intColumn[iColumn] = LatinSquare[iColumn][iCol];
		}
		
		return intColumn;
	
	}
	
	public int[] getRow(int Row)
	{
		int[] intRow = new int[LatinSquare.length];
		for(int iRow =0; iRow<LatinSquare[0].length; iRow++)
		{
			intRow[iRow] = LatinSquare[iRow][Row];
		}
		
		return intRow;
	}

	public boolean hasAllValuesint(int[] arr1, int[] arr2)
	{
		boolean hasAllValues = false;
		for(int i =0; i< arr1.length; i++)
		{
			for(int j=0; j<arr2.length; j++)
			{
				if(arr1[i]==arr2[j])
					hasAllValues= true;
			}
		}
		return hasAllValues;
	}

	public boolean isLatinSquare()
	{
		boolean isLatinSquare = false;		
		return isLatinSquare;
	}
	
	
	
}
