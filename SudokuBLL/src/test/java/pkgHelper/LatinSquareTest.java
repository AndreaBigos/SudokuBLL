package pkgHelper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import pkgGame.Sudoku;

public class LatinSquareTest {

//	@Test
//	public void hasDuplicates_test1() {
//
//		LatinSquare LS = new LatinSquare();
//		int[] arr = { 1, 3, 5, 2, 4 };
//
//		boolean bHasDuplicates = LS.hasDuplicates(arr);
//
//		assertEquals(bHasDuplicates, false);
//
//	}
//
//	@Test
//	public void hasDuplicates_test2() {
//
//		LatinSquare LS = new LatinSquare();
//		int[] arr = { 1, 3, 5, 2, 3 };
//
//		boolean bHasDuplicates = LS.hasDuplicates(arr);
//
//		assertEquals(bHasDuplicates, true);
//
//	}
//
//	@Test
//	public void doesElementExist_Test1() {
//		LatinSquare LS = new LatinSquare();
//		int[] arr = { 1, 3, 5, 2, 4 };
//		int iValue = 3;
//		boolean bdoesElementExist = LS.doesElementExist(arr, iValue);
//
//		assertEquals(bdoesElementExist, true);
//	}
//
//	@Test
//	public void doesElementExist_Test2() {
//		LatinSquare LS = new LatinSquare();
//		int[] arr = { 1, 3, 5, 2, 4 };
//		int iValue = 99;
//		boolean bdoesElementExist = LS.doesElementExist(arr, iValue);
//
//		assertEquals(bdoesElementExist, false);
//	}
//
//	@Test
//	public void hasAllValues_Test1() {
//		LatinSquare LS = new LatinSquare();
//		int[] arr1 = { 1, 2, 3 };
//		int[] arr2 = { 3, 2, 1 };
//
//		boolean bhasAllValues = LS.hasAllValues(arr1, arr2);
//
//		assertEquals(bhasAllValues, true);
//
//	}
//
//	@Test
//	public void hasAllValues_Test2() {
//		LatinSquare LS = new LatinSquare();
//		int[] arr1 = { 1, 2, 3 };
//		int[] arr2 = { 3, 2, 99 };
//
//		boolean bhasAllValues = LS.hasAllValues(arr1, arr2);
//
//		assertEquals(bhasAllValues, false);
//
//	}
//
//	@Test
//	public void getColumn_Test1() {
//		
//		int[][] MySquare = { { 1, 2, 3 }, { 3, 1, 2 }, { 2, 3, 1 } };
//
//		LatinSquare LS = new LatinSquare(MySquare);
//		int [] ExpectedCol = {2,1,3};
//		int [] Col = LS.getColumn(1);
//		
//		assertTrue(Arrays.equals(ExpectedCol, Col));
//		System.out.println(Arrays.toString(Col));
//	}
//	
//	@Test
//	public void getRow_Test1() {
//		
//		int[][] MySquare = { { 1, 2, 3 }, { 3, 1, 2 }, { 2, 3, 1 } };
//
//		LatinSquare LS = new LatinSquare(MySquare);
//		int [] ExpectedRow = {3,1,2};
//		int [] Row = LS.getRow(1);
//		
//		assertTrue(Arrays.equals(ExpectedRow, Row));
//		System.out.println(Arrays.toString(Row));
//	}
//	
//	@Test
//	public void isLatinSquare_Test1() {
//		
//		int[][] MySquare = { { 1, 2, 3 }, { 3, 1, 2 }, { 2, 3, 1 } };
//
//		LatinSquare LS = new LatinSquare(MySquare);
//		
//		assertTrue(LS.isLatinSquare());
//	}
//	
//	@Test
//	public void isLatinSquare_Test2() {
//		
//		int[][] MySquare = { { 1, 2, 3 }, { 3, 1, 2 }, { 4, 5, 6 } };
//
//		LatinSquare LS = new LatinSquare(MySquare);
//		
//		assertFalse(LS.isLatinSquare());
//	}
	
//	@Test
//	public void isPartialSoduko_test1()
//	{
//		int[][] mySquare = {{0,1,2,3},{2,3,1,0},{1,0,3,2},{3,2,0,1}};
//		Sudoku ls = new Sudoku(mySquare);
//		assertTrue(ls.isPartialSudoku());
//	}
//	
//	@Test
//	public void isPartialSoduko_test2()
//	{
//		int[][] mySquare = {{0,2,3,4},{1,0,3,4},{1,2,0,4},{1,2,3,0}};
//		Sudoku ls = new Sudoku(mySquare);
//		assertTrue(ls.isPartialSudoku());
//	}
//	
//	@Test
//	public void isPartialSoduko_test3()
//	{
//		int[][] mySquare = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
//		Sudoku ls = new Sudoku(mySquare);
//		assertFalse(ls.isPartialSudoku());
//	}
	
