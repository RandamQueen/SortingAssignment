import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

//-------------------------------------------------------------------------
/**
 *  Test class for SortComparison.java
 *
 *  @author
 *  @version HT 2019
 */
@RunWith(JUnit4.class)
public class SortComparisonTest
{
    //~ Constructor ........................................................
    @Test
    public void testConstructor()
    {
        new SortComparison();
    }

    //~ Public Methods ........................................................

    // ----------------------------------------------------------
    /**
     * Check that the methods work for empty arrays
     */
    @Test
    public void testEmpty()
    {
    }

    @Test 
    public void testInsertion() 
    { 
    		new SortComparison(); 
    		double[] testArray = {3,4,10,17,1,2,5,12,9,0};
    		double [] correctArray = {0,1,2,3,4,5,9,10,12,17}; 
    		int size = testArray.length; 
    		testArray = SortComparison.insertionSort(testArray); 
    		assertEquals("The first elements are not equal",true,correctArray[0] == testArray[0] );
    		assertEquals("The last elements are not equal",true,correctArray[size-1] == testArray[size-1] );
    		assertArrayEquals(correctArray,  testArray); 
    }
    
      @Test 
    public void testQuick() 
    { 
    		new SortComparison(); 
    		double[] testArray = {3,4,10,17,1,2,5,12,9,0};
    		double [] correctArray = {0,1,2,3,4,5,9,10,12,17}; 
    		int size = testArray.length; 
    		testArray = SortComparison.quickSort(testArray); 
    		assertEquals("The first elements are not equal",true,correctArray[0] == testArray[0] );
    		assertEquals("The last elements are not equal",true,correctArray[size-1] == testArray[size-1] );
    		assertArrayEquals(correctArray,  testArray); 
    }
    
    @Test 
    public void testMergeIterative() 
    { 
    		new SortComparison(); 
    		double[] testArray = {3,4,10,17,1,2,5,12,9,0};
    		double [] correctArray = {0,1,2,3,4,5,9,10,12,17}; 
    		int size = testArray.length; 
    		testArray = SortComparison.mergeSortIterative(testArray); 
    		assertEquals("The first elements are not equal",true,correctArray[0] == testArray[0] );
    		assertEquals("The last elements are not equal",true,correctArray[size-1] == testArray[size-1] );
    		assertArrayEquals(correctArray,  testArray); 
    }
    
    @Test 
    public void testMergeRecursive() 
    { 
    		new SortComparison(); 
    		double[] testArray = {3,4,10,17,1,2,5,12,9,0};
    		double [] correctArray = {0,1,2,3,4,5,9,10,12,17}; 
    		int size = testArray.length; 
    		testArray = SortComparison.mergeSortRecursive(testArray); 
    		assertEquals("The first elements are not equal",true,correctArray[0] == testArray[0] );
    		assertEquals("The last elements are not equal",true,correctArray[size-1] == testArray[size-1] );
    		assertArrayEquals(correctArray,  testArray); 
    }

    
    @Test 
    public void testSelection() 
    { 
    		new SortComparison(); 
    		double[] testArray = {3,4,10,17,1,2,5,12,9,0};
    		double [] correctArray = {0,1,2,3,4,5,9,10,12,17}; 
    		int size = testArray.length; 
    		testArray = SortComparison.selectionSort(testArray); 
    		assertEquals("The first elements are not equal",true,correctArray[0] == testArray[0] );
    		assertEquals("The last elements are not equal",true,correctArray[size-1] == testArray[size-1] );
    		assertArrayEquals(correctArray,  testArray); 
    }
    
    // ----------------------------------------------------------
    /**
     *  Main Method.
     *  Use this main method to create the experiments needed to answer the experimental performance questions of this assignment.
     *
     */
    public static void main(String[] args)
    {
        //TODO: implement this method
    }

}
