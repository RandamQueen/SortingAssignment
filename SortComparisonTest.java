import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


/* Average time taken to perform sort. Each time is in milliseconds. 
 * 
 *  --------------------------------------------------------------------
 * |  file type  | Insert  |  Quick  | Merge Rec  | Merge Ite | Select |	
 * |--------------------------------------------------------------------
 * |  10 random	 |   0    |	   0     |     0      |     0     |   0    |
 * |--------------------------------------------------------------------
 * |  100 random |    0    |   0     |     0      |     0     |   0    |
 * |--------------------------------------------------------------------
 * | 1000 random |   23.6  |   1     |     1      |     1     |   15   |
 * |--------------------------------------------------------------------
 * | 1000 Dup	 |   18    |   1     |     1      |     1     |  14.6  |
 * |--------------------------------------------------------------------
 * |1000 nearOrd |  15.3   |   1     |     1      |     1     |  16.6  |
 * |--------------------------------------------------------------------
 * | 1000 rever	 |    18   |  12.6   |     1      |     1     |   16   |
 * |--------------------------------------------------------------------
 * | 1000 sorted |   16    |   6     |     1      |     1     |   14   |
 * |--------------------------------------------------------------------
 * 
 * Questions: 
	a. Which of the sorting algorithms does the order of input have an impact on? Why?
	   The algorithms that are affected by the input size are insertion sort and selection
	   sort. These is to do with the nested loop structure. Both sorts have two nested for 
	   loops, that will grow in relation to the size of the input.These cases a growth 
	   in the in run time of the sorts. 
	
	b. Which algorithm has the biggest difference between the best and worst performance,
	 based on the type of input, for the input of size 1000? Why?
	 In my opinion, according to the results, that would be Quick sort would have
	 the biggest different between performance based on the input type. This is because
	  in most cases, quick sort has a running time of one. However, this jumps by a lot
	  for reverse order and a presorted arrays. These are the worst cases. 

	c. Which algorithm has the best/worst scalability, i.e., the difference in performance time
	based on the input size? Please consider only input files with random order for this answer.
	Merge sort. Quick sort runs into issues with rever and sorted array than could affect the 
	scalability of the sort in this context.  
	
	d. Did you observe any difference between iterative and recursive implementations of merge
	sort?
	There was some minor differents in the running times. In a few tests, the recursive function 
	would have a running time that was larger than the norm. This was seen at an outlinear, but 
	it is still someithing to note. 
	
	e. Which algorithm is the fastest for each of the 7 input files? 
	Mergesort. This is in line with the believe that merge is used for primitives. 

*/

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
    		new SortComparison(); 
		double[] testArray = {};
		assertEquals("Test to see what happens when we have an empty array",0, testArray.length  );
		testArray = SortComparison.insertionSort(testArray); 
		assertEquals("Insertion empty test",0, testArray.length  );
		testArray = SortComparison.quickSort(testArray); 
		assertEquals("Quick empty test",0, testArray.length  );
		testArray = SortComparison.mergeSortRecursive(testArray); 
		assertEquals("Merge recursive empty test",0, testArray.length);
		testArray = SortComparison.mergeSortIterative(testArray); 
		assertEquals("Merge Iterative empty test",0, testArray.length );
		testArray = SortComparison.selectionSort(testArray); 
		assertEquals("Selection empty test",0, testArray.length);
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
    		assertEquals("The middle elements are not equal",true,correctArray[size/2] == testArray[size/2]);
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
    		assertEquals("The middle elements are not equal",true,correctArray[size/2] == testArray[size/2]);
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
		assertEquals("The middle elements are not equal",true,correctArray[size/2] == testArray[size/2]);
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
    		assertEquals("The middle elements are not equal",true,correctArray[size/2] == testArray[size/2]);
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
    		assertEquals("The middle elements are not equal",true,correctArray[size/2] == testArray[size/2]); 
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