	@Test
	public void isSudoku_test1()
	{
		int[][] mySquare = {{1,2,3},{3,1,2},{2,3,1}};
		Sudoku ls = new Sudoku(mySquare);
		assertTrue(ls.isSudoku());
	}
	
	@Test
	public void isSudoku_test2()
	{
		int[][] mySquare = {{1,2,1},{1,1,2},{1,3,1}};
		Sudoku ls = new Sudoku(mySquare);
		assertFalse(ls.isSudoku());
	}
	
	@Test
	public void isSudoku_test3()
	{
		int[][] mySquare = {{1,2,3,4},{4,3,2,1},{2,1,4,3},{3,4,1,2}};
		Sudoku ls = new Sudoku(mySquare);
		assertTrue(ls.isSudoku());
	}
	
	@Test
	public void isPartialSudoku_test1()
	{
		int[][] mySquare = {{0,2,3,4},{4,0,2,1},{2,1,0,3},{3,4,1,0}};
		Sudoku ls = new Sudoku(mySquare);
		assertTrue(ls.isSudoku());
	}
	
	@Test
	public void isPartialSudoku_test2()
	{
		int[][] mySquare = {{1,2,3,4},{4,3,2,1},{2,1,4,3},{3,4,1,2}};
		Sudoku ls = new Sudoku(mySquare);
		assertFalse(ls.isSudoku());
	}
	
	@Test
	public void isPartialSudoku_test3()
	{
		int[][] mySquare = {{1,2,3,0},{0,3,2,1},{2,0,1,3},{3,1,0,2}};
		Sudoku ls = new Sudoku(mySquare);
		assertTrue(ls.isSudoku());
	}
	
	@Test 
	public void isValueValid_test1()
	{
		int[][] mySquare = {{1,0,2,3},{0,1,4,2},{2,3,1,0},{4,2,0,1}};
		Sudoku ls = new Sudoku(mySquare);
		int iCol =1;
		int iRow =0;
		int iValue = 4;
		assertTrue(ls.isValueValid(iValue, iCol, iRow));
	}
	
	@Test 
	public void isValueValid_test2()
	{
		int[][] mySquare = {{1,0,2,3},{0,1,4,2},{2,3,1,0},{4,2,0,3}};
		Sudoku ls = new Sudoku(mySquare);
		int iCol =0;
		int iRow =1;
		int iValue = 3;
		assertTrue(ls.isValueValid(iValue, iCol, iRow));
	}
	
	@Test 
	public void isValueValid_test3()
	{
		int[][] mySquare = {{1,0,2,3},{0,1,4,2},{2,3,1,0},{4,2,0,3}};
		Sudoku ls = new Sudoku(mySquare);
		int iCol =3;
		int iRow =2;
		int iValue = 4;
		assertFalse(ls.isValueValid(iValue, iCol, iRow));
	}
	
	@Test 
	public void isValueValid_test4()
	{
		int[][] mySquare = {{1,0,2,3},{0,1,4,2},{2,3,1,0},{4,2,0,3}};
		Sudoku ls = new Sudoku(mySquare);
		int iCol =2;
		int iRow =3;
		int iValue = 2;
		assertFalse(ls.isValueValid(iValue, iCol, iRow));
	}
	
	@Test
	public void getRegion_test1()
	{
		int[][] mySquare = {{1,2,3,4},{4,3,2,1},{2,1,4,3},{3,4,1,2}};
		Sudoku ls=new Sudoku(mySquare);
		System.out.println(ls.getRegion(0));
		
	}
	
	@Test
	public void getRegion_test2()
	{
		int[][] mySquare = {{1,2,3,4},{4,3,2,1},{2,1,4,3},{3,4,1,2}};
		Sudoku ls=new Sudoku(mySquare);
		System.out.println(ls.getRegion(1));
		
	}
	@Test
	public void getRegion_test3()
	{
		int[][] mySquare = {{1,2,3,4},{4,3,2,1},{2,1,4,3},{3,4,1,2}};
		Sudoku ls=new Sudoku(mySquare);
		System.out.println(ls.getRegion(2));		
	}
	
	@Test
	public void getRegion_test4()
	{
		int[][] mySquare = {{1,2,3,4},{4,3,2,1},{2,1,4,3},{3,4,1,2}};
		Sudoku ls=new Sudoku(mySquare);
		System.out.println(ls.getRegion(1,2));		
	}
	
	@Test
	public void getRegion_test5()
	{
		int[][] mySquare = {{1,2,3,4},{4,3,2,1},{2,1,4,3},{3,4,1,2}};
		Sudoku ls=new Sudoku(mySquare);
		System.out.println(ls.getRegion(0,1));		
	}
	
	@Test
	public void getRegion_test6()
	{
		int[][] mySquare = {{1,2,3,4},{4,3,2,1},{2,1,4,3},{3,4,1,2}};
		Sudoku ls=new Sudoku(mySquare);
		System.out.println(ls.getRegion(3,0));		
	}
}