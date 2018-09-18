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
		if(arr==null)
			return false;
		Arrays.sort(arr);


		
		
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
		for(int iRow =0; iRow<LatinSquare.length; iRow++)
		{
			intRow[iRow] = LatinSquare[Row][iRow];
		}
		
		return intRow;
	}

		public boolean hasAllValues(int[] arr1, int[] arr2)
		{
			if(arr1==null||arr2==null)
				return false;
			boolean hasAllValues = false;
			if(arr1.length==arr2.length)
			{
			for(int i =0; i< arr1.length; i++)
			{
				for(int j=0; j<arr2.length; j++)
				{
					if(arr1[i]==arr2[j])
						hasAllValues= true;
				}
			}
			}
			return hasAllValues;
		
	}
	
		public boolean isLatinSquare()
		{
		
			boolean isLatinSquare = true;
			for(int i = 0; i< LatinSquare.length; i++)
			{
				for(int j =1; j < LatinSquare.length-1; j++)
				{
				if(!hasAllValues(getRow(i), getRow(j)))
					return false;
			}
			}
			for(int i = 0; i< LatinSquare.length; i++)
			{
				for(int j =1; j < LatinSquare.length-1; j++)
				{
				if(!hasAllValues(getColumn(i), getColumn(j)))
					return false;
			}
			}
			for (int i = 0; i < LatinSquare.length; i++) {
				if(hasDuplicates(getRow(i)))
					return false;
			}
			for (int j = 0; j < LatinSquare.length; j++) {
				if(hasDuplicates(getColumn(j)))
					return false;
			}
			return isLatinSquare;
	
		}
		}
