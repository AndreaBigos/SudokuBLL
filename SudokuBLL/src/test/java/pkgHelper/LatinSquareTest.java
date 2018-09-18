package pkgHelper;

import static org.junit.Assert.*;

import java.util.Arrays;

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
	
	@Test
	public void hasAllValues_Test1()
	{
		int[] arr1 = {1,2,3};
		int[] arr2= {4,5,6};

		LatinSquare lq = new LatinSquare();
		assertFalse(lq.hasAllValues(arr1, arr2));
	}
	
	@Test
	public void hasAllValues_Test2()
	{
		int[] arr1 = {1,2,3};
		int[] arr2= {1,2,3};

		LatinSquare lq = new LatinSquare();
		assertTrue(lq.hasAllValues(arr1, arr2));
	}
	
	@Test
	public void hasAllValues_Test3()
	{
		int[] arr1 = null;
		int[] arr2= {1,2,3};

		LatinSquare lq = new LatinSquare();
		assertFalse(lq.hasAllValues(arr1, arr2));
	}
	
	@Test
	public void hasAllValues_Test4()
	{
		int[] arr1 = {1,2,3};
		int[] arr2= null;

		LatinSquare lq = new LatinSquare();
		assertFalse(lq.hasAllValues(arr1, arr2));
	}
	
	@Test
	public void hasAllValues_Test5()
	{
		int[] arr1 = {1,2,3,4,5};
		int[] arr2= {1,2,3};

		LatinSquare lq = new LatinSquare();
		assertFalse(lq.hasAllValues(arr1, arr2));
	}
	
	@Test
	public void getColumn_Test1() {
	
	int[][] mySquare = {{1,2,3,4},{4,3,2,1},{2,3,4,1},{3,4,1,2}};
	LatinSquare ls = new LatinSquare(mySquare);
	
	System.out.println(Arrays.toString(ls.getColumn(2)));
	}
	
	@Test
	public void getColumn_Test2() {

	int[][] mySquare = {{2,6,4},{3,2,1},{9,3,7},{7,8,9}};
	LatinSquare ls = new LatinSquare(mySquare);

	System.out.println(Arrays.toString(ls.getColumn(0)));
	}
	
	@Test
	public void getColumn_Test3() {
	
	int[][] mySquare = {{1,2,3,4},{4,3,2,1},{2,3,4,1},{3,4,1,2}};
	LatinSquare ls = new LatinSquare(mySquare);
	
	System.out.println(Arrays.toString(ls.getColumn(3)));
	}
	
	@Test
	public void containsZero_Test1() {
		int[][] mySquare = {{1,2,3},{3,2,1},{2,3,1}};
		
		LatinSquare ls = new LatinSquare(mySquare);
		
		assertFalse(ls.containsZero());
	}
	
	@Test
	public void containsZero_Test2() {
		int[][] mySquare = {{1,2,3},{3,0,1},{2,3,1}};
		
		LatinSquare ls = new LatinSquare(mySquare);
		assertTrue(ls.containsZero());
	}
	
	@Test
	public void containsZero_Test3() {
		int[][] mySquare = {{0,0,0},{0,0,0},{0,0,0}};
		
		LatinSquare ls = new LatinSquare(mySquare);
		assertTrue(ls.containsZero());
	}
	
	@Test
	public void isLatinSquare_Test1()
	{
		int[][] mySquare = {{6,3,2,4},{2,4,5,6},{6,5,7,3},{2,1,4,3}};
		LatinSquare ls = new LatinSquare(mySquare);
		assertFalse(ls.isLatinSquare());
	}
	
	@Test
	public void isLatinSquare_Test2()
	{
		int[][] mySquare = {{1,2,3,4},{2,3,4,1},{3,4,1,2},{4,1,2,3}};
		LatinSquare ls = new LatinSquare(mySquare);
		assertTrue(ls.isLatinSquare());
	}
	
	@Test
	public void isLatinSquare_Test3()
	{
		int[][] mySquare = {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
		LatinSquare ls = new LatinSquare(mySquare);
		assertFalse(ls.isLatinSquare());
	}
	
	@Test
	public void isLatinSquare_Test4()
	{
		int[][] mySquare = {{1,2,3,4},{5,6,7,8},{9,1,2,3},{4,5,6,7}};
		LatinSquare ls = new LatinSquare(mySquare);
		assertFalse(ls.isLatinSquare());
	}
	@Test
	public void getRow_test1()
	{
		int[][] mySquare = {{1,2,3,4},{5,6,7,8},{9,3,2,4},{4,3,2,1}};
		LatinSquare ls = new LatinSquare(mySquare);
		
		System.out.println(Arrays.toString(ls.getRow(0)));
	}
	
	@Test
	public void getRow_test2()
	{
		int[][] mySquare = {{4,5,2,3},{1,3,5,6},{8,7,6,5},{3,2,8,5}};
		LatinSquare ls = new LatinSquare(mySquare);
		
		System.out.println(Arrays.toString(ls.getRow(0)));
	}
	
	@Test
	public void getRow_test3()
	{
		int[][] mySquare = {{6,3,2,4},{2,4,5,6},{6,5,7,3},{2,1,4,3}};
		LatinSquare ls = new LatinSquare(mySquare);
		
		System.out.println(Arrays.toString(ls.getRow(3)));
	}
}
