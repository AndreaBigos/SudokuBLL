package pkgHelper;

import static org.junit.Assert.*;

import org.junit.Test;

public class LatinSquareTest {

	@Test
	public void hasDuplicates_test1() 
	{	
		int[] arr= {1,2,3,4,5};
		LatinSquare lq = new LatinSquare();
		assertFalse(lq.hasDuplicates(arr));
	}
	
	@Test
	public void hasDuplicates_test2() 
	{	
		int[] arr= {1,1,3,4,5};
		LatinSquare lq = new LatinSquare();
		assertTrue(lq.hasDuplicates(arr));
	}
	
	@Test
	public void hasDuplicates_test3() 
	{	
		int[] arr= {1,2,3,4,1};
		LatinSquare lq = new LatinSquare();
		assertTrue(lq.hasDuplicates(arr));
	}
	
	@Test
	public void hasDuplicates_test4() 
	{	
		int[] arr= null;
		LatinSquare lq = new LatinSquare();
		assertFalse(lq.hasDuplicates(arr));
	}
	
	@Test
	public void getRow_Test1()
	{
		int[][] mySquare = {{1,2,3,4},{5,6,7,8},{9,3,2,4},{3,2,8,5}};
		LatinSquare ls = new LatinSquare(mySquare);
		
		System.out.println(Arrays.toString(ls.getRow(2)));
		
	}
	@Test
	public void getRow_Test2()
	{
		int[][] mySquare = {{4,5,2,3},{1,3,5,6},{8,7,6,5},{4,3,2,1}};
		LatinSquare ls = new LatinSquare(mySquare);
		
		System.out.println(Arrays.toString(ls.getRow(0)));
		
	}
	
	@Test
	public void getRow_Test3()
	{
		int[][] mySquare = {{6,3,2,4},{2,4,5,6},{6,5,7,3},{2,1,4,3}};
		LatinSquare ls = new LatinSquare(mySquare);
		
		System.out.println(Arrays.toString(ls.getRow(3)));
		
	}
	
	@Test
	public void doesElementExist_Test1()
	{
		int[] arr = {1,2,3,4,5};
		int iValue=3;
		LatinSquare lq = new LatinSquare();
		assertTrue(lq.doesElementExist(arr, iValue));
	}
	
	@Test
	public void doesElementExist_Test2()
	{
		int[] arr = {1,2,3,4,5};
		int iValue=99;
		LatinSquare lq = new LatinSquare();
		assertFalse(lq.doesElementExist(arr, iValue));
	}
	
	@Test
	public void doesElementExist_Test3()
	{
		int[] arr = null;
		int iValue=1;
		LatinSquare lq = new LatinSquare();
		assertFalse(lq.doesElementExist(arr, iValue));
	}
	
}
